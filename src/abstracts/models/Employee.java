package abstracts.models;

public abstract class Employee extends Person{
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("printing....");
    }

    public abstract void calculateBonus();

}
