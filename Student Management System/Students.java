import java.util.Scanner;

public class Students {
    private String name;
    private int id;
    private String birthDate;
    private final String schoolName = "AIMS Rwanda";
    static int totalStudents = 0;

    // Constructor
    public Students(String name, int id, String birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
        totalStudents++;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    // Main method (easy version)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Enter details for Student 1 ---");
        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("ID: ");
        int id1 = Integer.parseInt(sc.nextLine());

        System.out.print("Birth Date: ");
        String birthDate1 = sc.nextLine();

        Students s1 = new Students(name1, id1, birthDate1);

        System.out.println("\n--- Enter details for Student 2 ---");
        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("ID: ");
        int id2 = Integer.parseInt(sc.nextLine());

        System.out.print("Birth Date: ");
        String birthDate2 = sc.nextLine();

        Students s2 = new Students(name2, id2, birthDate2);

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + s1.getName());
        System.out.println("ID: " + s1.getId());
        System.out.println("Birth Date: " + s1.getBirthDate());
        System.out.println("School: " + s1.getSchoolName());
        System.out.println("-----------------------");

        System.out.println("Name: " + s2.getName());
        System.out.println("ID: " + s2.getId());
        System.out.println("Birth Date: " + s2.getBirthDate());
        System.out.println("School: " + s2.getSchoolName());
        System.out.println("-----------------------");

        System.out.println("Total Students Created: " + Students.totalStudents);
        sc.close();
    }
}
