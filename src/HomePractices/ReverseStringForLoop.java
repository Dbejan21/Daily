package HomePractices;

public class ReverseStringForLoop {

    public static void main(String[] args) {
        String str = "Alexandra";
        int i;
        String reverse = "";
        for (i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
