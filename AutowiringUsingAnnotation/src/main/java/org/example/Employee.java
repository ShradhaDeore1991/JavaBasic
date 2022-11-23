package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Employee() {
    }
//    @Autowired
//    @Qualifier("address1")
    public Employee(Address address) {
        System.out.println("Inside constructor");
        this.address = address;
    }
//    @Autowired
//    @Qualifier("address1")
    public void setAddress(Address address) {
        System.out.println("Setting value");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
