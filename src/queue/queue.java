package queue;

import java.util.InputMismatchException;
import java.util.Scanner;

import common.employee;

public class queue {

    private int elements, index = 0;
    private employee[] employeeArray; // Create the object

    public queue(int elements) {
        this.elements = elements;
        this.employeeArray = new employee[this.elements]; // Initialize the object array with user values as null
    }

    // Getters
    public employee[] getEmployeeArray() {
        return employeeArray;
    }

    public int getElements() {
        return this.elements;
    }


    // Methods
    private void insertUserInArray(int index, int code, String name, String turn) {
        this.employeeArray[index] = new employee(code, name, turn);
    }

    public void addSingleUser() {

        // Define variables
        Scanner in = new Scanner(System.in);
        int index = getClosestAvailableIndex(), code;

        // collect information to fill out the employeeArray
        System.out.println("\nFill out the following information to add a user");

        // Set validations
        while(true){
            try{
                System.out.print("Type the code: ");
                code = in.nextInt();
                break;
            }
            catch(InputMismatchException error){
                System.out.println("(error) Invalid code\n");
                in.next(); // clear scanner wrong input
            }

        }

        System.out.print("Type the Name: ");
        String name = in.next();

        System.out.print("Type the Turn: ");
        String turn = in.next();

        insertUserInArray(index, code, name, turn);
    }

    public void deleteSingleUser() {
        this.employeeArray[0] = null;
    }

    private int getClosestAvailableIndex() {

        for (int i = 0; i < this.employeeArray.length; i++)
            if (this.employeeArray[i] == null) {
                this.index = i;
                break;
            }
        return this.index;
    }

    public int getClosestBusyIndex() {

        for (int i = this.employeeArray.length -1; i >= 0 ; i--) {
            if (this.employeeArray[i] != null) {
                this.index = i;
                break;
            }
        }

        return this.index;
    }

    public void moveArrayElementsOnePositionLeft(){

        for(int i = 1; i < this.employeeArray.length; i++){
            // Move the current element one position to left
            this.employeeArray[i -1] = this.employeeArray[i];
            // Clean the current position
            this.employeeArray[i] = null;
        }
    }
}