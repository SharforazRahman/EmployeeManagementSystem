package com.empmanagementsystem;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee> empSet = new HashSet<Employee>();

    Employee employee1 = new Employee(101,"sharforaz",23,"CSE","Developer",30000);
    Employee employee2 = new Employee(102,"Tahmid",24,"CSE","Developer",40000);
    Employee employee3 = new Employee(103,"Polock",23,"CSE","Developer",35000);
    Employee employee4 = new Employee(104,"Turjo",23,"CSE","Developer",30000);

    Scanner sc = new Scanner(System.in);
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
}
