package IfStatement;

import java.util.Scanner;

public class DayOfWeek1 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Please enter your letter");
        String letter = object.nextLine();
        if (letter.equalsIgnoreCase("M")) {
            System.out.println("Monday");
        }
        if (letter.equalsIgnoreCase("S")) {
            System.out.println("Its either Saturday or Sunday");
        }

        else {
            System.out.println("Your entry is invalid");

        }
    }

}
