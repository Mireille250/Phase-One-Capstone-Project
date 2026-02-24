public class TeachingAssistant extends Student{
    private String assignedCourse;

    public TeachingAssistant(String name, int age, String studentID, double GPA, String assignedCourse,String department) {
        super(name, age, studentID, GPA,department);
        this.assignedCourse = assignedCourse;
    }
    public String getAssignedCourse() {
        return assignedCourse;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("teaching assistant for: "+assignedCourse);
    }
}

