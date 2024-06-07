package polymorphism;

import polymorphism.models.*;
import polymorphism.service.CalculateTax;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10", 1000);
        Tomato tomato = new Tomato("Tomato", 10);

        CalculateTax.calculateTax(computer);
        CalculateTax.calculateTax(tomato);

        Product product = new Computer("C", 1000);
        CalculateTax.calculateTax(product);

        Repository repository = new RepositoryDataBase();
//      Repository repository = new RepositoryFile();
        repository.save();
    }
}
