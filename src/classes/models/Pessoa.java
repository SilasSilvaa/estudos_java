package classes.models;

public class Pessoa {
    public String name;
    public int yearsOld;
    public char gender;

    public void getMessage(){
        System.out.println("Hello!! " + this.name);
    }
}
