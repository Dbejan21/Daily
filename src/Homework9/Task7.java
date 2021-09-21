package Homework9;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        /*
        Create an int array with 6 elements and print a
        multiplication table for each element from an array.
         */

        int[] h = {1, 2, 3, 4, 5, 6};
        int[] v = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < v.length; j++) {
                System.out.println( h[i] * v[j]);
            }
            System.out.println();
        }
    }
}