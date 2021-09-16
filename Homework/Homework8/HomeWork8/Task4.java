package HomeWork8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-50 ");
        int small = scanner.nextInt();
        System.out.println("Please enter another number between 1-50");
        int big = scanner.nextInt();
        for (int i = small; i <= big; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " is not a prime number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(i + " is the prime number.");
            }

        }
    }
}
