package com.roshni.assignment1.employees;

public class Developer extends Employee {
    private String language;
    private String level; // Junior / Mid / Senior

    public Developer(String name, String id, double salary, String language, String level) {
        super(name, id, salary);
        this.language = language;
        this.level = level;
    }

    // Overriding method
    @Override
    public double calculateBonus() {
        if (level.equalsIgnoreCase("Senior")) {
            return salary * 0.20; // 20% bonus
        } else if (level.equalsIgnoreCase("Mid")) {
            return salary * 0.12; // 12% bonus
        } else {
            return salary * 0.08; // 8% bonus
        }
    }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}
