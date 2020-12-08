package garden;

public abstract class Plant {
    String color;
    double waterAmount;

    public Plant(String color) {
        this.color = color;
    }

    public abstract void water(int amount);

    public void report() {
        System.out.print("The " + color + " " + this.getClass().getSimpleName() + " ");
        if (waterAmount < 5) {
            System.out.println("needs water");
        } else {
            System.out.println("doesnt need water");
        }
    }
}