package String;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        TASK: get a string from User via scanner and:
-print:
	- first char
	- last char
	- index of second matching letter 'c'
	- lenght of string
	- index of x

         */

        Scanner name = new Scanner(System.in);
        System.out.println("enter your name ");
        String str = name.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1)); // last char
        System.out.println(  str.indexOf("c",str.indexOf("c")+1)); // second matching lower case 'c'
        System.out.println(str.length()); /// length
        System.out.println(str.indexOf('x'));



    }
}
