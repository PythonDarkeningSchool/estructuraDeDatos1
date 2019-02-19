package arrays;

// standard libraries
import java.util.Scanner;

public class arrays_insert_element_left_right {

    public static void main(String[] args){

        int dataInput, arrayPlaces = 6;

        /*COMMENT/UNCOMMENT THIS DATA TO SEE HOW THE PROGRAM WORKS*/
        //int[] array = new int[arrayPlaces]; // declare an array with 6 empty spaces
        /*COMMENT/UNCOMMENT THIS DATA TO SEE HOW THE PROGRAM WORKS*/
        int[] array = {2, 0, 0 ,0, 0, 1}; // declare an array with 1 empty space

        // initializing the scanner as an object
        Scanner s=new Scanner(System.in);

        // System.out.println(Arrays.toString(array)); // print the content of the array

        System.out.println("\n== Left to right insertion ==\n");

        // iterating over the array in order to fill out (if any)
        for(int i=0; i < array.length; i++){
            // check if the array is full
            if(!arraysTools.theArrayIsFull(array)) {
                // the array is not full
                System.out.print("(input) Type the data for the position (#" + i + ") for the array: ");
                dataInput = s.nextInt();

                // Validating if the current index is available
                if (array[i] == 0){
                    // The index is available
                    array[i] = dataInput;
                    System.out.println(
                            "(OK) The data (" + dataInput + ") was inserted in the position [" + i + "] correctly\n");
                }
                else {
                    // The current index is not available, trying in the closest index available
                    boolean flag = false;
                    System.out.println(
                            "(INFO) The index [" + i + "] is not available, trying in the closest index available");

                    for(int ni = i + 1; ni < array.length; ni++){
                        if(array[ni] == 0){
                            // insert in the next available position
                            array[ni] = dataInput;
                            System.out.println(
                                    "(OK) The data (" + dataInput + ") was inserted in the position [" + ni + "] correctly\n");
                            flag = true;
                            break;
                        }
                    }

                    if(!flag){
                        System.out.println(
                                "(FAIL) There is not more available spaces in the array to insert the data (" + dataInput + "]");
                        break; // finish the main loop
                    }
                }
            }
            else{
                System.out.println("(INFO) The array is full\n");
                break; // finish the main loop
            }
        }


        /*  -------------------------------------------------------------
            CREATES A FANCY 2D MATRIX WITH THE CONTENT OF THE USER INPUT
            ------------------------------------------------------------- */
        String matrix = arraysTools.create2DMatrix(arrayPlaces, array);
        System.out.println(matrix);
    }
}
