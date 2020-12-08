package garden;

public class Tree extends Plant {
    public Tree(String color) {
        super(color);
    }

    @Override
    public void water(int amount) {
        this.waterAmount = waterAmount + amount * 0.40;
    }

}