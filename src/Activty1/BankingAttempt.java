package Activty1;

import java.util.Scanner;
import banking.RicobankingApp;

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

        switch(choice) {
            case 1:
                
                RicobankingApp bApp[] = new RicobankingApp[10];
                int accountCount = 0;  
                int response;

                do {
                    System.out.println("!. Register Account");
                    System.out.println("2. Sign Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter Selection: ");
                    int action = sc.nextInt();

                    switch(action) {
                        case 1:
                            
                            if (accountCount < 10) {
                                bApp[accountCount] = new RicobankingApp(); 
                                
                                System.out.println("Enter your Account No: ");
                                bApp[accountCount].setAccountNo(sc.nextInt());
                                System.out.println("Enter your Pin: ");
                                bApp[accountCount].setPin(sc.nextInt());
                                System.out.println("Account Registered Successfully!");
                                
                                
                                accountCount++;
                            } else {
                                System.out.println("Account limit reached. Cannot register more accounts.");
                            }
                            break;

                        case 2:
                            
                            System.out.println("Enter your Account No: ");
                            int accountNo = sc.nextInt();
                            System.out.println("Enter your Pin: ");
                            int pin = sc.nextInt();

                            boolean foundAccount = false;
                            RicobankingApp bapp = null;
                          
                            for (int i = 0; i < accountCount; i++) {
                                if (bApp[i].getAccountNo() == accountNo && bApp[i].getPin() == pin) {
                                    bapp = bApp[i];
                                    foundAccount = true;
                                    break;
                                }
                            }

                            if (foundAccount) {
                                System.out.println("LOGIN SUCCESS");
                                int loginAction;
                                do {
                                    System.out.println("1. View Account Info");
                                    System.out.println("2. Deposit Money");
                                    System.out.println("3. Withdraw Money");
                                    System.out.print("Enter your choice: ");
                                    loginAction = sc.nextInt();

                                    switch (loginAction) {
                                        case 1:
                                            
                                            System.out.println("Account No: " + bapp.getAccountNo());
                                            System.out.println("Current Balance: " + bapp.getInitialBalance());
                                            break;
                                        case 2:
                                            
                                            System.out.println("Enter amount to deposit: ");
                                            float depositAmount = sc.nextFloat();
                                            bapp.deposit(depositAmount);
                                            break;
                                        case 3:
                                            
                                            System.out.println("Enter amount to withdraw: ");
                                            float withdrawAmount = sc.nextFloat();
                                            bapp.withdraw(withdrawAmount);
                                            break;
                                        default:
                                            System.out.println("Invalid choice!");
                                    }
                                } while (loginAction != 0); 
                            } else {
                                System.out.println("Invalid account number or pin!");
                            }
                            break;

                        case 3:
                            
                            if (accountCount == 0) {
                                System.out.println("No accounts registered.");
                            } else {
                                for (int i = 0; i < accountCount; i++) {
                                    System.out.println("Account " + (i + 1) + ": " + bApp[i].getAccountNo());
                                }
                            }
                            break;

                        default:
                            System.out.println("Invalid selection!");
                    }

                    System.out.print("Do you want to continue? (1/0): ");
                    response = sc.nextInt();

                } while (response == 1);  

                break;

            case 2:
                
                break;

            case 3:
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }

        sc.close();  
    }
}
