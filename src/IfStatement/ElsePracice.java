package IfStatement;

import java.util.Scanner;

public class ElsePracice {

    public static void main(String[] args) {
        /*
        ask user enter integer value
        check and print:
        if number is even number

         */

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number : ");

        int result = number.nextInt();

        if (result % 2 == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("your number is odd ");
        }


    }
}
