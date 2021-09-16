package HomeWork8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//Write a Java program to find the perfect numbers within a given number of range.
//Test Data :
//Input the starting range or number : 1
//Input the ending range of number : 50
//Expected Output :
//The Perfect numbers within the given range : 6
// 28
//NOTE: you need to use the nested loop.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int small = scan.nextInt();
        int big = scan.nextInt();
        for (int i =small; i <=big; i++){
            int sumOfDivisor = 0;
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    sumOfDivisor+=j;
                }

            }if (sumOfDivisor ==i) {
                System.out.println(i+ " is the perfect number");
            }
        }
    }
}
