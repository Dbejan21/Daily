package Mentoring;

public class ArrayPrc2 {

    public static void main(String[] args) {
        int[] numbers = {4,4,5,12,6,7,12,7,1,1,2,2,3};
        String unique = "";
        for (int i = 0; i < numbers.length ; i++) {
boolean isUnique =true;
            for (int j = 0; j <i; j++)
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                }

        }
        System.out.println(unique);
    }
}
