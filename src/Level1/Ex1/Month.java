package Level1.Ex1;

import java.util.Objects;

public class Month {
    private final String name;

    Month(String name) {
        if(name == null) throw new NullPointerException();

        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Month o = (Month) obj;
        return name.equals(o.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Month: " + getName();
    }
}
