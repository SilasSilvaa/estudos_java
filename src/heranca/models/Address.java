package heranca.models;

public class Address {
    private String streetName;
    private String postalCode;

    public Address(String streetName, String postalCode) {
        this.streetName = streetName;
        this.postalCode = postalCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
