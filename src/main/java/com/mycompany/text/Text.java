package com.mycompany.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text {

    public static void main(String[] args) {
        try {
            File file = new File("D:\\text.txt");
            String reversStr = "";

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {

                int n = line.length();
                String reversedString = "";

                char ch;
                for (int i = n - 1; i >= 0; i--) {
                    ch = line.charAt(i);
                    reversedString = reversedString + ch;
                }
                reversStr += reversedString + "\n";

                line = reader.readLine();
            }
            FileUtils.checkFile("D:\\Practica_10.txt");

            FileUtils.writeStringToFile("D:\\Practica_10.txt", reversStr);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
