package abstracts;

import abstracts.models.Developer;
import abstracts.models.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Silas", 10000);
        Developer developer = new Developer("Silas", 5000);

        manager.calculateBonus();
        System.out.println(manager);
        manager.print();

        developer.calculateBonus();
        System.out.println(developer);
        developer.print();
    }
}
