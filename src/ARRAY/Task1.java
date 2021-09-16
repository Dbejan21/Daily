package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /* ask user how many names they want to store
                - store those names
                if the nam has more than 5 letters ; save it to an array as a longNames
                if the names has less than 5 letters save it to array as shortNames
                - pring out the longNames arrays by using toString() method
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("how many names you want to store?  ");
        int size = scan.nextInt();
        scan.nextLine();
        String [] longNames = new String[size];
        String [] shortNames = new String[size];

        for (int i =0; i <size;i++) {



            System.out.println("Please enter the names");
            String names =  scan.next();

            if (names.length() >=5 ) {

                longNames[i] = names;
            }
            else {shortNames[i]=names;



            }

        }
        System.out.println(Arrays.toString(longNames));
        System.out.println(Arrays.toString(shortNames));

    }
}
