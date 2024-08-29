package EmployeeManagement;

public class EnployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("hari", 65900,"development",21);
        Manager manaager1 = new Manager("shyam", 70000,"Computing",29,5000);

        employee1.displayEmployeeInfo();
        System.out.println("------------------------------------");
        manaager1.displayEmployeeInfo();
        System.out.println("--------------------------------------");

        employee1.raiseSalary(10);
        manaager1.raiseSalary(10);


        employee1.displayEmployeeInfo();
        System.out.println("----------------------------------------");
        manaager1.displayEmployeeInfo();
    }
}
