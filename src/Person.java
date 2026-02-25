public abstract class Person {
    private String name;
    private int age;
    private String department;


    public Person(String name,int age,String department){
        this.name = name;
        this.age = age;
        this.department =department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public abstract double calculateTuition();
}


