package Level3.Ex1;

import java.util.Comparator;

public class Person {
    private final String ID;
    private final String name;
    private final String surname;

    static public final Comparator<Person> BY_ID = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getID().compareTo(o2.getID());
        }
    };

    static public final Comparator<Person> BY_NAME = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    static public final Comparator<Person> BY_SURNAME = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };


    public Person(String ID, String name, String surname) {
        if(ID == null) throw new NullPointerException("Provide a value for ID");
        if(name == null) throw new NullPointerException("Provide a value for Name");
        if(surname == null) throw new NullPointerException("Provide a value for Surname");

        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
