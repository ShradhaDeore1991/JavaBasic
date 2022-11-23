package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Address {
    private List<String> city;
    private Set<String> country;
    private Map<String,String> pincode;

    public Address() {
    }

    public Address(List<String> city, Set<String> country, Map<String, String> pincode) {
        this.city = city;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", country=" + country +
                ", pincode=" + pincode +
                '}';
    }
}
