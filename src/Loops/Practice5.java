package Loops;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /*
        ask user to give you number
        create a multiplication table from 1*10 for that given number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a whole number ");

        int number = input.nextInt();
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(number + "*" + multiplier + " =" + number * multiplier);
            multiplier++;
        }

    }
}
