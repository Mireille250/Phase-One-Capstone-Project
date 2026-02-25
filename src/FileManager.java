import java.io.*;
import java.util.Collection;
import java.util.List;


public class FileManager {
    public static void saveStudents(Collection<Student> students) {

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("student.txt"));

            for (Student s : students) {
                String type = s.getClass().getSimpleName();

                writer.println(type + "|"
                        + s.getStudentID() + "|"
                        + s.getName() + "|"
                        + s.getGPA());
            }

            writer.close();
            System.out.println("Saved successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}





