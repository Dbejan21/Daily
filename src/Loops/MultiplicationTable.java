package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        /* use for loop to create a multiplication table for number 6
        from 1 to 10
        6*1=6
        6*2=12
        ...
        6*10=60
         */
        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        for (int num1 = 1; num1 <= 10; num1++) {
            for (int num2 = 1; num2 <= 10; num2++) {
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);

            }

        }

        // perfect number : a number is  to its dividers sum
        // 6 >> 1,2,3 >> 1+2+3 = 6 6=6 is perfect number

        int perfect$ = 6;
        int sum = 0;
        for (int divisor = 1; divisor < perfect$; divisor++) {


            if (perfect$ % divisor == 0) {
                sum = sum + divisor;
            }

        }
        System.out.println("The sum of the divisors is >> " + sum);
        if (perfect$ == sum) {
            System.out.println("the number " + perfect$ + " is a perfect number");
        } else
            System.out.println("the number " + perfect$ + "is not a perfect number");

        // selenium ; reverse it print as a new string as reversed version

        String str = "Diana";
        int i;
        String reverse = "";

        for (i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            System.out.println(reverse);
        }
        System.out.println("Final version " + reverse);


        if (str.equals(reverse)) {
            System.out.println("Your string is Palindrome " + str);
        } else {
            System.out.println("Your string is not Palindrome " + str);
        }

    }
}


