
import java.util.*;

public class UniversityManager {

    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void registerStudent(Student student) {
        students.add(student);
    }
    public double getAverageGPA(String department) {

        return students.stream()
                .filter(s -> s.getDepartment().equals(department))
                .mapToDouble(Student::getGPA)
                .average()
                .orElse(0);
    }
    public Student getTopStudent() {

        return students.stream()
                .max(Comparator.comparingDouble(Student::getGPA))
                .orElse(null);
    }

    public void createCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(Student student, Course course)
            throws StudentAlreadyEnrolledException {

        if (course.getStudents().contains(student)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled");
        }

        course.addStudent(student);
        student.addCourse(course);
    }

    public Optional<Student> topStudent() {
        return students.stream()
                .max(Comparator.comparingDouble(Student::getGPA));
    }
}