package org.example;

public class AddressBean {
    private String country;
    private String state;
    private String city;
    private int pincode;

    public AddressBean(String country, String state, String city, int pincode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    public AddressBean() {

    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "AddressBean{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
