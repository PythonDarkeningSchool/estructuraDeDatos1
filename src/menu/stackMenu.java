package menu;

import common.employee;
import common.exception;
import stack.stack;

import java.util.Scanner;
import java.util.InputMismatchException;

public class stackMenu {

    public static void main(String[] args) throws InputMismatchException{
        // Set the variables
        boolean bStack = false;
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
        while(){
            System.out.println("\n1. Add user data");
            System.out.println("2. Delete user data");

            try{
                int iUserSelection = in.nextInt();

                switch (iUserSelection){

                    case 1:
                        // (Pre-condition #1) check if the final position in the array object is not null
                        if(stackArray[stackElements -1] != null){
                            employee discardedUser = stackArray[stackElements -1];
                            System.out.println(
                                    String.format("The array is full, discarding the last element: (%s)", discardedUser));
                            stackArray[stackElements -1] = null;
                            Stack.addSingleUser(stackElements -1);
                        }

                        // (Pre-condition #2) checar el funcionamiento
                        break outer;
                    case 2:
                        break outer;
                    case 3:
                        option = false;
                        break;
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
