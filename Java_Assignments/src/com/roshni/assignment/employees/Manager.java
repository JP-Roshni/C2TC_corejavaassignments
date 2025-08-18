package com.roshni.assignment.employees;

public class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, String id, double salary, String department, int teamSize) {
        super(name, id, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    // Overriding method
    @Override
    public double calculateBonus() {
        return salary * 0.15 + teamSize * 1000; // 15% bonus + team allowance
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }
}
