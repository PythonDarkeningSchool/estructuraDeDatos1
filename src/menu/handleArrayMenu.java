package menu;

// Custom Libraries
import common.array;
import common.employee;
import handleArray.handleArray;

// Build-in libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class handleArrayMenu {

    private static void showArray(employee[] arrayList){
        // Display array content
        if(!array.theArrayIsNull(arrayList)){

            System.out.print("\n");
            for(int i=0; i < arrayList.length; i++){

                try{
                    int code = arrayList[i].getCode();
                    String name = arrayList[i].getName();
                    String turn = arrayList[i].getTurn();

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
            System.out.println("\n(info) Nothing to display, the array is empty");
            System.out.println("(info) Please add some users");
        }
    }

    public static void menu() throws InputMismatchException{
        // Set the variables
        int iArrayLength;

        // Set the objects
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("\n\n=> Define the array length: ");

            try{
                iArrayLength = in.nextInt();
                break;
            }
            catch(InputMismatchException error){
                System.out.print("(error) Invalid length");
                in.next(); // clear scanner wrong input
            }
        }

        // Create and initialize the array object with the predefined user input length
        handleArray Array = new handleArray(iArrayLength);
        // Define array objects
        employee[] arrayList = Array.getEmployeeArray();
        int arrayElements = Array.getElements();

        outer: // label while loop
        while(true){
            System.out.println(String.format("\n\nCurrent array length => (%d)", iArrayLength));
            System.out.println("\n1. Add user data");
            System.out.println("2. Delete a user data");
            System.out.println("3. Update a user data");
            System.out.println("4. Replace a user data");
            System.out.println("5. Display the current array");
            System.out.println("6. Exit to the main menu\n");
            System.out.print("=> ");

            try{
                int iUserSelection = in.nextInt();

                switch (iUserSelection){

                    case 1:
                        // (Add user data)
                        // (Pre-condition #1) check if the final position in the array object is not null
                        if(arrayList[arrayElements -1] != null){
                            System.out.println("\n(info) The array is full, please delete a user");
                        }
                        else{
                            // (Pre-condition #2) Find the closest index available from left to right
                            Array.addSingleUser();
                        }

                        break;

                    case 2:
                        // (Delete a user data)
                        if(!array.theArrayIsNull(arrayList)){
                            inner: // label while loop
                            while(true){
                                System.out.print("\n\nThe current array data is:\n");
                                showArray(arrayList);
                                System.out.print("\nType the index to be deleted: ");

                                try{
                                    int iIndex = in.nextInt();

                                    // Check index in range
                                    if(iIndex > 0 && iIndex < arrayList.length){
                                        // Show information of the user to be deleted
                                        int code = arrayList[iIndex].getCode();
                                        String name = arrayList[iIndex].getName();
                                        String turn = arrayList[iIndex].getTurn();

                                        System.out.println("\nThe following user data will be deleted: ");
                                        System.out.println(
                                                String.format("\n- code: %d\n- name: %s\n- turn: %s\n", code, name, turn));
                                    }

                                    System.out.println("Do you want to continue?\n");
                                    System.out.println("1. Yes");
                                    System.out.println("2. No\n");
                                    System.out.print("=> ");

                                    try{
                                        int iSelection = in.nextInt();

                                        switch (iSelection){
                                            case 1:
                                                Array.deleteSingleUserByIndex(iIndex);
                                                break inner;
                                            case 2:
                                                break inner;
                                            default:
                                                System.out.print("(error) Invalid option\n");
                                                break;
                                        }
                                    }
                                    catch(InputMismatchException error){
                                        System.out.print("\n(error) Invalid option");
                                        in.next(); // clear scanner wrong input
                                    }
                                }
                                catch(InputMismatchException | NullPointerException error){
                                    System.out.print("\n(error) Invalid index");
                                    in.next(); // clear scanner wrong input
                                }
                            }
                        }
                        else{
                            System.out.println("\n(info) The array is empty, please add a user");
                        }

                        break;

                    case 3:
                        showArray(arrayList);
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
