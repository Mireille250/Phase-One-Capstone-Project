
import java.util.*;

public class UniversityManager {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();


    public void registerStudent(Student student) {
        students.put(student.getStudentID(),student);
    }
    public double getAverageGPA(String department) {

        return students.values().stream()
                .filter(s -> s.getDepartment().equals(department))
                .mapToDouble(Student::getGPA)
                .average()
                .orElse(0.0);
    }

    public void createCourse(Course course) {
        courses.put(course.getCourseCode(),course);
    }

    public void enrollStudent(Student studentId, String courseCode)
            throws CourseFullException,StudentAlreadyEnrolledException {
        Student student = students.get(studentId);
        Course course = courses.get(courseCode);

        if (course.getStudents().contains(studentId)) {
            throw new StudentAlreadyEnrolledException("Student already enrolled");
        }

        course.getStudents().add(student);
        student.addCourse(course);
    }

    public Optional<Student> topStudent() {
        return students.values().stream()
                .max(Comparator.comparing(Student::getGPA));
    }
    public Collection<Student> getAllStudents() {
        return students.values();
    }
}
