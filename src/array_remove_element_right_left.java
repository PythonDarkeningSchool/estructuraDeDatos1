import java.util.Arrays;
import java.util.Scanner;


public class array_remove_element_right_left {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] intArr = {1, 2, 2, 12, 3, 3, 8};

        System.out.println("\n== Right to left removal ==\n");

        System.out.print("Original array is: " + Arrays.toString(intArr) + "\n\n");

        System.out.print("Enter the element to be deleted: ");
        int elem = in.nextInt();

        for(int i = intArr.length -1; i >= 0; i--){
            // search for the first match and exit the loop
            if(intArr[i] == elem){
                intArr[i] = 0;
                break;
            }
        }

        System.out.print("\nModified array is: " + Arrays.toString(intArr) + "\n\n");
    }
}