package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    public void water(int amount) {
        System.out.println("Watering with " + amount);
        int singleAmount = amount / plants.size();

        for (Plant p : plants) {
            p.water(singleAmount);
        }
    }

    public void report() {
        for (Plant p : plants) {
            p.report();
        }
        System.out.println();
    }

}