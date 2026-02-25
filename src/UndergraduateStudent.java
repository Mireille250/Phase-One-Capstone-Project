public class UndergraduateStudent extends Student{
    private static final double FLAT_RATE = 1500;

    public UndergraduateStudent(String name, int age, String id, double GPA,String department) {
        super(name, age, id,GPA,department);
    }

    @Override
    public double calculateTuition() {
        return FLAT_RATE;
    }

}
