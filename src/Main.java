//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student boy= new Student("Eric", 20, "S101", 3.8,"ICT");
        Instructor trainer= new Instructor("Dr.SIBOMANA", 45, "Computer Science", "EMP22");
        TeachingAssistant ta = new TeachingAssistant("Brian", 24, "S202", 3.9, "OOP","ICT");

        boy.displayRole();
        System.out.println();

        trainer.displayRole();
        System.out.println();

        ta.displayRole();
    }
}