package menu;

// Custom Libraries
import common.array;
import common.employee;
import stack.stack;

// Build-in libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class stackMenu {

    public static void menu() throws InputMismatchException{
        // Set the variables
        int iStackLength;

        // Set the objects
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("\n\n=> Define the stack length: ");

            try{
                iStackLength = in.nextInt();
                break;
            }
            catch(InputMismatchException error){
                System.out.print("(error) Invalid length");
                in.next(); // clear scanner wrong input
            }
        }

        // Create and initialize the stack object with the predefined user input length
        stack Stack = new stack(iStackLength);
        // Define stack objects
        employee[] stackArray = Stack.getEmployeeArray();
        int stackElements = Stack.getElements();

        outer: // label while loop
        while(true){
            System.out.println(String.format("\n\nCurrent stack length => (%d)", iStackLength));
            System.out.println("\n1. Add user data");
            System.out.println("2. Delete latest user data");
            System.out.println("3. Display the current stack");
            System.out.println("4. Exit to the main menu\n");
            System.out.print("=> ");

            try{
                int iUserSelection = in.nextInt();

                switch (iUserSelection){

                    case 1:
                        // (Pre-condition #1) check if the final position in the array object is not null
                        if(stackArray[stackElements -1] != null){

                            int code = stackArray[Stack.getClosestBusyIndex()].getCode();
                            String name = stackArray[Stack.getClosestBusyIndex()].getName();
                            String turn = stackArray[Stack.getClosestBusyIndex()].getTurn();

                            System.out.println("\n(info) The stack is full, discarding the last element:");
                            System.out.println(
                                    String.format("\n- code: %d\n- name: %s\n- turn: %s\n", code, name, turn));

                            stackArray[stackElements -1] = null;
                            Stack.addSingleUser();
                        }
                        else{
                            // (Pre-condition #2) Find the closest index available from right to left
                            Stack.addSingleUser();
                        }

                        break;

                    case 2:
                            if(!array.theArrayIsNull(stackArray)){
                                inner: // label while loop
                                while(true){
                                    // Get information to the user to be deleted
                                    int code = stackArray[Stack.getClosestBusyIndex()].getCode();
                                    String name = stackArray[Stack.getClosestBusyIndex()].getName();
                                    String turn = stackArray[Stack.getClosestBusyIndex()].getTurn();

                                    System.out.println(
                                            String.format("\nThe following data will be erased: " +
                                                            "\n\n- code: %d\n- name: %s\n- turn: %s\n",
                                                    code, name, turn));

                                    System.out.println("Do you want to continue?\n");
                                    System.out.println("1. Yes");
                                    System.out.println("2. No\n");
                                    System.out.print("=> ");

                                    try{
                                        int iSelection = in.nextInt();

                                        switch (iSelection){
                                            case 1:
                                                Stack.deleteSingleUser();
                                                break inner;
                                            case 2:
                                                break inner;
                                            default:
                                                System.out.print("(error) Invalid option\n");
                                                break;
                                        }
                                    }
                                    catch(InputMismatchException error){
                                        System.out.print("\n(error) Invalid length");
                                        in.next(); // clear scanner wrong input
                                    }
                                }
                            }
                            else{
                                System.out.println("\n(info) The stack is empty, please add a user");
                            }

                        break;

                    case 3:
                        // Display array content
                        if(!array.theArrayIsNull(stackArray)){

                            System.out.print("\n");
                            for(int i=0; i < stackArray.length; i++){

                                try{
                                    int code = stackArray[i].getCode();
                                    String name = stackArray[i].getName();
                                    String turn = stackArray[i].getTurn();

                                    System.out.println(
                                            String.format("| index(%d) => code=%d | name=%s | turn=%s  |",
                                                    i, code, name, turn));
                                }
                                catch(NullPointerException error){
                                    // some element is null
                                    break;
                                }
                            }

                        }
                        else{
                            System.out.println("\n(info) Nothing to display, the stack is empty");
                            System.out.println("(info) Please add some users");
                        }


                        break;

                    case 4:
                        break outer;
                    default:
                        System.out.print("(error) Invalid option\n");
                        break;
                }
            }
            catch(InputMismatchException error){
                System.out.print("(error) Invalid length\n");
                in.next(); // clear scanner wrong input
            }
        }

    }

}
