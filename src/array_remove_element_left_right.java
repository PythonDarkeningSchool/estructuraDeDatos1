import java.util.Arrays;
import java.util.Scanner;


public class array_remove_element_left_right {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 2, 12, 7, 3, 8};

        System.out.println("\n== Left to right removal ==\n");

        System.out.print("Original array is: " + Arrays.toString(intArr) + "\n\n");

        System.out.print("Enter the element to be deleted: ");
        int elem = in.nextInt();

        for(int i = 0; i < intArr.length; i++){
            // search for the first match and exit the loop
            if(intArr[i] == elem){
                intArr[i] = 0;
                break;
            }
        }

        System.out.print("\nModified array is: " + Arrays.toString(intArr) + "\n\n");
    }
}