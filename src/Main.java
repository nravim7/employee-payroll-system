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

    public FullTimeEmployee(String name,int id, double monthlySalary) {
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

}

public class Main {

}
