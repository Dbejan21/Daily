package Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {



    /*
    Given a string, if one or both of the first 2 chars is 'x'
, print the
string without those 'x' chars, and otherwise print the string
unchanged.
"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"

     */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your string: ");

        String str = input.nextLine();

        if(str.charAt(0)=='x'){

            System.out.println(str.substring(1));

        }else if(str.charAt(1)=='x'){
            System.out.println(str.charAt(0)+str.substring(2));
        }else{
            System.out.println(str);
        }
    }
}
