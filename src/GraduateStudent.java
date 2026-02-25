
public class GraduateStudent extends Student{
    private int credits;
    private static final double CREDIT_RATE = 300;
    private static final double RESEARCH_FEE = 500;

    public GraduateStudent(String name, int age, String id, double gpa, int credits,String department) {
        super(name, age, id, gpa,department);
        this.credits = credits;
    }

    @Override
    public double calculateTuition() {
        return (credits * CREDIT_RATE) + RESEARCH_FEE;
    }
}
