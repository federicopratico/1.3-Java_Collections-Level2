package Level2.Ex2;

import Level2.Ex1.Restaurant;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("Lasarte", 100);
        Restaurant r2 = new Restaurant("La cova fumada", 50);
        Restaurant r3 = new Restaurant("La Balmesina", 54);

        Set<Restaurant> NameDescendingOrderedRestaurantGuide = new TreeSet<>(List.of(r1, r2, r3));

        System.out.println("DESCENDING LEXICOGRAPHICALLY NAME'S ORDERING:");
        System.out.println(NameDescendingOrderedRestaurantGuide + "\n");

        Set<Restaurant> ScoreOrderedRestaurantGuide =  new TreeSet<>(Restaurant.BY_SCORE);
        ScoreOrderedRestaurantGuide.addAll(NameDescendingOrderedRestaurantGuide);

        System.out.println("DESCENDING SCORE'S ORDERING:");
        System.out.println(ScoreOrderedRestaurantGuide);

    }
}
