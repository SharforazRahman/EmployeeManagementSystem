package com.empmanagementsystem;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empSet = new HashSet<Employee>();

    Employee employee1 = new Employee(101, "sharforaz", 23, "CSE", "Developer", 30000);
    Employee employee2 = new Employee(102, "Tahmid", 24, "CSE", "Developer", 40000);
    Employee employee3 = new Employee(103, "Polock", 23, "CSE", "Developer", 35000);
    Employee employee4 = new Employee(104, "Turjo", 23, "CSE", "Developer", 30000);

    Scanner sc = new Scanner(System.in);
    boolean found = false;
    int id;
    String name;
    int age;
    String department;
    String designation;
    double sal;

    public EmployeeService() {
        empSet.add(employee1);
        empSet.add(employee2);
        empSet.add(employee3);
        empSet.add(employee4);
    }

    //View All Employee
    public void viewAllEmp() {
        for (Employee emp : empSet) System.out.println(emp);
    }

    //View Employee based on their Id;
    public void viewEmp() {
        System.out.println("Enter ID:");
        id = sc.nextInt();
        for (Employee employee : empSet) {
            if (employee.getId() == id) {
                found = true;
                System.out.println(employee);
            }
        }
        if(!found){
            System.out.println("Employee is not found");
        }
    }

    //Update Employee;

    public void updateEmployee(){
        System.out.println("Enter ID");
        id = sc.nextInt();
        boolean found = false;
        for(Employee emp : empSet){
            if(emp.getId() == id){
                System.out.println("Enter Name");
                name = sc.next();
                System.out.println("Enter New Salary");
                sal = sc.nextDouble();
                emp.setName(name);
                emp.setSalary(sal);
                System.out.println("Updated Details of Employee are: ");
                System.out.println(emp);
                found = true;
            }
        }
        if(!found) System.out.println("Employee not found!");
        else System.out.println("Employee updated successfully");
    }

    //Delete Employee;
    public void deleteEmp(){
        System.out.println("Enter id");
        id = sc.nextInt();
        boolean found = false;
        Employee empDelete = null;
        for(Employee i : empSet){
            if(i.getId() == id){
                empDelete = i;
                found = true;
            }
        }
        if(!found) System.out.println("Employee is not present");
        else{
            empSet.remove(empDelete);
            System.out.println("Employee Deleted Successfully");
        }
    }

    //Add Employee
    public void addEmp(){
        System.out.println("Enter ID:");
        id = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter Designation");
        designation = sc.next();
        System.out.println("Enter Department");
        department = sc.next();
        System.out.println("Enter Salary");
        sal = sc.nextDouble();

        Employee employee = new Employee(id,name,age,designation,department,sal);
        empSet.add(employee);
        System.out.println(employee);
        System.out.println("Employee Added Successfully");
    }
}
