package greenfox;

public class Student extends Person {

    private String previousOrganization = "The School of Life";
    private int skipDays = 0;

    public Student(){
        super();
    }

    public Student(String name, Integer age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skipDays = 0;
    }

    @Override
    public String getGoal() {
        return "Be a junior software developer.";
    }

    public void skipDays(int skipDays) {
        this.skipDays = this.skipDays + skipDays;
    }

    @Override
    public void introduce() {
        System.out.println(super.defaultIntroduce() + " from " + previousOrganization + " who skipped " + skipDays + " days from the course already.");

    }



}
