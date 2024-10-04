# Employee Payroll System
<img src="https://github.com/nravim7/employee-payroll-system/raw/master/Mar-Business_11.jpg" alt="Employee Payroll System" width="500"/>

## Overview
The Employee Payroll System is a simple Java application that demonstrates how to manage employees and calculate their salaries. It supports both Full-Time and Part-Time employees, allowing for different methods of salary computation. The system allows for the addition and removal of employees, as well as displaying employee details, including their calculated salary.

## Features

- **Abstract Employee Class**: Provides a base structure for all types of employees.
- **Full-Time Employee**: Has a fixed monthly salary.
- **Part-Time Employee**: Paid based on hourly rates and the number of hours worked.
- **Payroll System**:
  - Add employees (both full-time and part-time).
  - Remove employees by their ID.
  - Display employee details, including name, ID, and calculated salary.

## Class Breakdown

### 1. `Employee` (Abstract Class)
This is the base class for all employees.
- **Attributes**:
  - `name` (String): The employee's name.
  - `id` (int): Unique ID for the employee.
- **Methods**:
  - `calculateSalary()`: Abstract method that will be implemented by subclasses.
  - `toString()`: Returns a formatted string containing employee details (name, id, and salary).

### 2. `FullTimeEmployee` (Subclass of `Employee`)
Represents a full-time employee who receives a fixed monthly salary.
- **Attributes**:
  - `monthlySalary` (double): The fixed monthly salary for the employee.
- **Methods**:
  - `calculateSalary()`: Returns the monthly salary.

### 3. `PartTimeEmployee` (Subclass of `Employee`)
Represents a part-time employee who is paid based on hours worked.
- **Attributes**:
  - `hourlyRate` (double): The rate per hour.
  - `hoursWorked` (int): The total number of hours worked.
- **Methods**:
  - `calculateSalary()`: Returns the total salary based on hours worked and hourly rate.

### 4. `PayRollSystem`
Manages a list of employees and allows you to:
- Add new employees (`addEmployee()`).
- Remove employees by their ID (`removeEmployee()`).
- Display details of all employees in the system (`displayEmployees()`).

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/nravim7/employee-management-system.git
   ```
   
2. Navigate to the project directory:
   ```bash
   cd employee-management-system
   ```

3. Compile the Java files:
   ```bash
   javac Main.java
   ```

4. Run the program:
   ```bash
   java Main
   ```

## Sample Output

```
Initial Employee Details: 
Employee[name = Shashi, id = 1, salary = 70000.0]
Employee[name = Alex, id = 2, salary = 4000.0]
Removing Employee....
Remaining Employees Details: 
Employee[name = Shashi, id = 1, salary = 70000.0]
```

## Future Enhancements

- Add more employee types, such as contractors.
- Implement an interface for more flexible salary calculations.
- Add a graphical user interface (GUI) for a better user experience.
- Save employee data to a file or database for persistence.



---

Feel free to fork the project, submit issues, or contribute improvements! 😊
