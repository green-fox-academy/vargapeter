package pirates;

import java.util.concurrent.ThreadLocalRandom;

public class Pirate {
    int intoxicationLevel;
    boolean alive;

    public Pirate() {
        this.alive = true;
    }

    public void drinkSomeRum() {
        this.intoxicationLevel = this.intoxicationLevel + 1;
    }

    public String howsItGoingMate() {
        if (alive == true) {
            if (intoxicationLevel >= 0 && intoxicationLevel <= 4) {
                return "Pour me anudder!";
            } else {
                return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            }
        } else {
            return "he's dead";
        }
    }

    public void die() {
        alive = false;
    }

    public void ressurrect() {
        alive = true;
    }

    public void brawl(Pirate otherPirate) {
        int rand = ThreadLocalRandom.current().nextInt(1, 4);
        if (rand == 1) {
            this.alive = false;
        } else if (rand == 2) {
            otherPirate.alive = false;
        }

    }


}

