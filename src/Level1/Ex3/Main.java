package Level1.Ex3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countriesAndCapitals = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        try {
            readCountries(countriesAndCapitals, "countries.txt");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("The Capital's game begins");
        System.out.print("Insert player's name: ");
        String s = sc.nextLine();
        Player p = new Player(s, 0);
        System.out.println();

        List<String> countries = new ArrayList<>(countriesAndCapitals.keySet());
        Collections.shuffle(countries);

        for(int i = 0; i < 10; i++) {
            String countrie = countries.get(i);
            System.out.println("Guess the capital of " + countrie);
            String answer = sc.nextLine();

            if(answer.trim().equalsIgnoreCase(countriesAndCapitals.get(countrie))) {
                System.out.println("The answer is correct!");
                p.addOneToScore();
            } else {
                System.out.println("Wrong answer :( ");
            }
        }

        System.out.println("Game Over");
        System.out.println("Your score is: " + p.getScore() + "/10");

        try {
            writeResult(p);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    // Scrivere la merda di file scores -> una funzione
    static void writeResult(Player p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("classification.txt", true));
        bw.write("Player: " + p.getName() + " " + p.getScore() + "/10");
        bw.newLine();
        bw.close();
    }

    // Leggere sta merda di file txt -> una funzione
    static void readCountries(Map<String, String> m, String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;

        while((line = br.readLine()) != null) {
            String [] s = line.split(" ");
            if(s.length == 2) m.put(s[0].trim(),s[1].trim());
        }
        br.close();
    }
}

