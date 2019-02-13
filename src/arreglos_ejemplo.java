import java.util.Scanner;

public class arreglos {
    public static void main(String[] args){

        int count = 5, data;
        int arre[] = {888, 4444, 7777, 1000, 10, 0}; // 5 index
        Scanner s=new Scanner(System.in);

        System.out.println("Type a data: ");
        data = s.nextInt();

        if (arre[5] != 0){
            System.out.println("The array is full");
        }
        else if(arre[count -1] != 0){
            arre[count] = data;
        }
        else {
            arre[count -1] = data;
        }

        // show the elements in the array
        for (int i=0; i < arre.length; i++){
            System.out.println(arre[i]);

        }
    }
}
