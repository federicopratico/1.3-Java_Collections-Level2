package Level3.Ex1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    private final BufferedReader bf;

    public CSVReader(String fileName) throws FileNotFoundException, IOException {
        bf = new BufferedReader(new FileReader(fileName));
    }

    // to complete
    public List<String> getColumnsTitles() throws IOException {
        List<String> titles = new ArrayList<>();
        String t = bf.readLine();
        return titles;
    }

    public void close() throws IOException {
        bf.close();
    }
}
