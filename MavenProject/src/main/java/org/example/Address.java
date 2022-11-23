package org.example;

public class Address {
    private String city;
    private int pincode;

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincoad=" + pincode +
                '}';
    }
}
