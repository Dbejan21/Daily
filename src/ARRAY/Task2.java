package ARRAY;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        /* create an array to store these numbers : 45, 5 ,6,47,57, 8, 12,0,30
        using loop print out only
        */

        int[] numbers = {45, 5, 6, 47, 57, 8, 12, 0, 30};
        int smallNumber[]=new int[numbers.length];

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > 10) {
                System.out.println(numbers[x]);
            }else {
                smallNumber[x]=numbers[x];
            }

        } System.out.println(Arrays.toString(smallNumber));
        }


    }
