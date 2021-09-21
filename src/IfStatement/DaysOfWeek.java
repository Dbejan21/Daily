package IfStatement;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {

        /*
        ask enter the number between 1 to 7
        if user enters
        1 => print >> Monday
        2 = Tuesday

         */

        Scanner numberOfWeek = new Scanner(System.in);

        System.out.println("Enter any number between 1-7");
        int number = numberOfWeek.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        }
        if (number == 2) {
            System.out.println("Tuesday");
        }
        if (number == 3) {
            System.out.println("Wednesday");
        }

        if (number == 4) {
            System.out.println("Thursday");
        }
        if (number == 5) {
            System.out.println("Friday");
        }
        if (number == 6) {
            System.out.println("Saturday");
        }

        if (number == 7) {
            System.out.println("Sunday");
        }
    }

}
