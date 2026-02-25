import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static UniversityManager manager = new UniversityManager();

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Patrick", 20, "S001", 3.8, "ICT"));
        students.add(new Student("Khalid", 23, "S002", 4.0, "Civil Engineering"));
        students.add(new Student("Marry", 25, "S003", 3.4, "Computer Science"));
        FileManager.saveStudents(students);

        manager.registerStudent(new Student("Alice", 20, "S01", 3.7, "CS"));
        manager.registerStudent(new Student("Bob", 21, "S02", 3.9, "CS"));
        manager.registerStudent(new Student("Mike", 22, "S03", 3.2, "Engineering"));

        menu();
    }

    static void menu() {

        while (true) {

            System.out.println("1. Register Student");
            System.out.println("2. Show Top Students (GPA > 3.5)");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    System.out.print("GPA: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    Student student = new UndergraduateStudent(name, age, id, gpa, department);
                    manager.registerStudent(student);
                    break;

                case 2:
                    manager.getAllStudents().stream()
                            .filter(s -> s.getGPA() > 3.5)
                            .forEach(s -> System.out.println(s.getName()));
                    break;

                case 3:
                    FileManager.saveStudents(manager.getAllStudents());
                    System.out.println("Saved. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}