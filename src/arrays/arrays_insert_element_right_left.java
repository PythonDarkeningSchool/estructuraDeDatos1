package arrays;

// standard libraries
import java.util.Scanner;

public class arrays_insert_element_right_left {

    public static void main(String[] args){

        int dataInput, arrayPlaces = 6;

        /*COMMENT/UNCOMMENT THIS DATA TO SEE HOW THE PROGRAM WORKS*/
        int[] array = new int[arrayPlaces]; // declare an array with 6 empty spaces
        /*COMMENT/UNCOMMENT THIS DATA TO SEE HOW THE PROGRAM WORKS*/
        //int[] array = {0, 0, 33 , 0, 55, 0}; // declare an array with 1 empty space

        // initializing the scanner as an object
        Scanner s=new Scanner(System.in);

        // System.out.println(Arrays.toString(array)); // print the content of the array

        System.out.println("\n== Right to left insertion ==\n");

        // iterating over the array in order to fill out (if any)
        for(int i = array.length -1; i >= 0; i--){
            // check if the array is full
            if(!arraysTools.theArrayIsFull(array)) {
                // the array is not full
                int availableIndex = arraysTools.getAvailableIndex(array);

                System.out.print("(input) Type the data to insert in the array: ");
                dataInput = s.nextInt();

                // Validating if the current index is available
                if(availableIndex != 404){
                //if (array[i] == 0){
                    // A closest index from the left is available
                    array[availableIndex] = dataInput;
                    System.out.println(
                            "(OK) The data (" + dataInput + ") was inserted in the position [" + availableIndex + "] correctly\n");
                }
                else {
                        System.out.println(
                                "(FAIL) There is not more available spaces in the array to insert the data (" + dataInput + "]");
                        break; // finish the main loop
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
