package HomeWork8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program in Java to find the sum of the series 1 +11 + 111 +
        //1111 + .. n terms.
        // n is going to be stopping point
        int first = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int nTerm = scan.nextInt();
        for (int i = 1; i <= nTerm; i++) {
            if (i == nTerm) {
                first = first * 10 + 1;

                System.out.print(first);
            }

        }

    }
}