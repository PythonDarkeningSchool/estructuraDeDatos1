package stack;

import java.util.Scanner;

import common.employee;
import common.exception;

public class stack {

    private int elements;
    private employee[] employeeArray; // Create the object

    public stack(int elements){
        this.elements = elements;
        this.employeeArray = new employee[this.elements]; // Initialize the object array with user values as null
    }

    // Getters
    public employee[] getEmployeeArray(){
        return employeeArray;
    }

    public int getElements(){
        return this.elements;
    }


    // Methods
    private void insertUserInArray(int index, int code, String name, String turn){
        this.employeeArray[index] = new employee(code, name, turn);
    }

    public void addSingleUser(int index){
        // collect information to fill out the employeeArray
        System.out.println("Fill out the following information to add a user");
        System.out.print("Type the code: ");
        int code = in.nextInt();
        System.out.print("Type the Name: ");
        String name = in.next();
        System.out.print("Type the Turn: ");
        String turn = in.next();

        insertUserInArray(index, code, name, turn);
    }

    public static void main(String[] args) throws exception {


        Scanner in = new Scanner(System.in);

        // check if the final position in the array object is not null
        if(employeeArray[employeeArray.length -1] != null){
            throw new exception("The array is full");
        }

        //for(int i=0; i < employeeArray.length; i++){
        for(int i=0; i < 2; i++){
            // collect information to fill out the employeeArray
            System.out.println(String.format("\n\nEmployee number #%d \n", i + 1));
            System.out.print("Type the code: ");
            int code = in.nextInt();
            System.out.print("Type the Name: ");
            String name = in.next();
            System.out.print("Type the Turn: ");
            String turn = in.next();

            // create a object (with setters) with tmp data to fill out the array
            employee tmpData = new employee(code, name, turn);
            // fill out the employeeArray
            employeeArray[i] = tmpData;
        }


        for(int e=0; e < employeeArray.length; e++){
            System.out.println(employeeArray[e].getName());
            //employeeArray[e].toString();
        }
        System.out.println("s");
        // capture employee data as a battery if the object is not null (with a for sentence
        // do it graphically (if is possible))


        // code that erases as battery (stack)
        // delete the last element in the object as null


        // show the object content

        // make with a menu
    }
}

