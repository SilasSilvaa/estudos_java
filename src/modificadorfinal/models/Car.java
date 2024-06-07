package modificadorfinal.models;

public class Car {
    private String name;
    public static final double LIMIT_SPEED = 250;
    public final Buyer BUYER = new Buyer();

    public Buyer getBUYER() {
        return BUYER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
