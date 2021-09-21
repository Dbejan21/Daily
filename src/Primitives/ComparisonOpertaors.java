package Primitives;

public class ComparisonOpertaors {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 4;
        System.out.println(a==b); // false
        System.out.println(b ==c ); //

        System.out.println( a==c);

        System.out.println(!(a==b));
        System.out.println(!(b==c));

//===============================================///
        System.out.println(a !=b);
        System.out.println(b != c);

        System.out.println(!(b != c));


        //=================================//

        System.out.println(a > b);

        System.out.println( b > c);

        System.out.println(a < b);
        System.out.println( a < c);
        System.out.println(b < c);


        ///----------------------------------//

        System.out.println(a >= b);//false

        System.out.println( c >= b); //true

        //______________________//

        System.out.println( c <=b); // true
        System.out.println( a <= c); // true



    }
}
