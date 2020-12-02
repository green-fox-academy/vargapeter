public class postIt {
    String color;
    String text;
    String textColor;

    public postIt() {
        this(null, null, null);
    }

    public postIt(String color, String text, String textColor) {
        this.color = color;
        this.text = text;
        this.textColor = textColor;

    }

    public static void main(String[] args) {
        postIt firstpostIt = new postIt("orange", "Idea1", "blue");
        postIt secondtpostIt = new postIt("pink", "Awesome", "black");
        postIt thirdtpostIt = new postIt("yellow", "Superb", "green");

    }

}
