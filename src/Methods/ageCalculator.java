package Methods;

public class ageCalculator {

    // create a method that will take one integer parameter for your bith year
    // this method simply calculates and prints your age

    public void ageCalculator (int birthyear){
        int age =2021-birthyear;
        System.out.println("Your age is: "+age);


    }

    public static void main(String[] args) {
        ageCalculator jerry = new ageCalculator();
        jerry.ageCalculator(2013);
    }
// overloading this method by passing a string parameter
    // which is going to be name of the person
    // and print out age of the person as
    // " .... your age is ....."

    public String ageCalculator (int birthyear, String name){

        int age =2021-birthyear;
        System.out.println(name+ " Your age is: "+age);

        return ""+age;
    }

}
