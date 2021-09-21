package Homework9;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
//        Write the application to find the second largest value from given
//        array.
//                Example:
//        Given array value: 3,2,8,9,1,5,4,3,7,8,5,9,9
//        Output: 8


        int nums[] = {3,2,8,9,1,5,4,3,7,8,5,9,9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int largest = nums[0];
        int secondLargest = nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > nums[0])
            {
                largest = nums[i];
            }
        }
        for (int j = 0; j < nums.length; j++)
        {
            if (nums[j] > nums[0] && nums[j] != largest)
            {
                secondLargest = nums[j];
            }
        }
//        System.out.println(largest);
        System.out.println(secondLargest);

    }
}

