package ARRAY;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        String[] colors = {"Red", "Yellow", "brown", "Blue", "White", "Orange", "Green", "Pink", "Violet", "Black"};

        Arrays.sort(colors);


        for (String color : colors) { // called " for each loop" --> it will start from the beginning of the array and go to the end of it
            // color is just a reference
            // colors is the String array we work with
            System.out.print(color + ", ");


        }

        int[] ids = {9, 5, 8, 23, 45, 12, 50, 30, 100, 11};
        //use for each loop to print out these elements from int array
        // print out numbers that are 50 or greater

        for (int num : ids) {

            //  System.out.print(num);
            if (num >= 50) {

                System.out.println(num);

            }
        }

        char[] characters = {'a', '4', '$', 5, '*', 'A', 'H'};
        //print out only letters from char array


        for (char letters : characters) {

            if (letters >= 'A' && letters <= 'Z' || letters >= 'a' && letters <= 'z') {
                System.out.println(letters);

            }
        }

        for (char ch : characters) {

            Character.isAlphabetic(ch);// this method is checking if this is a letter or not

            Character.isDigit(ch); // this is checking if this is a number or not

            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {

                System.out.println(ch);
            }


            //print all other symbols by using above methods
            if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {

                System.out.println(ch);
            }
        }

    }

}


