package org.example;

import java.util.List;

public class Address {
   private List<String> city;
    private List<String> country;

    public Address() {
    }

    public Address(List<String> city, List<String> country) {
        this.city = city;
        this.country = country;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
