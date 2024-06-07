package enums.models;

public class Client {
    private String name;
    private TypeClient type;
    private TypePayment typePayment;

    public Client(String name, TypeClient type) {
        this.name = name;
        this.type = type;
    }

    public Client(String name, TypeClient type, TypePayment typePayment){
        this.name = name;
        this.type = type;
        this.typePayment = typePayment;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type=" + type.getVALUE() +
                ", type=" + type +
                '}';
    }

    public TypePayment getTypePayment() {
        return typePayment;
    }

    public void setTypePayment(TypePayment typePayment) {
        this.typePayment = typePayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getType() {
        return type;
    }

    public void setType(TypeClient type) {
        this.type = type;
    }
}
