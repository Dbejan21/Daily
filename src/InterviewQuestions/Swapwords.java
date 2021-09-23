package InterviewQuestions;

import java.util.Arrays;

public class Swapwords {

    public static void main(String[] args) {
        String[] array = {"four", "flowers", "sun", "eleven", "cloud", "better", "git"};

        String temp;
        for (int i = 0; i < array.length - 1; i++) {

            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            i++;


        }
        System.out.println(Arrays.toString(array));


        String[] array3 = {"2", "1", "4", "3", "6", "5", "7"};
        String temp1;
        for (int i = 0; i < array3.length; i += 2) {
            temp1 = array3[i];
            array3[i] = array3[i + 1];
            array3[i + 1] = temp1;

        }
        System.out.println(Arrays.toString(array3));
    }
}
