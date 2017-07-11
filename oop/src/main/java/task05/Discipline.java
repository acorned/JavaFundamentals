package task05;
import java.util.HashMap;

public class Discipline {

    public static HashMap<Enum, Discipline> disciplinesMap = new HashMap<>();
    private String name;

    public Discipline(Enum name) {
        this.name = name.toString();
        disciplinesMap.put(name, this);
    }

    public static void main(String[] args) {
        Discipline java = new Discipline(Disciplines.JAVA);
        Discipline teo = new Discipline(Disciplines.THEOLOGY);

        Discipline.disciplinesMap.forEach((key, value) -> System.out.println("Enum:" + key.toString() + " Имя инстанса " + value.getName()));
    }

    public String getName() {
        return name;
    }
}