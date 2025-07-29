package GradingSystem;

import java.util.Scanner;

public class numberviewer {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number;
            
            while (true) {
                System.out.print("Enter a number (or type -1 to exit): ");
                number = input.nextInt();
                
                if (number == -1) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }
                
                if (number == 0) {
                    System.out.println("\nInputted number Zero");
                } else if (number % 2 == 0) {
                    System.out.println("\nInputted number is even");
                } else {
                    System.out.println("\nInputted number is odd");
                }
                
                System.out.println();
            }
        }
    }
}
