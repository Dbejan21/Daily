package HomePractices;

public class ReverseStringWhileLoop {
    public static void main(String[] args) {
        String str = "Alexandra";
        int i = str.length() - 1;// length of string is 9 ,to show last index a / length) -1
        String reverse = "";
        while (i >= 0) {

            reverse += str.charAt(i);
            i--;
        }
        System.out.println(reverse);
    }



}
