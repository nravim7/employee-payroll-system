import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    abstract public double calculateSalary();

    @Override
    public String toString() {
        return "Employee[name = " + name + ", id = " + id + ", salary = " + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return this.monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWork) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWork;
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate);
    }
}

class PayRollSystem {
    public ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int empId) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (empId == employee.getId()) {
                employeeToRemove = employee;
                break;
            }
        }

        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployees() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        PayRollSystem payRollSystem = new PayRollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Shashi", 1, 70000.00);
        PartTimeEmployee emp2 = new PartTimeEmployee("Alex", 2, 100, 40);
        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payRollSystem.displayEmployees();
        System.out.println("Removing Employee....");
        payRollSystem.removeEmployee(2);
        System.out.println("Remaining Employees Details: ");
        payRollSystem.displayEmployees();
    }

}
