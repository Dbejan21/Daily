package Loops;
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {

        /*
        user has $100
        as long as user has balance more than $0
        ask user that how much money he/she wants to spend
        if the amount is less than balance
        update the balance and show it to user
        if the amount is more than the balance
        >> print>> "you don't have enough money in the account !! your balance is..."
         */

        double balance=100;
        Scanner scanner = new Scanner(System.in);

        while(balance>0){

            System.out.println("How much money you want to spend?");
            double spending= scanner.nextDouble();

            if(spending<balance){
                balance-=spending;
                System.out.println("Your new balance is "+balance);
            } else {

                System.out.println("You don't have enough money in the account!! your balance is "+balance);
            }

        }

    }
}