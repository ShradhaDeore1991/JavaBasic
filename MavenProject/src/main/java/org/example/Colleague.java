package org.example;

public class Colleague {
    private String name;
    private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Colleague{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
