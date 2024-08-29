# Employee Management System

A simple Employee Management System built using Object-Oriented Programming principles in Java. This system allows a small company to manage its employees' information, including their name, age, department, salary, and additional attributes for managers like bonuses.

## Features

- **Employee Class**: Manages basic employee information such as name, age, department, and salary.
- **Manager Class**: Inherits from the Employee class and adds functionality to handle additional attributes like bonuses.
- **Salary Management**: Includes methods to raise an employee's salary by a certain percentage.
- **Information Display**: Provides methods to display employee and manager information in a readable format.

## Classes and Methods

### 1. `Employee` Class

The `Employee` class is the base class with the following attributes and methods:

- **Attributes**:
    - `String name`: The name of the employee.
    - `int age`: The age of the employee.
    - `String department`: The department the employee belongs to.
    - `double salary`: The salary of the employee.

- **Methods**:
    - **Constructor**: Initializes all attributes.
    - **Getters and Setters**: For each attribute to encapsulate and access the data.
    - `void raiseSalary(double percentage)`: Increases the employee's salary by a given percentage.
    - `void displayEmployeeInfo()`: Prints out the employee's information in a readable format.

### 2. `Manager` Class

The `Manager` class extends the `Employee` class and adds the following attribute and methods:

- **Attributes**:
    - `double bonus`: The bonus amount for the manager.

- **Methods**:
    - **Constructor**: Initializes all attributes including those inherited from the `Employee` class.
    - `double calculateTotalSalary()`: Returns the total salary, which is the sum of the base salary and the bonus.
    - **Override `displayEmployeeInfo()`**: Displays both the inherited employee information and the manager-specific bonus.

### 3. `EmployeeTest` Class

The `EmployeeTest` class includes the `main` method to demonstrate the functionality of the system:

- Creates an instance of the `Employee` class.
- Creates an instance of the `Manager` class.
- Displays the information of both the employee and the manager.
- Raises the salary of both the employee and the manager by 10%.
- Displays the updated information of both.

![Diagram showing output of the program](./image/Screenshot 2024-08-29 092908.png)


## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/divyaSht04/INTERNSHIP-JAVA-/tree/main/src/EmployeeManagement
   cd EmployeeManagement
