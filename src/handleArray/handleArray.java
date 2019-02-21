package handleArray;

import java.util.InputMismatchException;
import java.util.Scanner;

import common.employee;

public class handleArray {

    private int elements, index = 0;
    private employee[] employeeArray; // Create the object

    public handleArray(int elements) {
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

    public void replaceSingleUser(int index){

        // Define variables
        Scanner in = new Scanner(System.in);
        int code;


        // Set validations
        while(true){
            try{
                System.out.print("\nType the new code: ");
                code = in.nextInt();
                break;
            }
            catch(InputMismatchException error){
                System.out.println("(error) Invalid code\n");
                in.next(); // clear scanner wrong input
            }

        }

        System.out.print("Type the new name: ");
        String name = in.next();

        System.out.print("Type the new turn: ");
        String turn = in.next();

        insertUserInArray(index, code, name, turn);
    }

    public void updateUser(int index) {

        // Define variables
        Scanner in = new Scanner(System.in);

        // Get the current values
        int code = this.employeeArray[index].getCode(); // this could be overwrite
        String name = this.employeeArray[index].getName(); // this could be overwrite
        String turn = this.employeeArray[index].getTurn(); // this could be overwrite

        outerA:
        while(true){
            System.out.println(String.format("\nCurrent code => (%d), do you want to change it?\n", code));
            System.out.println("1. Yes");
            System.out.println("2. No\n");
            System.out.print("=> ");


            try{
                int answerA = in.nextInt();

                switch (answerA){
                    case 1:
                        while(true){
                            try{
                                System.out.print("Type the new code: ");
                                code = in.nextInt();
                                break;
                            }
                            catch(InputMismatchException error){
                                System.out.println("(error) Invalid code\n");
                                in.next(); // clear scanner wrong input
                            }
                        }
                        break outerA;

                    case 2:
                        break outerA;
                }
            }
            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid option");
                in.next(); // clear scanner wrong input
            }
        }


        outerB:
        while(true){
            System.out.println(String.format("\nCurrent name => (%s), do you want to change it?\n", name));
            System.out.println("1. Yes");
            System.out.println("2. No\n");
            System.out.print("=> ");


            try{
                int answerB = in.nextInt();

                switch (answerB){
                    case 1:
                        System.out.print("Type the new name: ");
                        name = in.next();
                        break outerB;
                    case 2:
                        break outerB;
                }
            }
            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid option");
                in.next(); // clear scanner wrong input
            }
        }


        outerC:
        while(true){
            System.out.println(String.format("\nCurrent turn => (%s), do you want to change it?\n", turn));
            System.out.println("1. Yes");
            System.out.println("2. No\n");
            System.out.print("=> ");


            try{
                int answerC = in.nextInt();

                switch (answerC){
                    case 1:
                        System.out.print("Type the new turn: ");
                        turn = in.next();
                        break outerC;
                    case 2:
                        break outerC;
                }
            }
            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid option");
                in.next(); // clear scanner wrong input
            }
        }

        insertUserInArray(index, code, name, turn);
    }

    public void deleteSingleUser() {
        int index = getClosestBusyIndex();
        this.employeeArray[index] = null;
    }

    public void deleteSingleUserByIndex(int index) {
        this.employeeArray[index] = null;
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

    public boolean thisIndexIsNull(int index) {
        boolean flag = false;

        if(this.employeeArray[index] == null){
            flag = true;
        }

        return flag;
    }
}