package Uebung;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ue15 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        char c = (char) System.in.read();

        while ( c != 'x'){
            fileOutputStream.write(c);
            System.out.println("Zeichen geschrieben: "+(int)c);
            c= (char)System.in.read();
        }
            System.out.println("Schreibe char "+(int) c + " in die Datei.....");
            fileOutputStream.write(c);

        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("fertig.");
    }
    }

