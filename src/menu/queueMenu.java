package menu;

// Custom Libraries
import common.array;
import common.employee;
import queue.queue;

// Build-in libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class queueMenu {

    public static void menu() throws InputMismatchException{
        // Set the variables
        int iQueueLength;

        // Set the objects
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("\n\n=> Define the queue length: ");

            try{
                iQueueLength = in.nextInt();
                break;
            }
            catch(InputMismatchException error){
                System.out.print("(error) Invalid length");
                in.next(); // clear scanner wrong input
            }
        }

        // Create and initialize the queue object with the predefined user input length
        queue queue = new queue(iQueueLength);
        // Define queue objects
        employee[] queueArray = queue.getEmployeeArray();
        int queueElements = queue.getElements();

        outer: // label while loop
        while(true){
            System.out.println(String.format("\n\nCurrent queue length => (%d)", iQueueLength));
            System.out.println("\n1. Add user data");
            System.out.println("2. Delete first user data");
            System.out.println("3. Display the current queue");
            System.out.println("4. Exit to the main menu\n");
            System.out.print("=> ");

            try{
                int iUserSelection = in.nextInt();

                switch (iUserSelection){

                    case 1:
                        // (Pre-condition #1) check if the last position in the array object is not null
                        if(queueArray[queueElements -1] != null){

                            /*int code = queueArray[0].getCode();
                            String name = queueArray[0].getName();
                            String turn = queueArray[0].getTurn();
                            // Discard the first element and move the others one position to the left
                            System.out.println("\n(info) The queue is full, discarding the first element:");
                            System.out.println(
                                    String.format("\n- code: %d\n- name: %s\n- turn: %s\n", code, name, turn));

                            // Delete the first user in the array
                            queue.deleteSingleUser();
                            queue.moveArrayElementsOnePositionLeft();
                            queue.addSingleUser();*/
                            System.out.println("\nThe queue is full, please delete a user");
                        }
                        else{
                            // (Pre-condition #2) Find the closest index available from left to right
                            queue.addSingleUser();
                        }

                        break;

                    case 2:
                        if(!array.theArrayIsNull(queueArray)){
                            inner: // label while loop
                            while(true){
                                // Get information to the user to be deleted
                                int code = queueArray[0].getCode();
                                String name = queueArray[0].getName();
                                String turn = queueArray[0].getTurn();

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
                                            queue.deleteSingleUser();
                                            queue.moveArrayElementsOnePositionLeft();
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
                            System.out.println("\n(info) The queue is empty, please add a user");
                        }

                        break;

                    case 3:
                        // Display array content
                        if(!array.theArrayIsNull(queueArray)){

                            System.out.print("\n");
                            for(int i=0; i < queueArray.length; i++){

                                try{
                                    int code = queueArray[i].getCode();
                                    String name = queueArray[i].getName();
                                    String turn = queueArray[i].getTurn();

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
                            System.out.println("\n(info) Nothing to display, the queue is empty");
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
