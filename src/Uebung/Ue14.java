package Uebung;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;

public class Ue14 {
    public static void main(String[] args) throws IOException {
        File file = new File("test-output.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String outputText = "hello File - first Output";

        for (char c : outputText.toCharArray()){
            c=10;
            System.out.println("Schreibe char "+(int) c + " in die Datei.....");
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("fertig.");
    }
}
