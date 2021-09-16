package HomeWork8;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int a, arm = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        int temp = n;
        for (; n != 0; n /= 10) {
            a = n % 10;
            arm = arm + (a * a * a);
        }
        if (arm == temp)
            System.out.println(temp + " is a armstrong number ");
        else
            System.out.println(temp + " is not a armstrong number ");
    }
}

