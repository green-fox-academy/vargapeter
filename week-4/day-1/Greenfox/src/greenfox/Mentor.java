package greenfox;

public class Mentor extends Person {

    private String level = "intermediate";

    public Mentor() {
        super();
    }

    public Mentor(String name, Integer age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public String getGoal() {
        return "Educate brilliant junior software developers.";
    }

    @Override
    public void introduce() {
        System.out.println(super.defaultIntroduce() + " " +level + " level mentor.");

    }

}
