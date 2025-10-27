public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract double calculateBonus();

    // Concrete method (shared by all employees)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
}
