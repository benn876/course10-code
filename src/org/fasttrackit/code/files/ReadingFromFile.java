package org.fasttrackit.code.files;

import java.io.*;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        //readingWithScanner();
        readingWithBufferedReader();
    }

    private static void readingWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("files/content.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    private static void readingWithScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("files", "content.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
