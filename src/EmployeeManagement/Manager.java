package EmployeeManagement;

public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, String department, int age, double bonus) {
        super(name, salary, department, age);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateTotalSalary(){
        double totalSalary = getSalary() + bonus;
        return totalSalary;
    }

}
