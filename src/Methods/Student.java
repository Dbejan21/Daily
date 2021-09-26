package Methods;

import java.util.Random;

public class Student {
    String name;
    String lastName;
    int age;

    public void sleep(){

        System.out.println(name+ " is sleeping for "+ randomHour());
    }
    public static void study(){
        System.out.println(" is studying for ");
    }
    public void fun(){
        System.out.println(name+ " is having fun for "+ randomHour());
    }
    public int randomHour(){
        Random random = new Random();
        int newRandom=random.nextInt(10);
        return newRandom;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Diana";
        student.lastName = "Bejan";
        student.age =18;
        student.study();
        student.sleep();
        student.fun();

    }
    }

