package sharpies;

public class Main {
    public static void main(String[] args) {
        Sharpie thisSharpie = new Sharpie("green", 0.5f);

        thisSharpie.use(thisSharpie.inkAmount);

        System.out.println(thisSharpie.inkAmount);

    }
}
