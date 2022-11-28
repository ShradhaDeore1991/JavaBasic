package org.example.repository;
import javax.persistence.Entity;

import org.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}
