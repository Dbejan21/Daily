package Project4;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();

        boolean isPrime =true;
        for (int j = 2; j <number; j++) {
            if (number%2 ==0) {
                System.out.println("Not a prime number");
                isPrime = false;
                break;
            }
        }
            if (isPrime) {
                System.out.println("this is a prime number ");
            }

        }
    }

