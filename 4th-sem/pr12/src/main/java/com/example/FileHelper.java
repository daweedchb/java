package com.example;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

@Service
public class FileHelper {
    public String readFile(String fileName) {
        StringBuilder data = new StringBuilder();

        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.append(myReader.nextLine()).append("\n");
            }
            data.delete(data.length() - 1, data.length());
            myReader.close();
        } catch (FileNotFoundException e) {
        }

        return String.valueOf(data);
    }

    public void writeToFile(String fileName, String data) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.print(data);
        writer.close();
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }

    public boolean isExistFile(String fileName) {
        File file = new File(fileName);
        return file.exists() && file.isFile();
    }
}
