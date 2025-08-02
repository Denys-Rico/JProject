package Activty1;

import java.util.Scanner;
import banking.RicobankingClass;

public class BankingAttempt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        int attempts = 3;
        boolean loggedIn = false;

        switch (choice) {
            case 1:
                RicobankingClass bc = new RicobankingClass();

                while (attempts > 0 && !loggedIn) {
                    System.out.println("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        loggedIn = true;
                    } else {
                        attempts--;
                        if (attempts > 0) {
                            System.out.println("INVALID ACCOUNT! YOU HAVE " + attempts + " ATTEMPTS LEFT");
                        } else {
                            System.out.println("INVALID ACCOUNT! NO ATTEMPTS LEFT. EXITING...");
                        }
                    }
                }
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
