package ARRAY;

import java.util.Arrays;

public class SplitPractice1 {

    public static void main(String[] args) {
        String date = "12.03.2021";

        String[] splitDate = date.split(" \\. ");
        System.out.println(Arrays.toString(splitDate));

        if (splitDate[0].equals("12"));
        {
                System.out.println("its a correct month");
            }


        }

    }
