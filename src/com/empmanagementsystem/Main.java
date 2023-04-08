package com.empmanagementsystem;

import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("                           Welcome to Employee Management System");
        System.out.println("                    -----------------------------------------------------");
        System.out.println();
        System.out.println("""
                1.Add Employee
                2.View Employee
                3.Update Employee
                4.Delete Employee
                5.View all Employee
                6.Exist""");
    }

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter your Choice please: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Add Employee");
                    service.addEmp();
                }
                case 2 -> {
                    System.out.println("View Employee");
                    service.viewEmp();
                }
                case 3 -> {
                    System.out.println("Update Employee");
                    service.updateEmployee();
                }
                case 4 -> {
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                }
                case 5 -> {
                    System.out.println("View All Employee");
                    service.viewAllEmp();
                }
                case 6 -> {
                    System.out.println("Thank you For Using Application !!");
                    System.exit(0);
                }
                default -> System.out.println("Please Enter Valid Choice");
            }
        } while (ordering);
    }
}
