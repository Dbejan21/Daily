package HomePractices;

import java.util.Scanner;

public class ItsEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter any number ");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Your number is odd ");
        }else
            System.out.println("Your number is even ");


    }
}
