package Homework2;

public class task3 {
    public static void main(String[] args) {
        /*Write a Java program to print the sum (addition), multiply, subtract,
                divide and remainder of two numbers.
                Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */

     int number1 = 125, number2 = 24;

        int additionEq = number1 + number2;
        int subtractEq = number1 - number2;
        int multiplEq = number1 * number2;
        int divisorEq = number1 / number2;
        int remainderEq = number1 % number2;

        System.out.println(number1 +" + "+ number2+" = "+ additionEq);
        System.out.println(number1 +" - "+ number2+" = "+ subtractEq);
        System.out.println(number1 +" * "+ number2+" = "+ multiplEq);
        System.out.println(number1 +" / "+ number2+" = "+ divisorEq);
        System.out.println(number1 +" % "+ number2+" = "+ remainderEq);




    }
}
