package collections.models;

import java.util.Objects;


public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;
    private int amount;

    public Manga(Long id, String name, double price, int amount) {
        this(id, name, price);
        this.amount = amount;
    }

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "Id not be null");
        Objects.requireNonNull(name, "Name not be null");

        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Manga o) {
//        if(this.id < o.id){
//            return -1;
//        }
//        if(this.id.equals(o.getId())){
//            return 0;
//        }
//        return 1;
        return this.getName().compareTo(o.getName());
//        return this.id.compareTo(o.getId());
//        return Double.valueOf(this.price).compareTo(o.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(name, manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
