package exercise.models;

public class Student {
    private String name;
    private int yearsOld;
    private Seminar seminar;

    public Student(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }

    public Student(String name, int yearsOld, Seminar seminar) {
        this.name = name;
        this.yearsOld = yearsOld;
        this.seminar = seminar;
    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("YearsOld: " + this.yearsOld);

        if(seminar == null) return;
        this.seminar.print();

    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
