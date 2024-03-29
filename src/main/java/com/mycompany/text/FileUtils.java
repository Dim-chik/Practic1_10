package com.mycompany.text;

/**
 *
 * @author ПК
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static boolean checkFile(String path) throws IOException {
        File f = new File(path);
        if (f.createNewFile()) {

        }
        return false;
    }

    public static void writeStringToFile(String path, String str) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(str);
        fw.close();
    }

}
