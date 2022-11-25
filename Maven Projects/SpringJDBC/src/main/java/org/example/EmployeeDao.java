package org.example;

import org.example.Employee;

import java.util.List;

public interface EmployeeDao {
    public int save(Employee st);

    public boolean updateById(Employee st);

    public boolean updateName(int id, String name);

    public boolean updateLastName(int id, String lastname);

    public boolean updateMobileNo(int id, long mobileno);

    public boolean updateAddress(int id, String address);

    public Employee findById(int id);

    public boolean delete(int id);


    List<Employee> findAll();
}