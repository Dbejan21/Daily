package ARRAY;

import java.util.Arrays;
import java.util.Locale;

public class SortingPrc {
    public static void main(String[] args) {
        int numbers []= {45,5,47,57,8,12,0,30};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);// sort method will pull elements in ascending order (from smaller to larger)
        System.out.println(Arrays.toString(numbers));

        String []colors = {"Red", "Yellow", "Blue", "Black","White", "Pink", "Brown" ,"13", "aAbc", "adgd" ,"brown"};

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).toLowerCase());

        for (int i = 0; i < colors.length; i++) {
            colors[i]=colors[i].toLowerCase();

        }
        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));


    }
}
