package greenfox;

public class Sponsor extends Person {

    private String company = "Google";
    private Integer hiredStudents = 0;

    public Sponsor() {
        super();
    }

    public Sponsor(String name, Integer age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    @Override
    public void introduce() {
        System.out.println(super.defaultIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");

    }

    public void hire() {
        ++this.hiredStudents;
    }

    @Override
    public String getGoal() {
        return "Hire brilliant junior software developers.";
    }

}
