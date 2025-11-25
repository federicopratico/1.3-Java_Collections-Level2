package Level2.Ex1;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private final String name;
    private final int score;

    public static final Comparator<Restaurant> BY_SCORE = new Comparator<Restaurant>() {
        @Override
        public int compare(Restaurant o1, Restaurant o2) {
            return Integer.compare(o2.getScore(), o1.getScore());
        }
    };

    public Restaurant(String name, int score) {
        if(name == null) throw new NullPointerException();

        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;

        Restaurant o = (Restaurant) obj;
        return name.equals(o.name) && score == o.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    /**
     * Overriding CompareTo method which implements natural ordering for Restaurant's Object.
     * Natural ordering is as follows:
     *  1. Descending lexicographically name's ordering;
     *  2. Descending score's ordering.
     * @param o Restaurant'Objects
     * @return -1 if o < this
     *          0 if o == this
     *          1 if 0 > this
     */
    @Override
    public int compareTo(Restaurant o) {
        int result = o.name.compareTo(name);
        if(result == 0)
            result = Integer.compare(o.score, score);
        return result;
    }

    @Override
    public String toString() {
        return "{Name: " + name + " | Score: " + score + "}";
    }
}
