import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String title;
    private int credits;

    private List<Student> students = new ArrayList<>();

    public Course(String code, String title, int credits) {
        this.courseCode = code;
        this.title = title;
        this.credits = credits;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
