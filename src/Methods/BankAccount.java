package Methods;

import java.sql.Struct;

public class BankAccount {
    String bankName;
    int accountNumber;
    double balance;
    String accountHolderName;
    boolean loggedIn;
    String userName;
    String passWord;


    // create a method will display all of the account information
    // create a method named as deposit, it will update the balance
    // create a method named as withdraw it will update the balance
    // create a method as login , it will check if the user logged in or not it will return true / false


    public void accountInfo() {

        System.out.println("Bank name : " + bankName + "\n Account number is: " + accountNumber + "\n Balance is : " + balance + "\n Account holder name is " + accountHolderName + "\n Logged in : " + loggedIn);
    }

    public double deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("your new balance after deposit amount  of " + depositAmount + "is " + balance);
        return balance;

    }

    public double withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
        System.out.println("your new balance after withdrawal amount  of " + withdrawAmount + "is " + balance);
        return balance;

    }

    public boolean logIn(String user, String pass) {
        if (userName.equals(user) && passWord.equals(pass)) {
            loggedIn = true;
        }
        else {
            System.out.println("Your credentials are not matching! Try again");
        }

        return loggedIn;
    }

    public static void main(String[] args) {
        BankAccount java = new BankAccount();
        java.accountNumber = 123456;
        java.accountHolderName = "Joe";
        java.userName = "abc";
        java.passWord = "123";
        java.balance = 100_000;

        java.accountInfo();
        java.deposit(5000);
        java.withdraw(60);
        java.logIn("abc", "123");
        java.accountInfo();


    }
}
