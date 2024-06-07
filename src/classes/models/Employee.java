package classes.models;

import java.util.Arrays;

public class Employee {
    private String name;
    private int yearsOld;
    private double[] salaries;
    private double average;

    //Overloading of constructors
    public Employee(String name, int yearsOld, double[] salaries){
        this();
        this.name = name;
        this.yearsOld = yearsOld;
    }
    public Employee(){}

    //Overloading of methods
    public void init(String name, int yearsOld){
        this.name = name;
        this.yearsOld = yearsOld;
    }
    public void init(String name, int yearsOld, double[] salaries){
        this.init(name, yearsOld);
        this.salaries = salaries;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.yearsOld);
        System.out.println(Arrays.toString(this.salaries));
    }

    public void averageSalary(){
        for(double currentSalary : salaries){
                average += currentSalary;
        }

        average /= salaries.length;
        System.out.println(average);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }
}
