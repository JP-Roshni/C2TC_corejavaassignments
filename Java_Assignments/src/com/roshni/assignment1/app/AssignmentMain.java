package com.roshni.assignment1.app;

import com.roshni.assignment1.employees.*;
import com.roshni.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager m1 = new Manager("Anita", "M001", 120000, "HR", 10);
        Developer d1 = new Developer("Ravi", "D002", 90000, "Java", "Senior");

        // Use utility class
        EmployeeUtilities.printDetails(m1);
        EmployeeUtilities.printDetails(d1);

        // Give raise
        EmployeeUtilities.giveRaise(m1, 10);
        EmployeeUtilities.giveRaise(d1, 15);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.printDetails(m1);
        EmployeeUtilities.printDetails(d1);
    }
}
