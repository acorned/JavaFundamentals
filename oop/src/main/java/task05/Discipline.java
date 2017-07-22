package task05;
import java.util.ArrayList;
import java.util.HashMap;

public class Discipline {

    private static HashMap<Discipline, HashMap<Student, Number>> disciplinesMap = new HashMap<>();
    private String name;
    private Disciplines discipline;


    public Discipline(Disciplines discipline) {
        this.name = discipline.toString();
        this.discipline = discipline;
        disciplinesMap.put(this, new HashMap<>());
    }

    public static void addStudent(Discipline discipline, Student student, Number grade) {
        HashMap<Student, Number> tmp = disciplinesMap.get(discipline);
        tmp.put(student, grade);
        disciplinesMap.put(discipline, tmp);
    }


    public static void main(String... args) {
        Student student1 = new Student("Alex Zheludkov", 32);
        Student student2 = new Student("John Doe", 25);
        Discipline java = new Discipline(Disciplines.JAVA);
        Discipline theology = new Discipline(Disciplines.THEOLOGY);
        addStudent(java, student1, 5);
        addStudent(java, student2, 4.5);
        addStudent(theology, student1, 5);
        addStudent(theology, student2, 4.5);




        Discipline.disciplinesMap.forEach((key, value) -> System.out.println("Enum: " + key.getName() + " " + key.discipline.gradeType() + value));
    }

    public String getName() {
        return name;
    }
}