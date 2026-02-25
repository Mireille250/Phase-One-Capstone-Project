import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static UniversityManager manager = new UniversityManager();
    public static void main(String[] args) {

        menu();
    }
        static void menu(){
            List<Student> students = new ArrayList<>();

            students.add(new Student("Patrick", 20, "S001",3.8,"ICT"));
            students.add(new Student("Khalid", 23, "S002",4.0,"civil engineering"));
            students.add(new Student("Marry", 25, "S003",3.4,"Computer science"));

            FileManager.saveStudents(students);

            Student boy= new Student("Eric", 20, "S101", 3.8,"ICT");
            System.out.println();




        while (true) {

            System.out.println("1.Register Student");
            System.out.println("2.Create Course");
            System.out.println("3.Exit");
            System.out.println("choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("ID: ");
                    int age = scanner.nextInt();


                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Department:");
                    String department = scanner.nextLine();
                    System.out.print("GPA");
                    double gpa = scanner.nextDouble();

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
                    System.out.println("invalid choice");
            }
        }
    }
}



