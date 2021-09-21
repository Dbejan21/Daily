package Homework9;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        /*
        You have an array of 6 int numbers and get the square
        of each number from the array
         */

        int numbers [] = {2, 3, 4 };
        int square [] = new int [3];
        for (int i = 0; i < numbers.length; i++) {

            square [i] =numbers[i]*numbers[i];

        }
        System.out.println(Arrays.toString(square));
    }
}
