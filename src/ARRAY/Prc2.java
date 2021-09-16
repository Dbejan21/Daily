package ARRAY;

import HomePractices.Array;

import java.util.Arrays;

public class Prc2 {
    public static void main(String[] args) {
        int[] zipCodes = {60653, 60659, 60645};
        System.out.println(zipCodes[0]);
        System.out.println(Arrays.toString(zipCodes));

        zipCodes[1] = 9999;
        System.out.println(Arrays.toString(zipCodes));


        Object[] objects = {"red", "Blue", 55, 'A', 6.51, false};

        for (int x = 0; x < objects.length; x++){
            System.out.println(objects[x]);
            System.out.println("___________________________________");
    }
        boolean[] conditions = {true, false,false, false, false, true, 5==5, 5!=5};
        System.out.println(Arrays.toString(conditions));

        System.out.println("___________________________________");

        char characters []= {'a','$', 'd', 65,};
        System.out.println(Arrays.toString(characters));

    }
}
