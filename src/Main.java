import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student boy= new Student("Eric", 20, "S101", 3.8,"ICT");
        Instructor trainer= new Instructor("Dr.SIBOMANA", 45, "Computer Science", "EMP22");
        TeachingAssistant ta = new TeachingAssistant("Brian", 24, "S202", 3.9, "OOP","ICT");

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
            System.out.println("choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    Student girl = new UndergraduateStudent("Mireille", 20, "S01", 3.6,"ICT");
                    manager.registerStudent(girl);
                    break;

                case 2:
                    Course c = new Course("CS101", "OOP", 3);
                    manager.createCourse(c);
                    break;

                case 3:
                    System.out.println("Saved and Exit");
                    return;
            }
    }
    }
}
