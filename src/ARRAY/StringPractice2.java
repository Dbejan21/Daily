package ARRAY;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {

        /*  ask user how many names they want to store
        - store those names  in a String array

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("how many names you want to store?  ");
        int size = scan.nextInt();
        scan.nextLine();
        String [] names = new String[size];

        for (int i =0; i <size;i++) {

            System.out.println("Please enter the names");
          names[i] =  scan.next();

        }
        System.out.println(Arrays.toString(names));


    }
}
