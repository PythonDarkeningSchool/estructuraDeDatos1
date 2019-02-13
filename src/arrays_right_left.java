import java.util.Scanner;

public class arrays_right_left {
    public static void main(String[] args){

        int data, element, currentIndex;
        int array[] = new int[6]; // declare an array with 6 spaces
        // initializing the scanner as an object
        Scanner s=new Scanner(System.in);

        System.out.println("Right to left insertion in the array program");

        // iterating over the array in order to fill out
        for(int i = array.length -1; i >= 0; i--){
            System.out.print("Type a data for the array #(" + i + "): ");
            data = s.nextInt();
            // Validating if the current index is available
            //currentIndex = i +1;

            // checar celdas vacias de derecha a izquierda e insertarlo en la celda de la izquierda mas proxima vacia
            if (array[i] == 0){
                // The index is available
                System.out.println("(OK) The data will be insert in the position [" + i + "]");
                array[i] = data;

                // showing the elements in the array
                for(int a = array.length -1; a >= 0; a--){
                    element = array[a];
                    System.out.println("The position #(" + a + ") for the array is =>" + element);
                }

            }
            else {
                // The index is not available
                System.out.println(
                        "(FAIL) The index [" + i + "] is not available, skipping the insertion in the array for [" +
                                data + "]");
            }

        }

        // showing the elements in the array
        for(int i = array.length -1; i >= 0; i--){
            element = array[i];
            System.out.println("The position #(" + i + ") for the array is =>" + element);
        }

    }
}
