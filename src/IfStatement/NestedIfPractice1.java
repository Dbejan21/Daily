package IfStatement;

import java.util.Scanner;

public class NestedIfPractice1 {
    public static void main(String[] args) {
        /* name
        if the school name is techtorial
        print ---> you are lucky to be the city  B10
        if the school name is not "techtorial"
        print --> please come and visit us

        if the city name is not Chicago

        print ---> please come to Chicago
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your city name");
        String cityName = input.nextLine();
        if(cityName.equalsIgnoreCase("Chicago")){
            System.out.println("what is your school name ");
            String schoolName = input.nextLine();
            if (schoolName.equalsIgnoreCase("Techtorial")){
                System.out.println("youre one of the Heroes");
            }else {
                System.out.println("Please visit Tech school");
            }
        }else {
            System.out.println("Please come to Chicago");
        }
    }
}