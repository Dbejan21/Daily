package ARRAY;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {


        String names [] = new String[6];

        names[5]="Zoli";
        names[2]="Sorin";
        names[3]="Sorin";
        names [4] = "Adel";

        System.out.println(Arrays.toString(names));
     names[4]= "David";
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

    }
}
