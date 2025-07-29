package GradingSystem;

import java.util.Scanner;

public class GradingSystem {

    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("Enter name:");
        String name = input.nextLine(); 
        
        System.out.print("Enter marks in Science: ");
        int science = input.nextInt();

        System.out.print("Enter marks in History: ");
        int history = input.nextInt();

        System.out.print("Enter marks in Math: ");
        int math = input.nextInt();

        System.out.print("Enter marks in Soc: ");
        int soc = input.nextInt();

        System.out.print("Enter marks in Arts: ");
        int arts = input.nextInt();
        
        int total = science + history + math + soc + arts;
        double percentage = total / 5.0;
        
        String remarks;
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage <= 75) {
            remarks = "Poor";
        } else if (percentage <= 80) {
            remarks = "Fair";
        } else if (percentage <= 85) {
            remarks = "Good";
        } else if (percentage <= 90) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }
        
        System.out.println("\nTotal Marks: " + total);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage < 70) {
            System.out.println("\nTry Again " + name + ".");
        } else {
            System.out.println("\nCongrats " + name + " you Passed!");
        }

        input.close();
    }
    
}
