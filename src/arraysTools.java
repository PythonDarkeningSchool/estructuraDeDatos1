// useful functions to handle arrays

// third party libraries
import com.jakewharton.fliptables.FlipTable;

public class arraysTools{

    public static boolean theArrayIsFull(int[] array){
        /*Return true if the array is full, otherwise return false*/

        boolean flag = true;

        for(int element: array){
            if(element == 0){
                flag = false;
            }
        }

        return flag;
    }

    public static String create2DMatrix(int rows, int[] array){
        /*Create a 2D matrix*/

        // Define the headers of the row
        String[] headers = { "Index", "Content" };
        // Define the matrix columns number
        int columns = headers.length;
        // create the matrix content with the user input
        matrixGenerator mg = new matrixGenerator(rows, columns, array);
        String[][] matrixContent = mg.createMatrix();
        // mg.showMatrixContent(matrixContent); // uncomment to show matrix content in raw data

        return FlipTable.of(headers, matrixContent);
    }
}