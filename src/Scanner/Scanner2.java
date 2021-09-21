package Scanner;



import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

      Scanner input = new Scanner (System.in); // this is creation of scanner object

      System.out.println("Please enter your name ");
      String name = input.nextLine();// input.next()
        System.out.println("enter your age ");
        int age =input.nextInt();
        System.out.println("Your name is " +name +" ," +"your age is  " + age);

        System.out.println("your age will be " + (age +10)+ " in 10 years");
        System.out.println( "please enter your city name");
         name += input.next();
        System.out.println(name);





    }
}
