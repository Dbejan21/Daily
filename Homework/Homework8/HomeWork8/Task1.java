package HomeWork8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Write a program in Java to find the sum of the series 1 +11 + 111 +
        //1111 + .. n terms.
        // n is going to be stopping point
        int firstNUmberInSeries=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number :");
        int nTerm= scanner.nextInt();
        // This loop will iterate n times
        for (int i = 1; i <=nTerm ; i++) {
            // I need to do something different in the last iteration
            if (i==nTerm){
                System.out.print(firstNUmberInSeries);
            }else {
                System.out.print(firstNUmberInSeries+"+");

            }
            firstNUmberInSeries=firstNUmberInSeries*10+1;}
    }
}