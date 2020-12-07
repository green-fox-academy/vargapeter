package greenfox;

public class Person {
    public String name = "Jane Doe";
    public Integer age = 30;
    public String gender = "female";

    public Person() {
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void introduce() {
        System.out.println(defaultIntroduce());
    }

    public String defaultIntroduce() {
        return "Hi, I am " + name + " and " + age + " years old, and my gender is " + gender ;
    }


    public String getGoal() {
        return (" ");
    }


}
