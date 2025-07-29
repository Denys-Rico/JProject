package gradingsystem;

import java.util.Scanner;

public class numberviewer2 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            
            while (true) {
                System.out.print("Enter a number (type -1 to exit): ");
                number = input.nextInt();
                
                if (number == -999) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }
                
                if (number > 0) {
                    System.out.println("\n" + number + " is a positive number");
                } else if (number < 0) {
                    System.out.println("\n" + number + " is a negative number");
                } else {
                    System.out.println("\nInputted number Zero");
                }
                
                System.out.println();
            }

        input.close();
        }
    }
}
