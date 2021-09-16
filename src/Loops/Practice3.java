package Loops;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        ask user to enter int number
        find and print the numbers which can devide that given
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter your number");
        int number = input.nextInt();

        int divider = 1;
while (divider<=number) {

            if (number % divider == 0) {
                System.out.println(divider);
            }
            divider++;
        }
    }
}
