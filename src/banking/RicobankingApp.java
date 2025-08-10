package banking;

public class RicobankingApp {
    
    int accountNo;
    float initialBalance;
    int pin;

    public int getAccountNo() {
        return accountNo;
    }

    public float getInitialBalance() {
        return initialBalance;
    }

    public int getPin() {
        return pin;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setInitialBalance(float initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean verifyAccount(int accn, int pn) {
        if (accountNo == accn && pin == pn) {
            return true;
        } else {
            return false;
        }
    }

    
    public void deposit(float amount) {
        if (amount > 0) {
            initialBalance += amount;
            System.out.println("Deposit successful! New balance: " + initialBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > initialBalance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            initialBalance -= amount;
            System.out.println("Withdrawal successful! New balance: " + initialBalance);
        }
    }
    
    public static void main(String[] args) {
        
        RicobankingApp account = new RicobankingApp();
        account.setAccountNo(12345);
        account.setPin(6789);
        account.setInitialBalance(1000);  

        
        if (account.verifyAccount(12345, 6789)) {
            System.out.println("Account verified!");

            account.deposit(500);  
            
            account.withdraw(200);  
            account.withdraw(1500); 
        } else {
            System.out.println("Account verification failed.");
        }
    }
}
