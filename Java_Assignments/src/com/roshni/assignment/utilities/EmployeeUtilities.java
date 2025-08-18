package com.roshni.assignment.utilities;

import com.roshni.assignment.employees.Employee;

/**
 * Utility class with static methods for employees.
 */
public class EmployeeUtilities {

    // Public method accessible everywhere
    public static void giveRaise(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
    }

    // Public method to print employee details
    public static void printDetails(Employee emp) {
        System.out.println(emp.toString());
        System.out.println("Bonus: " + emp.calculateBonus());
    }
}
