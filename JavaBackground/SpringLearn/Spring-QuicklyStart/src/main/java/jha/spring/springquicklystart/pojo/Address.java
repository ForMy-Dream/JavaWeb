package jha.spring.springquicklystart.pojo;

public class Address {
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address() {
    }

    public Address(String street) {
        this.street = street;
    }
}
