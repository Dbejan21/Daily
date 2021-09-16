package Loops;

public class StarPractice {
    public static void main(String[] args) {

        // user gives you 5 ==>
        //*
        //**
        //***
        //****
        //*****

        int num = 5;
        String stars = "*";

        while (num > 0) {
            num--;
            System.out.println(stars);
            stars += "*";
        }
    }
}
