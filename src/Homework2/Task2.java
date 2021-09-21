package Homework2;

public class Task2 {
    public static void main(String[] args) {
        /* int result=4*7+3-2*9%5/3-2;
           int result1= 12-3/3+4-2*2%4+12%3/3;

    Please write the pseudoCode with an explanation of which arithmetic
    operatior will be executed first to find the current result.
    NOTE: please write pseudoCode, I don’t want directly the solution.*/


       // int result = 4 * 7 + 3 - 2 * 9 % 5 / 3 - 2;
        //int result1 = 12 - 3 / 3 + 4 - 2 * 2 % 4 + 12 % 3 / 3;

        //if are more than one operation on the same line: multiplication or division or modulus should be solved first from left to right.

        //if there are more than one operation on the same line: addition or subtraction, you should solve it from left to right.


        int result = 4 * 7 + 3 - 2 * 9 % 5 / 3 - 2;
        System.out.println("4 * 7 + 3 - 2 * 9 % 5 / 3 - 2 =" + result);
               //              28   + 3 - 1 -2
        /* 1. I should do multiplication  4 * 7 = 28 from left to right
        *  2.  subtraction 2 * 9 = 18
        *  3. the result of multiplication  18 % 5 = 3
        *  4. the modulus result which is  3 / 3
        *  5. result of division will be 1
        *  6.after i am done with multiplication, modulus and division
        *  7. results will be added  as 28 + 3 =31
        *  8.and do subtraction  31-1 -2 = 28
        *  */

        int result1 = 12 - 3 / 3 + 4 - 2 * 2 % 4 + 12 % 3 / 3;

                     /*       1          4    %  4    0   / 3
                       12 -   1  +          4  -         0
                       11               + 4        + 0
                                15 + 0
                                 15
        multiplication or division or modulus should be solved first from left to right
        1.  do  modulus 3/3  =1
        2.  do multiplication 2*2 =4
        3. do modulus of the result of multiplication and find the remainder of 4 % 4
        4. after do another modulus 12 % 3 =0
        5. do division result of modulus 0 /3 = 0
        6. from left to right do the subtraction 12-1=11
        7. and lastly addition 11+4+0 = 15
        */

        System.out.println(result1);
    }
}