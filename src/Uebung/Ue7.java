package Uebung;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ue7 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\s53038\\Documents\\Pruefung1 Startpaket\\PIII\\test2.txt");
        System.out.println("Absoluter Pfad zur Datei " + f.getAbsolutePath());

        FileReader fr = new FileReader("test2.txt");

        BufferedReader br = new BufferedReader(fr);

        String zeile = br.readLine();

        while (zeile != null) {
            System.out.println(zeile);
            zeile = br.readLine();
        }

        //fr.close();
        br.close();
    }
}

