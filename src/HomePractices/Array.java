package HomePractices;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Tesla"};

        System.out.println(cars[2]);

        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        cars1[2] = "Opel";
        System.out.println(cars1[2]);

        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars2.length);

        String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars3.length; i++) {
            System.out.println(cars3[i]);


        }


    }
}