package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private int rollno;
    private Map<Address, Subject> marks;

    public Student() {
    }

    public Student(String name, int rollno, Map<Address, Subject> marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno( int rollno) {
        this.rollno = rollno;
    }

    public void setMarks(Map<Address, Subject> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
