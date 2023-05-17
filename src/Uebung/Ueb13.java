package Uebung;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ueb13 {
    public static void main(String[] args) throws IOException {


        File file = new File("Bsp.bmp");
        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);
        // Für Optimierung der Performance -> BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int sum =0;
        int byteRead;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // char[] ch = Character.toChars(byteRead);
            // System.out.println(ch);
            // Byte wird in char umgewandelt und ausgegeben.
            System.out.print("Byte " + sum +": ");
            System.out.println((int)(char) byteRead);
           // System.out.println("\t" + (char)byteRead+ " ");
            sum =sum +1;
        }


        System.out.println("Anzahl Gesamt: "+sum);

        // close() gibt die Datei wieder frei.
        bufferedInputStream.close();

    }
}
