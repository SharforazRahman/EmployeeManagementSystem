package com.empmanagementsystem;

import java.util.Scanner;

public class Main {
    EmployeeService service = new EmployeeService();
    static boolean ordering = true;

    public static void menu() {
        System.out.println("Welcome to Employee Management System");
        System.out.println("""
                1.Add Student
                2.Show All Students
                3.Get Student based on roll Number
                4.Delete Student
                5.Update Student
                6.Exist""");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter your Choice please: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Employee");
                    break;
                case 2:
                    System.out.println("View Employee");
                    break;
                case 3:
                    System.out.println("Update Employee");
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    break;
                case 5:
                    System.out.println("Thank you For Using Application !!");
                    System.exit(0);
                default:
                    System.out.println("Please Enter Valid Choice");
                    break;
            }
        } while (ordering);
    }
}
