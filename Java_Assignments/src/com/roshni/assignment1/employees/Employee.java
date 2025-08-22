package com.roshni.assignment1.employees;

public class Employee {
    private String name;       // private → only inside class
    private String id;
    protected double salary;   // protected → subclasses can access

    // Constructor
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Public getters and setters (accessible everywhere)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    // Public method (accessible across packages)
    public double calculateBonus() {
        return salary * 0.10; // base 10% bonus
    }

    @Override
    public String toString() {
        return name + " (" + id + "), Salary: " + salary;
    }
}
