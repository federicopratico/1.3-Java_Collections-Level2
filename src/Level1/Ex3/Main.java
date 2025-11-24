package Level1.Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        Map<String, String> countrieCapitals = new HashMap<>();

        try {
            sc = new Scanner(new File("countries.txt"));
            while(sc.hasNext()){
                String countrie = sc.next();
                String capital = sc.next();
                countrieCapitals.put(countrie, capital);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        sc = new Scanner(System.in);
        System.out.print("Insert username: ");
        String username = sc.nextLine();

        List<String> countries = new ArrayList<>(countrieCapitals.keySet());
        Random r = new Random();
        int index = 0;
        int score = 0;
        String answer = "";
        int attempts = 10;
        while(attempts-- > 0){
            index = r.nextInt(countries.size());
            String countrie = countries.get(index);
            System.out.println(countrie);
            System.out.println("Guess the capital: ");
            answer = sc.nextLine();
            if(answer.equalsIgnoreCase(countrieCapitals.get(countrie))) score += 1;
        }

        System.out.println("Username: " + username);
        System.out.println("Score: " + score);






        System.out.println(countrieCapitals);
    }
}
