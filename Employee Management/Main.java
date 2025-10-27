import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Alice", 5000, 8.5));
        employees.add(new Developer("Bob", 3000, 5));
        employees.add(new Developer("Charlie", 3500, 7));

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Bonus: $" + emp.calculateBonus());

            if (emp instanceof Workable) {
                ((Workable) emp).work();
            }

            System.out.println("-------------------------");
        }
    }
}
