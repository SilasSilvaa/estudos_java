package polymorphism.service;

import polymorphism.models.Computer;
import polymorphism.models.Product;
import polymorphism.models.Tomato;

public class CalculateTax {

    public static void calculateTax(Product product){
        System.out.println("Report tax " + product.getName());
        double tax = product.calculateTax();
        System.out.println("Value: " + product.getPrice());
        System.out.println("tax: " + tax);

        if(product instanceof Computer){
            Computer computer = (Computer) product;
            computer.getInfo();
        }
        System.out.println("----------------------");
    }
}
