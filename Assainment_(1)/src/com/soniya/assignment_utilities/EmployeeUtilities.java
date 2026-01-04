package com.soniya.assignment_utilities;
import com.soniya.assignment_employees.Employee;

/**
 * Utility class for Employee-related operations.
 * Demonstrates use of public methods across packages.
 */
public class EmployeeUtilities {

    /**
     * Displays employee details.
     */
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Increases employee salary.
     */
    public static void increaseSalary(Employee employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
    }
}
