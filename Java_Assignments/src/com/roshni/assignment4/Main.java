package com.roshni.assignment4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();       // 1 for AirIndia, 2 for KingFisher, 3 for Indigo
        int hours = sc.nextInt();        // hours of travel
        double costPerHour = sc.nextDouble(); // cost per hour

        Airfare airfare = null;

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        // Calculate and print result rounded to 2 decimal places
        System.out.printf("%.2f", airfare.calculateAmount());
        sc.close();
    }
}
