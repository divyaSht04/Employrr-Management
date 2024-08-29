package EmployeeManagement;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, double salary, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void raiseSalary(double percentage){
        this.salary = this.salary + (this.salary*(percentage/100));
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}
