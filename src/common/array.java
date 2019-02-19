package common;

public class array {

    public static boolean theArrayIsNull(employee[] array){

        boolean nullArray = false;
        int counter = 0;

        for(int i=0; i < array.length; i++){
            if(array[i] == null){
                counter++;
            }
        }

        if(counter == array.length){
            nullArray = true;
        }

        return nullArray;
    }
}
