package Loops;

public class CountLetters {


    public static void main(String[] args) {
        // I want to solve this question by myself this time
        // count how many 'i' and 'I' are in the given sentence
        // print >> there are .. . is in the given sentence

        String sentence = "I want to solve this question by myself this time";
        int index = 0;
        int count = 0;

        while (index < sentence.length()) {

            if (sentence.charAt(index) == 'i' || sentence.charAt(index) == 'I') {

                count++;

            }
            index++;


        }
        System.out.println("there are " + count + "'i' in the sentence");

    }

}


