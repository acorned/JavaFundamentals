package task05;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

class DisciplineTest {

    @Test
    void gradesTest() {
        Student student1 = new Student("Alex Zheludkov", 32);
        Student student2 = new Student("John Doe", 25);
        Discipline java = new Discipline(Disciplines.JAVA);
        Discipline theology = new Discipline(Disciplines.THEOLOGY);

        Discipline.addStudent(java, student1, 5);
        Discipline.addStudent(java, student2, 4.5);
        Discipline.addStudent(theology, student1, 3);
        Discipline.addStudent(theology, student2, 4.5);

        Discipline.printAllGrades();
        assertThat(Discipline.bestGrade(student1).getName(), Is.is(Disciplines.JAVA));
    }
}