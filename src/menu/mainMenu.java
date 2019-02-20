package menu;

import java.util.Scanner;
import java.util.InputMismatchException;


public class mainMenu {

    public static void main(String[] args) throws InputMismatchException{
        // Set the objects
        Scanner in = new Scanner(System.in);

        outer: // label while loop
        while(true){
            System.out.println("\n\nChoose an option\n");
            System.out.println("1. Stack program");
            System.out.println("2. Queue program");
            System.out.println("3. Array");
            System.out.println("4. Exit\n");
            System.out.print("=> ");

            try{
                int userSelection = in.nextInt();

                switch (userSelection){

                    case 1:
                        stackMenu.menu();
                        break;
                    case 2:
                        queueMenu.menu();
                        break;
                    case 3:
                        handleArrayMenu.menu();
                        break;
                    case 4:
                        break outer;
                    default:
                        System.out.print("\n(error) Invalid option");
                        break;
                }

            }

            catch(InputMismatchException error){
                System.out.print("\n(error) Invalid option");
                in.next(); // clear scanner wrong input
            }

        }

    }

}
