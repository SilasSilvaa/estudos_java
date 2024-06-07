package polymorphism.models;

public class Tomato extends Product{

    public static final double TAX = 0.06;

    public Tomato(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tax...");
        return this.price * TAX;
    }
}
