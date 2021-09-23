package Methods;

public class BMI {

    // let's do for kg and meter

    public double bmi (int kg, double meter){
        double squareMeter = meter*meter;
        return kg/squareMeter;

    }
    // we are asked to calculate bmi in US
    public double bmi ( int pound, int feet, int inch){
        double kilogram = pound*0.45;
        double meter = feet *0.3+inch*0.025;
        double squareMeter = meter*meter;
        return kilogram/squareMeter;

    }

    public static void main(String[] args) {
        BMI bodyIndex = new BMI();
        System.out.println(bodyIndex.bmi(79,1.8));
        System.out.println(bodyIndex.bmi(174,5,10));


        ///whats overloading ?
        //
        //using the same method name with different paramaters


        //advantages of overloading
        // it is increases the readability of code
        // its more flexible so we can call same method with diff parameters
        // code looks cleaner
        // we can use the same method which saves memory for us
        // it increase the reusability of the code
}
}