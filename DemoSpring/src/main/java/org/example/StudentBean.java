package org.example;



public class StudentBean {
    private String name;
    private String lastname;
    private AddressBean address;

    public StudentBean(String name, String lastname, AddressBean address) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
    }

    public StudentBean() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address +
                '}';
    }
}
