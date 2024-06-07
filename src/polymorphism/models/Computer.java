package polymorphism.models;

public class Computer extends Product{

    public static final double TAX = 0.21;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tax...");
        return this.price * TAX;
    }

    public void getInfo(){
        System.out.println("Info");
    }
}
