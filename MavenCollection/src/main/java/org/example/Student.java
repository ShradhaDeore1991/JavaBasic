package org.example;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Student {
    private List<String> name;
    private Set <String> rollno;
    private Address address;

    public Student() {
    }

    public Student(List<String> name, Set<String> rollno,Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", rollno=" + rollno +
                ", address=" + address +
                '}';
    }
}

