package Level2.Ex1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Lasarte", 100);
        Restaurant r2 = new Restaurant("La cova fumada", 50);
        Restaurant r3 = new Restaurant("La Balmesina", 54);

        Set<Restaurant> restaurantGuide = new HashSet<>(List.of(r1,r2,r3));

        System.out.println("Restaurant's guide: " + restaurantGuide);

        System.out.println(restaurantGuide.add(new Restaurant("Lasarte", 100)) ? "Operation succeed" : "Operation failed");
    }
}
