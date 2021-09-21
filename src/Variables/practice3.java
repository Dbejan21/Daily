package Variables;

public class practice3 {
    public static void main(String[] args){

        int apple;// Declaring the variable which means giving the data type and and name
        apple=25;// intiakizing the variablng in one line
        System.out.println("Number of apples:" + apple);// which is assigning the value of it
        int banana =2;// declaring and initializi // it will show 25

        apple=23;

        System.out.println("Number of apples: " +apple); //will show 23

        int $apple=10;
        int _apple=11;
        int _apple$=12;
        int apple_=13;
        //int %apple=15; int 2apple=16; these are compile time error
        int apple2=17; //you can only add numbers in the end
        int a$pp$le=18;



        //there 23 apples and 2 bananas
        int applePrice=3;
        int bananaPrice=2;

        int totalApplePrice=apple*applePrice;
        int totalBananaPrice=banana*bananaPrice;


        System.out.println(totalApplePrice+totalBananaPrice+ " is your total payment");


    }
}
