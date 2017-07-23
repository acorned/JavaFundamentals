package task05;

import lombok.val;
import java.util.HashMap;
import java.util.Map;

public class Discipline {

    private static HashMap<Discipline, HashMap<Student, Number>> disciplinesMap = new HashMap<>();


    private Disciplines name;

    public Discipline(Disciplines discipline) {
        this.name = discipline;
        disciplinesMap.put(this, new HashMap<>());
    }

    public static void addStudent(Discipline discipline, Student student, Number grade) {
        HashMap<Student, Number> tmp = disciplinesMap.get(discipline);
        tmp.put(student, discipline.name.gradeType().equals("Integer") ? grade.intValue() : grade.doubleValue());
        disciplinesMap.put(discipline, tmp);
    }
    public static void printAllGrades(){
        Discipline.disciplinesMap.forEach((key, value) -> printAllGrades(key));
    }

    public static void printAllGrades(Discipline discipline){
        System.out.println(discipline.name);
        Discipline.disciplinesMap.get(discipline).forEach(
                (key, value) -> {
                    System.out.println(discipline.name.gradeType().equals("Integer") ?
                            key.getName() + ": " + value.intValue() :
                            key.getName() + ": " + value.doubleValue());
                });
    }

    public static HashMap<Discipline, Number> getGrade(Student student){
        val result = new HashMap<Discipline, Number>();
        Discipline.disciplinesMap.forEach(
                (discipline, value) -> {
                    value.forEach( (tmpstudent, grade) -> {
                        if (tmpstudent.equals(student))
                                result.put(discipline, grade);
                        });
                });
        return result;
    }

    public static Discipline bestGrade(Student student){
        Number maxGrade = 0;
        Discipline result = new Discipline(Disciplines.GEOGRAPHY);
        for (Map.Entry<Discipline, Number> pair : getGrade(student).entrySet()) {
            if (pair.getValue().doubleValue() > maxGrade.doubleValue())
                result = pair.getKey();
        }
        return result;
    }

    public Disciplines getName() {
        return name;
    }
}