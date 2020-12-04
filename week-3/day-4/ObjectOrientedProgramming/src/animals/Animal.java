package animals;

public class Animal {
    String name;
    int hunger;
    int thirst;

    public Animal(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;

    }

    public void eat(){
        this.hunger = this.hunger-1;
    }

    public void dring(){
        this.thirst = this.thirst-1;
    }

    public void play(){
        this.thirst = this.thirst+1;
        this.hunger = this.hunger+1;
    }

}
