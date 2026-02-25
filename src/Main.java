import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student boy= new Student("Eric", 20, "S101", 3.8,"ICT");
        Instructor trainer= new Instructor("Dr.SIBOMANA", 45, "Computer Science", "EMP22");
        boy.displayRole();
        System.out.println();

        trainer.displayRole();
        System.out.println();


        UniversityManager manager = new UniversityManager();
        Scanner sc = new Scanner(System.in);
        manager.registerStudent(new Student("Alice",20,"S01",3.7,"CS"));
        manager.registerStudent(new Student("Bob",21,"S02",3.9,"CS"));
        manager.registerStudent(new Student("Mike",22,"S03",3.2,"Engineering"));

        double avg = manager.getAverageGPA("CS");
        System.out.println("Average GPA: " + avg);

        Student top = manager.getTopStudent();
        System.out.println("Top Student: " + top.getName());

        while (true) {

            System.out.println("1.Register Student");
            System.out.println("2.Create Course");
            System.out.println("3.Exit");

            int choice = sc.nextInt();

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
                    System.out.println("Saved and Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}