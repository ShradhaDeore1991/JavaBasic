package org.example;

public class Employee {
    private int id;
    private String name;
    private String lastname;

    private String department;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDepartment() {
        return department;
    }-----

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "id :" + id +
                ", name :'" + name + '\'' +
                ", lastname :'" + lastname + '\'' +
                ", address :'" + department ;
    }
}
