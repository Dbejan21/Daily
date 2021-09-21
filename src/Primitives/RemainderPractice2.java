package Primitives;

public class RemainderPractice2
{
    public static void main(String[] args)
    {
        //  find the product of digits from a given number
        // find the result as following :
        // "the product is ..."

        int number = -1432;

        int firstDigit = number % 10;// this is first digit -->2

        number = number / 10;

        int secondDigit = number % 10;

        number = number / 10;

        int thirdDigit = number % 10;
        number = number / 10;

        int fourthDigit = number % 10;
        number = number / 10;

        System.out.println(firstDigit * secondDigit * thirdDigit * fourthDigit);

    }
}
