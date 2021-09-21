package String;

public class Methods1 {
    public static void main(String[] args) {
        String city = "Chicago";
        city.concat("is very cold");
        System.out.println(city); // --> Chicago
        System.out.println("*****************************");
        String newCity = city.concat(" is very beautiful");
        System.out.println(city);
        System.out.println(newCity);

        System.out.println(newCity.length());

        int letterCount =newCity.length();
        System.out.println(letterCount);

        city.charAt(0);//-->C
        System.out.println(city.charAt(3));
       /// city.charAt(9);
        System.out.println("it is almost go home");







    }
}
