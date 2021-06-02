package test.java.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public enum Reader {

    INSTANCE;

    public List<String> loadStringData(String filename) {
        List<String> output = new ArrayList<>();
        Path path = Paths.get("./data/" + filename);
        try (InputStream in = Files.newInputStream(path);
             BufferedReader reader = new BufferedReader(new InputStreamReader(in))
        ) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                output.add(line.trim());
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + filename);
        }

        return output;
    }

}
