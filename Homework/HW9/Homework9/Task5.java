package Homework9;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
//        You have an array of weather conditions with
//        Fahrenheit numbers. The size of the array will be 6.
//        Print the Celsius value of each array element.

        int tempF [] = {45, 76, 64, -40, 92, 66};
        int celsius []= new int[6];

        for (int i = 0; i < tempF.length; i++) {
            celsius[i]= ((tempF[i] - 32) *5)/ 9;
        }
        System.out.print(Arrays.toString(celsius));

    }
}
