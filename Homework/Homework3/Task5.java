package Homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert any year to find out if it is a leap year or not");
        int year = scan.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
