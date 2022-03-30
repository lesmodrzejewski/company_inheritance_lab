package staff;

public abstract class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double increase) {
        return salary += increase;
    }

    public double payBonus() {
        return salary * 0.01;
    }


}
