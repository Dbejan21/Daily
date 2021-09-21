package Project2;

public class Task5 {

        // Write a program that will accept 5 digit number and
        //will print reversed number at the end.
        //Example-1:
        //53876
        //The output is 67835
        //Example-2:
        //97352
        //The output is 25379
        //Description
        public static void main(String[] args)
        {
            int number = 12345;
            int number1 = number % 10;//5
            number = number / 10;//1234
            int number2 = number % 10;
            number = number / 10;//123
            int number3 = number % 10;
            number = number / 10;//12
            int number4 = number % 10;
            number = number / 10;//1
            int number5 = number % 10;
            System.out.println("" + number1 + number2 + number3 + number4 + number5);
        }
    }

