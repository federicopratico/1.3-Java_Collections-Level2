package Level3.Ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> table = null;

        try (CSVReader reader = new CSVReader("contacts.csv")) {
            reader.parseTable();
            table = reader.getTable();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if(table == null) throw new NullPointerException("The table haven't been initialized");


        List<Person> personsList = new ArrayList<>();

        for(int i = 1; i < table.size(); i++) {
            if(table.get(i).size() >= 3) {
                String ID
                personsList.add(new Person(table.get(i).get(0), table.get(i).get(1), table.get(i).get(2)));
            }
        }

        for(Person p : personsList) {
            System.out.println("__");
        }
    }
}
