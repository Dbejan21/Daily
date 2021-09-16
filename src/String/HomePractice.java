package String;

public class HomePractice {
    public static void main(String[] args) {


        String x = "I love Java";

        String sub = x.substring(x.indexOf(" "), x.indexOf(" ", x.indexOf(" ")+1)  );
        System.out.println(sub);
    }
}
