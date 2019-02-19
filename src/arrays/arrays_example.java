package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class arrays_example {
    public static void main(String[] args){

        int count = 5, data;
        int array[] = {888, 4444, 7777, 1000, 10, 0}; // 5 index
        Scanner s=new Scanner(System.in);

        System.out.print("Type a data: ");
        data = s.nextInt();

        if (array[5] != 0){
            System.out.println("The array is full");
        }
        else if(array[count -1] != 0){
            array[count] = data;
        }
        else {
            array[count -1] = data;
        }

        // show the elements in the array
        System.out.println("Array content is: " + Arrays.toString(array));
    }
}
