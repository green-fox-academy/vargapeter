package animals;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");
        Animal chicken = new Animal("Chicken");

        System.out.println("Name:" + dog.name + " " + "Hunger:" + dog.hunger + " " + "Thirst:" + dog.thirst);

        dog.eat();

        System.out.println("Name:" + dog.name + " " + "Hunger:" + dog.hunger + " " + "Thirst:" + dog.thirst);

        dog.play();
        cat.play();
        chicken.play();

        System.out.println("Name:" + dog.name + " " + "Hunger:" + dog.hunger + " " + "Thirst:" + dog.thirst);
        System.out.println("Name:" + cat.name + " " + "Hunger:" + cat.hunger + " " + "Thirst:" + cat.thirst);
        System.out.println("Name:" + chicken.name + " " + "Hunger:" + chicken.hunger + " " + "Thirst:" + chicken.thirst);


    }

}
