package org.example;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.example.Employee;
import org.example.EmployeeDao;
import org.example.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) applicationContext.getBean("std1");
        EmployeeDao employeeDao =(EmployeeDao)applicationContext.getBean("dao");
        int count = 0,counter=0;
        Scanner sc = new Scanner(System.in);
        while (1!=counter) {

            System.out.println("Welcome to employeeDetails Database Using JdbcTemplate");

            System.out.println("Enter 1 to see of particular employee the details");
            System.out.println("Enter 2 to insert the details");
            System.out.println("Enter 3 to update the details");
            System.out.println("Enter 4 to delete the details");
            System.out.println("Enter 5 to see all employee details");
            System.out.println("Enter 6 to update Name of employee details");
            System.out.println("Enter 7 to update LastName of employee details");
            System.out.println("Enter 8 to update Department of employee details");
            System.out.println("Enter 9 for exists");
            try {
                count = Integer.parseInt(sc.next());
            } catch (NumberFormatException ex) {
                System.out.println("Enter the given option");
            }
            switch (count) {
                case 1:
                    System.out.println("Enter Employee Id to see the details");
                    employeeDao .findById(Integer.parseInt(sc.next()));
                    break;
                case 2:
                    System.out.print("Enter the employee Id :");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the employee Name :");
                    employee.setName(sc.next());
                    System.out.print("Enter the employee Lastname :");
                    employee.setLastname(sc.next());
                    System.out.print("Enter the employee Department:");
                    employee.setDepartment(sc.next());

                    int i = employeeDao .save(employee);
                    if (i > 0) {
                        System.out.println(i);
                        System.out.println("Data is Successfully Inserted");
                    } else System.out.println("Inserted employee already present");
                    break;

                case 3:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the new  employee Name for update Employee Name");
                    employee.setName(sc.next());
                    System.out.print("Enter the new employee Lastname for update Employee LastName");
                    employee.setLastname(sc.next());
                    System.out.print("Enter the new employee Department for update Employee Address");
                    employee.setDepartment(sc.next());

                    boolean check1 = employeeDao .updateById(employee);
                    if (check1) {
                        System.out.println("Employee details  is successfully updated");
                    } else {
                        System.out.println("Employee details  is not successfully updated");
                    }
                    break;
                case 4:
                    System.out.println("please Enter the Employee id to delete existing employee information");
                    employee.setId(Integer.parseInt(sc.next()));
                    boolean check2 = employeeDao.delete(employee.getId());
                    if (check2) {
                        System.out.println("Employee details  is successfully deleted");
                    } else {
                        System.out.println("Employee details  is not successfully deleted");
                    }
                    break;
                case 5:
                    System.out.println("Please wait to see the all employee details");
                    List<Employee> students;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    List<Employee> students1 = employeeDao.findAll();
                    for (Employee s : students1) System.out.println(s);
                    System.out.println();
                    System.out.println();
                    System.out.println();;
                    break;
                case 6:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the new  employee Name for update Employee Name:");
                    employee.setName(sc.next());
                    boolean check3 = employeeDao.updateName(employee.getId(),employee.getName());
                    if (check3) {

                        System.out.println("Employee Name  is successfully Updated");
                    } else {
                        System.out.println("Employee Name is not successfully Updated");
                    }
                    break;
                case 7:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the  new lastname  for update employee Lastname:");
                    employee.setLastname(sc.next());
                    boolean check4 = employeeDao.updateName(employee.getId(),employee.getLastname());
                    if (check4) {
                        System.out.println("Employee LastName  is successfully Updated");
                    } else {
                        System.out.println("Employee LastName  is not successfully Updated");
                    }
                    break;

                case 8:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the  new Address  for update employee Address:");
                    employee.setDepartment(sc.next());
                    boolean check6 = employeeDao.updateAddress(employee.getId(),employee.getDepartment());
                    if (check6) {
                        System.out.println("Employee Department is successfully Updated");
                    } else {
                        System.out.println("Employee Department is not successfully Updated");
                    }
                    break;

                case 9:
                    counter++;
                    break;
                default:
                    System.out.println("Please Enter Valid Number");
                    break;
            }
        }
    }
}