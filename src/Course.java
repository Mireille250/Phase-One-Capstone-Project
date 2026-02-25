import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseCode;
    private String title;
    private int credits;
    private int capacity;

    private List<Student> students = new ArrayList<>();

    public Course(String code, String title, int credits, int capacity) {
        this.courseCode = code;
        this.title = title;
        this.credits = credits;
        this.capacity =capacity;
    }

    public void addStudent(Student s)throws Exception {
        if (students.size() >= capacity )
            throw new Exception("course is full");
        if (students.contains(s))
            throw new Exception("student already added");
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getCourseCode() {
        return courseCode;
    }
}
