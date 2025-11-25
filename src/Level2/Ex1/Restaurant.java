package Level2.Ex1;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private final String name;
    private int score;

    public Restaurant(String name, int score) {
        if(name == null) throw new NullPointerException();

        this.name = name;
        this.score = score;
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

    @Override
    public int compareTo(Restaurant o) {
        int result = name.compareTo(o.name);
        if(result == 0)
            result = Integer.compare(score, o.score);
        return result;
    }

    @Override
    public String toString() {
        return "{Name: " + name + " | Score: " + score + "}";
    }
}
