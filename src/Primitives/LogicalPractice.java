package Primitives;

public class LogicalPractice {
    public static void main(String[] args) {

        // there is an event for kids they must be 5 older than 5, 12 or younger than 12
        // the other req needs be more  46" or taller than 46" to be able to attend

      /*  int kidAge = 12;
        int kidHeight = 56;

        int minAge = 5;
        int maxAge = 12;

        int reqHeight = 46;

        boolean pass = (kidAge >=minAge &&kidAge <= maxAge) && kidHeight >=reqHeight;
        System.out.println(pass); */

int kidAge = 2;

int kidHeight = 36;
int minAge = 5;
int maxAge= 12;
int reqHeight = 46;

boolean ok = kidAge >=minAge && kidAge <=maxAge && kidHeight >= reqHeight;
        System.out.println(ok);
    }
}