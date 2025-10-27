public class Developer extends Employee implements Workable {
    private int completedProjects;

    public Developer(String name, double salary, int completedProjects) {
        super(name, salary);
        this.completedProjects = completedProjects;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.1 + (completedProjects * 50);
    }

    @Override
    public void work() {
        System.out.println(name + " is developing new features.");
    }
}
