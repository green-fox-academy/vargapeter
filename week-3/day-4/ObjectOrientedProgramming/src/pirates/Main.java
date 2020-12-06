package pirates;

public class Main {
    public static void main(String[] args) {
        Pirate pirateCaptain = new Pirate();

        for (int i = 1; i <= 5; i++) {
            pirateCaptain.drinkSomeRum();
            System.out.println(pirateCaptain.howsItGoingMate());
        }

        pirateCaptain.die();
        System.out.println(pirateCaptain.howsItGoingMate());
        pirateCaptain.ressurrect();
        System.out.println(pirateCaptain.howsItGoingMate());

        Pirate plainPirate = new Pirate();

        pirateCaptain.brawl(plainPirate);
        System.out.println("cap: " + aliveText(pirateCaptain) + " plain: " + aliveText(plainPirate));

    }

    private static String aliveText(Pirate pirate) {
        String message;
        if (pirate.alive == true) {
            message = "he is alive";
        } else {
            message = "he dead";
        }
        return message;
    }

}
