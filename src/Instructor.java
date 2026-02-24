public class Instructor extends Person{
    private String department;
    private String employeeId;

    public Instructor(String name, int age, String department, String employeeId) {
        super(name, age);
        this.department = department;
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void displayRole() {
        System.out.println("Instructor: "+getName());
        System.out.println("department: "+getDepartment());
        System.out.println("employee ID: "+getEmployeeId());

    }
}

