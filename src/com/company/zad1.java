package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class zad1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("src/com/company/plik");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
