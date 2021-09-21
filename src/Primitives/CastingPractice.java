package Primitives;

public class CastingPractice {
    public static void main(String[] args) {


        long l1= 120;
        // int i1= l1; larger data type cannot store in small data type

        int i2 = (int)l1; // explicit casting (auto narrowing)

        double db = l1; // implicit casting (auto widening)

        short apple =800;
        short samsung = 600;
       short total= (short) (apple+ samsung);
        System.out.println(total);

        byte total1 = (byte) (apple + samsung);

        System.out.println("total -->" + total1);

        int total2 = apple+samsung;

        double d1 = 2.3;
         int i = 12;

         i += d1; //i =i +d1 12 +2.3 = 14.3
        // when you do compound assignments you don't need to do
        // explicit casting
        System.out.println(i);



    }
}
