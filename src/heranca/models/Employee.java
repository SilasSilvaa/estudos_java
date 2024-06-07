package heranca.models;

public class Employee extends Person {
    private double salary;

    public Employee(String name){
        super(name);

    }

    @Override
    public void print(){
        super.print();
        System.out.println(this.getSalary());
    }

    public void report(){
        System.out.println(this.name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
