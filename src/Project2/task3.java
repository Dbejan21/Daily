package Project2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        double q = .25;
        int d = 10;
        int n = 5;

        int p = 1;

        Scanner allMoney = new Scanner (System.in);
        System.out.println("How much money do you have? $");
         double balance = allMoney.nextDouble();

         double totalOfQuarter = balance / q;


        System.out.println(totalOfQuarter);

        /*double remainderOf10 = remainderOf25 % 10;
        double remainderOf5 = remainderOf10 % 5;
        double remainderOf1 = remainderOf5 % 1; */








    }


}
