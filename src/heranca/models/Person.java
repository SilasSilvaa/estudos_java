package heranca.models;

public class Person{
    protected String name;
    protected String document;
    protected Address address;

    public Person(String name){
        this.name = name;
    }

//    public Person(String name, String document) {
//        this(name);
//        this.document = document;
//    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.document);
        System.out.println(this.address.getStreetName() + " " + this.address.getPostalCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
