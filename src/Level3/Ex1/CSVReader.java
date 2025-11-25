package Level3.Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    private final Scanner sc;

    public CSVReader(File fileName) throws FileNotFoundException {
        sc = new Scanner("fileName");
    }


    public void close() {
        sc.close();
    }
}
