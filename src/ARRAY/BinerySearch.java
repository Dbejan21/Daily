package ARRAY;

import java.util.Arrays;

public class BinerySearch {
    public static void main(String[] args) {

        /// you need to sort (Array.sort())



        int []studentNumber = {100,10, 15, 20, 30, 35};
        Arrays.sort(studentNumber);
        System.out.println(Arrays.toString(studentNumber));
        System.out.println(Arrays.binarySearch(studentNumber,35)); //4
        System.out.println(Arrays.binarySearch(studentNumber,25));// -4
        System.out.println(Arrays.binarySearch(studentNumber, 111));//-7
        System.out.println(Arrays.binarySearch(studentNumber, 150)); // -7
        System.out.println(Arrays.binarySearch(studentNumber, 49)); //-6



    }

}
