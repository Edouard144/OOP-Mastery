public class Manager extends Employee implements Workable {
    private double teamPerformance;

    public Manager(String name, double salary, double teamPerformance) {
        super(name, salary);
        this.teamPerformance = teamPerformance;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2 + (teamPerformance * 100);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team effectively.");
    }
}
