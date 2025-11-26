package Level3.Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader implements AutoCloseable {
    private final BufferedReader br;
    private final List<List<String>> table;

    public CSVReader(String fileName) throws FileNotFoundException, IOException {
        br = new BufferedReader(new FileReader(fileName));
        table = new ArrayList<>(10);
    }

    public List<List<String>> getTable() {
        return List.copyOf(table);
    }

    public void parseTable() throws IOException {
        String line;
        while((line = br.readLine()) != null) {
            String[] tmp = line.split(",");

            while(table.size() < tmp.length)
                table.add(new ArrayList<>());

            for (int i = 0; i < tmp.length; i++) {
                table.get(i).add(tmp[i].trim());
            }
        }
    }

    @Override
    public void close() throws IOException {
        br.close();
    }
}
