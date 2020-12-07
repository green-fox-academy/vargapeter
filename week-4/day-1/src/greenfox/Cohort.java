package greenfox;

import java.util.ArrayList;
import java.util.List;


public class Cohort extends Person {

    String cohortName;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public Cohort(String cohortName) {
        this.cohortName = cohortName;

    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + cohortName + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");

    }


}
