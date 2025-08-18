package com.roshni.assignment2;

import java.util.Scanner;

public class Assignment2Main {
    public static void main(String[] args) {
        // 1. Create Student object -> prints message from default constructor
        Student s = new Student();

        // 2. Create one Scanner and pass it to Commission.acceptDetails
        try (Scanner sc = new Scanner(System.in)) {
            Commission comm = new Commission();
            comm.acceptDetails(sc);
            comm.calculateCommission();
        } // try-with-resources closes the Scanner automatically when done
    }
}
