import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private String studentID;
    private double GPA;
    private String department;

    private Map<Course, Double> courses = new HashMap<>();

    public Student(String name, int age, String studentID, double GPA,String department) {
        super(name, age);
        this.studentID = studentID;
        this.GPA = GPA;
        this.department =department;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGPA() {

        return GPA;
    }

    public String getDepartment() {
        return studentID;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Map<Course, Double> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.put(course, 0.0);
    }

    @Override
    public void displayRole() {
        System.out.println("Name: " + getName());
        System.out.println("age: "+getAge());
        System.out.println("ID:"+getStudentID());
        System.out.println("GPA: "+getGPA());
        System.out.println("department: "+getDepartment());

    }

    public double calculateTuition() {
        return 0;
    }
}
