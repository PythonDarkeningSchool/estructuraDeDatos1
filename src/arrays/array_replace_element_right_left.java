package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_replace_element_right_left{
    public static void main(String[] args){

        //int[] intArr = new int[7]; // declare an array with 7 empty spaces
        int[] intArr = {1, 2, 2, 12, 3, 3, 8};
        Scanner in = new Scanner(System.in);

        System.out.println("\n== Right to left replacement ==\n");

        System.out.println("Original array is: " + Arrays.toString(intArr) + "\n");

        if(intArr[0] != 0) {

            System.out.print("Type the data to replace in the array: ");
            int oldData = in.nextInt();

            // Check if the data given from the user exits

            if(!arraysTools.thisElementExists(intArr, oldData)){
                System.out.println("The data given does not exists in the array");
            }
            else{
                System.out.print("Type the new data to replace: ");
                int newData = in.nextInt();

                for (int i = intArr.length -1; i >= 0; i--) {
                    if(intArr[i] == oldData){
                        intArr[i] = newData;
                        break;
                    }
                }

                System.out.println("\nModified array is: " + Arrays.toString(intArr));
            }
        }
        else{
            System.out.println("The array is empty");
        }
    }
}
