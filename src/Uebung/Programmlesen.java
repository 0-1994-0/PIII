package Uebung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Programmlesen {
    public static void main(String[] args) throws IOException {
        //Google: JAVA text aus datei lesen
        //Pfad ausgeben von Datei

        File f = new File("C:\\Users\\s53038\\Documents\\Pruefung1 Startpaket\\PIII\\test.txt");
        System.out.println("Absoluter Pfad zur Datei " + f.getAbsolutePath());

        FileReader fr = new FileReader("test.txt");

        BufferedReader br = new BufferedReader(fr);

        String zeile = br.readLine();

        while (zeile != null) {
            System.out.println(zeile);
            zeile = br.readLine();
        }

        fr.close();

        br.close();

//
//        String zeile1 = br.readLine();
//        System.out.println(zeile1);
//        String zeile2 = br.readLine();
//        System.out.println(zeile2);
//        String zeile3 = br.readLine();
//        System.out.println(zeile3);

        br.close();
    }
}
