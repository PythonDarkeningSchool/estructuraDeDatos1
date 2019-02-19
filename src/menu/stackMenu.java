package menu;

import common.employee;
import common.exception;
import stack.stack;

import java.util.Scanner;
import java.util.InputMismatchException;

public class stackMenu {

    public static void main(String[] args) throws InputMismatchException{
        // Set the variables
        boolean bStack = false, bExit = false;
        int iStackLength;

        // Set the objects
        Scanner in = new Scanner(System.in);

        while(!bStack){
            System.out.print("\n=> Define the stack length: ");

            try{
                iStackLength = in.nextInt();
                bStack = true;
            }
            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid length");
                in.next(); // clear scanner wrong input
            }
        }

        // Create and initialize the stack object with the predefined user input length
        stack Stack = new stack(iStackLength);
        // Define stack objects
        employee[] stackArray = Stack.getEmployeeArray();
        int stackElements = Stack.getElements();

        outer: // label while loop
        while(!bExit){
            System.out.println("\n1. Add user data");
            System.out.println("2. Delete latest user data");
            System.out.println("3. Exit\n");
            System.out.println("=> ");

            try{
                int iUserSelection = in.nextInt();

                switch (iUserSelection){

                    case 1:
                        // (Pre-condition #1) check if the final position in the array object is not null
                        if(stackArray[stackElements -1] != null){
                            System.out.println(
                                    String.format("The array is full, discarding the last element: (%s)",
                                            stackArray[stackElements -1]));
                            stackArray[stackElements -1] = null;
                            Stack.addSingleUser(stackElements -1);
                        }
                        else{
                            // (Pre-condition #2) Find the closest index available from right to left
                            Stack.addSingleUser();
                        }
                        break;

                    case 2:
                            // (Pre-condition #1) - the array is empty
                            // FALTA ESTA CONDICION


                            //(Pre-condition #2) -  the array has some values
                            boolean bDelete = false;
                            inner: // label while loop
                            while(!bDelete){
                                System.out.println(
                                        String.format("The following data will be erased: (%s)",
                                                stackArray[Stack.getClosestBusyIndex()]));
                                System.out.println("Do you want to continue?\n");
                                System.out.println("1. Yes");
                                System.out.println("2. No\n");
                                System.out.println("=> ");

                                try{
                                    int iSelection = in.nextInt();

                                    switch (iSelection){
                                        case 1:
                                            Stack.deleteSingleUser();
                                            break;
                                        case 2:
                                            break inner;
                                         default:
                                             System.out.print("\n(error) Invalid option");
                                             break;
                                    }
                                }
                                catch(InputMismatchException error){
                                    System.out.print("\n(error) Invalid length");
                                    in.next(); // clear scanner wrong input
                                }
                            }
                        break;
                    case 3:
                        bExit = true;
                        break outer;
                    default:
                        System.out.print("\n(error) Invalid option");
                        break;
                }
            }
            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid length");
                in.next(); // clear scanner wrong input
            }
        }

    }

}
