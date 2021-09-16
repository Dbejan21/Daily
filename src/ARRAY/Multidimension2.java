package ARRAY;

import java.util.Arrays;

public class Multidimension2 {
    public static void main(String[] args) {

        String[][] states = new String[3][2];
        states[0][0] = "NY";
        states[0][1] = "PA";
        states[1][0] = "IL";
        states[1][1] = "OH";
        states[2][0] = "CA";
        states[2][1] = "WA";

        System.out.println(Arrays.deepToString(states));

        String [] stateEmails = new String[6];
        int c =0;
        for (int i = 0; i < states.length; i++) {
            for (int j = 0; j < states[i].length; j++) {

                for (String [] state:states) {
                    for (String st:state) {
                        System.out.println(st.toUpperCase() +"@info.com");

                    }

                }

                System.out.println(states[i][j]);
                System.out.println();

            }
        }


    }
}