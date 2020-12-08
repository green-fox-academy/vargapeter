package garden;

public class Flower extends Plant {
    public Flower(String color) {
        super(color);
    }

    @Override
    public void water(int amount) {
        this.waterAmount = waterAmount + amount * 0.75;
    }

}