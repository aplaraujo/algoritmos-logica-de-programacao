package application;

import java.io.BufferedWriter;

public class FileWriter {
    public static void main(String[] args) {
        String lines[] = new String[] { "Good morning", "Good afternoon", "Good night" };

        String path = "out.txt";

        try (BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path, true))) {
            for(String line: lines) {
                bw.write(line);
                bw.newLine();
            }            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
