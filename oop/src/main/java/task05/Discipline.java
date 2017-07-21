package task05;
import java.util.ArrayList;
import java.util.HashMap;

public class Discipline {

    private static HashMap<Discipline, ArrayList<Student>> disciplinesMap = new HashMap<>();
    private String name;
    private Disciplines discipline;


    public Discipline(Disciplines discipline) {
        this.name = discipline.toString();
        this.discipline = discipline;
        disciplinesMap.put(this, new ArrayList<>());
    }

    public static void addStudent(Discipline discipline, Student student) {
        ArrayList<Student> tmp = disciplinesMap.get(discipline);
        tmp.add(student);
        disciplinesMap.put(discipline, tmp);
    }


    public static void main(String... args) {
        Discipline java = new Discipline(Disciplines.JAVA);
        Discipline teo = new Discipline(Disciplines.THEOLOGY);
        Student student = new Student("Alex Zheludkov", 5);
        addStudent(java, student);


        Discipline.disciplinesMap.forEach((key, value) -> System.out.println("Enum: " + key.getName() + " " + key.discipline.gradeType() + value));
    }

    public String getName() {
        return name;
    }
}