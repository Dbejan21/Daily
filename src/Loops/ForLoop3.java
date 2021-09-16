package Loops;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

        Scanner number = new Scanner (System.in);
        System.out.println("Enter a number between less than 10");
        int a = number.nextInt();
        for ( ;a<=10; a++){

            System.out.println(a);


        }

    }
}
