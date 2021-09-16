package ARRAY;

import HomePractices.Array;

import java.util.Arrays;

public class biggestNumber {
    public static void main(String[] args) {

        // find the largest number from these array {45,5,6,47,57,12,0}

        int numbers [] = {45,5,6,47,57,12,20};

        int LargestNum = numbers[5];


        for (int a =1;a <numbers.length;a++){
            if( numbers[a]> LargestNum ) {
                LargestNum = numbers[a];
            }


        }
        System.out.println(LargestNum);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //print last elements this array

        System.out.println(numbers[numbers.length -1] );// this last elements after sorting
        System.out.println(numbers[0]);


        int nums1 [] = {45,5,6,47,57,12,20};
        int smallestNum = nums1[0];

        for (int i =1; i <nums1.length;i++) {
            if (nums1[i]<smallestNum) {
                smallestNum = nums1[i];
            }
        }

        System.out.println("smallest number is " +smallestNum);
    }
}
