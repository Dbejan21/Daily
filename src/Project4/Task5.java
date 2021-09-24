package Project4;

import java.util.Scanner;
/*
Ask the user to enter one in number between 1 to 10 then, Write the
program to print the string in the following format:

 */

public class Task5 {
    public static void main(String[] args) {



                Scanner scr = new Scanner(System.in);
                System.out.println("Please enter one String value");
                String str = scr.nextLine();
                String empty = "";


                for (int i = 0; i < str.length(); i++ ) {
                    if(str.substring(i,i+1).equals(" ")){
                        empty+=str.charAt(i);
                    }
                    if (!empty.contains(str.substring(i,i+1))&&!str.substring(i,i+1).equals(" ")) {

                        empty += str.charAt(i);
                    }

                }
                System.out.println(empty);
    }
}
