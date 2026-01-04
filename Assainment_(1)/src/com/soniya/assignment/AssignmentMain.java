package com.soniya.assignment;
import com.soniya.assignment_employees.Manager;
import com.soniya.assignment_employees.Developer;
import com.soniya.assignment_utilities.EmployeeUtilities;

public class AssignmentMain {

    public static void main(String[] args) {

        // Manager object
        Manager manager = new Manager();
        manager.setName("Soniya");
        manager.setEmployeeId(101);
        manager.setSalary(80000);
        manager.setTeamSize(5);

        // Developer object
        Developer developer = new Developer();
        developer.setName("Vaishnavi");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        // Display details using utilities
        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(developer, 5000);
        System.out.println("\nDeveloper Salary After Increment:");
        EmployeeUtilities.displayEmployeeDetails(developer);
    }
}

