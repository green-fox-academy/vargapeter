package sharpies;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    public void use(float inkAmount) {
        this.inkAmount = this.inkAmount - 0.1f;
        System.out.println();

    }


}
