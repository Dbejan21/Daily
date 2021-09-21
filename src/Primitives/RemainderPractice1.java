package Primitives;

public class RemainderPractice1
{
    public static void main(String[] args)
    {
        // 123 --->find the sum of digits from given numbers
        // 1+2+3=6 print 'the sum of digits = 6

        int number = 123;
        int firstDigit = number % 10; // 123/10 -->12 Remainder is 3

            System.out.println("First digit of first remainder " + firstDigit);

        number = number / 10;
            System.out.println(number);

        int secondDigit = number % 10; // 12/10 --> 1 remainder is 2
        number = number / 10;
        int thirdDigit = number % 10;
            System.out.println(thirdDigit);

            System.out.println(firstDigit + secondDigit + thirdDigit);


        /* % modulus --> finds remainder */

        int x= 15; // i want divide 15 by 6 and find the remainder -->3
        int result = x % 6; // 15/6=2 R -->3
        System.out.println(result);

        int num = 10%3;
        System.out.println(num);


    }
}
