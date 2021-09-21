package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {

        /*
        any number between 1-20
        user a number

        if number
         */

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter number between 1-20 ");
        int output = number.nextInt();

        if (output >= 0 && output <= 5) {

            System.out.println("your number is between 0-5");

        }
        else if (output >= 6 && output <= 10)
        {
            System.out.println("your number is between 6-10");
        }
        else if (output >= 11 && output <= 15)
        {
            System.out.println("between 16-20");
        }
        else if (output >= 16 && output <= 20)
        {
            System.out.println("between 16-20");


        } else {
            System.out.println("your number does not fall into any range");
        }
    }
}
