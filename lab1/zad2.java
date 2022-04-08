package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class zad2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String fileName = "src/com/company/plik2";

        try (FileOutputStream fos = new FileOutputStream(fileName, true)) {

            String text = "Ten tekst zapisuje";
            byte[] mybytes = text.getBytes();

            fos.write(mybytes);
        }
    }
}
