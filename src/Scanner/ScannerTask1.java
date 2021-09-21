package Scanner;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {

        /*/*
David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculat his final money in his account
open a new class under scanner package and name it as "MoneyTransaction" */

        Scanner input = new Scanner (System.in);
        double moneyInAcc = 200;
        System.out.println("Please enter amount of your first check");
        double check1 = input.nextDouble();
        moneyInAcc +=check1;


        System.out.println("Please enter amount of second check");
        double check2 = input.nextDouble();
        moneyInAcc +=check2;


        System.out.println("Please enter amount of third check");
        double check3 = input.nextDouble();
        moneyInAcc +=check3;
        System.out.println("your current balance is: "+moneyInAcc);

        System.out.println("What is the phone price?");
        double phonePrice = input.nextDouble();
        moneyInAcc -= phonePrice;
        System.out.println("your current balance is: "+moneyInAcc);




        System.out.println("how much is headphones");
        double headphones = input.nextDouble();
        moneyInAcc -= headphones;
        System.out.println("your current balance is: "+moneyInAcc);


    }
}
