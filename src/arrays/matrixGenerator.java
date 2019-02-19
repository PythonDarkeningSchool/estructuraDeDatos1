package arrays;

// matrixGenerator class work for 2D matrix with X quantity of rows and 2 columns


public class matrixGenerator {

    private int rows;
    private int columns;
    private int[] content;

    // parameterized class constructor
    matrixGenerator(int rows, int columns, int[] content){
        this.rows = rows;
        this.columns = columns;
        this.content = content;

    }

    private String[][] createMatrixObject(){
        /*Create the matrix object*/

        return new String[this.rows][this.columns];
    }

    private String[][] createMatrixIndexes(String[][] matrix){
        /*Fill out the matrix with their indexes*/

        int indexCount = 0;

        // fill out the matrix with the indexes [x][0]
        for (int row = 0; row < this.rows; row++){
            matrix[row][0] = String.valueOf(indexCount);
            indexCount++;
        }

        return matrix;

    }

    private String[][] createMatrixContent(String[][] matrix){
        /*Fill out the matrix with their content*/

        int contentCount = 0;

        for (int row = 0; row < this.rows; row++){
            matrix[row][1] = String.valueOf(content[contentCount]);
            contentCount++;
        }

        return matrix;
    }

    public String[][] createMatrix(){
        /*Create, fill out and return a 2D matrix*/

       // create the 2D matrix object
       String[][] matrix = createMatrixObject();
       // fill out the indexes to the matrix
       String[][] matrixIndex = createMatrixIndexes(matrix);
       // fill out the matrix content
       return createMatrixContent(matrixIndex);
    }

    public void showMatrixContent(String[][] matrix){
        /* printing the matrix content*/

        for (int row = 0; row < this.rows; row++)
            for (int column = 0; column < this.columns; column++) {
                System.out.print("matrix position [" + row + "][" + column + "] => ");
                System.out.println(matrix[row][column]);
            }

    }
}
