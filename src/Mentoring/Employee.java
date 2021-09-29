package Mentoring;

import java.time.LocalDate;

public class Employee {
    String name;
    double salary;
    int hours;
    int hireYear;

    public Employee(String name, double salary, int hours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hours = hours;
        this.hireYear = hireYear;


    }
    public double taxCalculation(){

        if (salary>1000){
            return salary*0.03;
        }
        return 0.0;
    }
    public double bonusCalculation () {

        int overTime = hours - 40;
        if (overTime > 0) {
            return overTime * 30;
        }
        return 0.0;
    }
    public double increaseSalary() {
        LocalDate date = LocalDate.now();

        int year = 2021 - hireYear;
        if (year < 10) {
            return salary * 0.05;

        } else if (9 < year && year < 20) {
            return salary * 0.1;

        }else {
            return salary*0.15;
        }
    }


        public void info() {

            System.out.println("name is " + name );
            System.out.println(" salary is " + salary);
            System.out.println("work hours  " + hours);
            System.out.println( "hire year  "+ hireYear);
            System.out.println("Tax : "+ taxCalculation());
            System.out.println("Increase salary " +increaseSalary());
            System.out.println(salary-taxCalculation()+bonusCalculation());
            System.out.println("Total salary is with Tax "+ taxCalculation() + salary);

        }
    }