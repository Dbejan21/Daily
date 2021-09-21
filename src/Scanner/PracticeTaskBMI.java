package Scanner;

import java.util.Scanner;

public class PracticeTaskBMI {
    public static void main(String[] args) {
        /*ask user

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you weight in kg ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in cm");
         Double height = input.nextDouble();

        double BMI = (int)(weight / (height*height));
        System.out.println("your BMI is " +BMI);




    }
}
