package Switch;

public class Prc2 {
    public static void main(String[] args) {
        String name ="Sophia".toUpperCase();
        switch (name){

            case "ALEX" :
                System.out.println("Alex is here");
                break;

            case "David" :
                System.out.println("Davis is here");
                break;

            case "LUNA" :
                System.out.println("Luna is here");
                break;
            default:
                System.out.println("Student is absent");
                break;


        }
    }
}
