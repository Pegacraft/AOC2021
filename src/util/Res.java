package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Res {

    public static String getFileContent(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
