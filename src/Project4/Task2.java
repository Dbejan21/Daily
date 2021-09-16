package Project4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter minimum number: ");
        int minNum = input.nextInt();

        System.out.print("Enter maximun number: ");
        int maxNum = input.nextInt();
        int sum = 0;

        for(int number = minNum; number < maxNum; number++){
            if(number%2 == 0 && number %7 == 0 && number != 0){
                sum += number;
                System.out.print(+number + " + ");
            }
        }
        System.out.println( " = " +sum);
    }
}
