import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    public static void saveStudents(List<Student> students) {

        try (FileWriter writer = new FileWriter("students.txt")) {

            for (Student s : students) {
                writer.write(s.getName() + "," + s.getStudentID() + "," + s.getGPA() + "\n");

                writer.close();

                System.out.println("Successfully written to file.");


            }

        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }
}
