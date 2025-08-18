package com.roshni.assignment2;

import java.util.Scanner;

/**
 * Commission class stores employee details and calculates commission.
 */
public class Commission {
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    /**
     * Accept details using the provided Scanner (avoids multiple scanners on System.in).
     */
    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine().trim();

        System.out.print("Enter Address: ");
        address = sc.nextLine().trim();

        // Basic phone input (store as string to preserve leading zeros if any)
        System.out.print("Enter Phone: ");
        phone = sc.nextLine().trim();

        // Read salesAmount with validation to ensure numeric & non-negative
        while (true) {
            System.out.print("Enter Sales Amount: ");
            String token = sc.nextLine().trim();
            try {
                salesAmount = Double.parseDouble(token);
                if (salesAmount < 0) {
                    System.out.println("Sales amount cannot be negative. Try again.");
                    continue;
                }
                break; // valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a numeric value (e.g., 45000 or 45000.50).");
            }
        }
    }

    /**
     * Calculate commission per the given rules and print details.
     */
    public void calculateCommission() {
        double percent;
        if (salesAmount >= 100000.0) {
            percent = 10.0;
        } else if (salesAmount >= 50000.0) {
            percent = 5.0;
        } else if (salesAmount >= 30000.0) {
            percent = 3.0;
        } else {
            percent = 0.0;
        }

        double commissionAmount = salesAmount * percent / 100.0;

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name         : " + name);
        System.out.println("Address      : " + address);
        System.out.println("Phone        : " + phone);
        System.out.printf("Sales Amount : %.2f%n", salesAmount);
        System.out.printf("Commission   : %.2f (%.1f%%)%n", commissionAmount, percent);
    }
}
