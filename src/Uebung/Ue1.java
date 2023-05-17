package Uebung;

import java.io.File;

public class Ue1 {
    public static void main(String[] args) {
        //relative Pfad
        File file = new File("firstuebung1.txt");
        //absoluter Pfad
        // File file = new File("C:\\Users\\s53038\\Documents\\Pruefung1 Startpaket\\PIII\\firstuebung1.txt");
        System.out.println("Does the file exist? " + file.exists());
        System.out.println("Name of the File : " + file.getName());
        System.out.println("Parent Directory of the File : " + file.getParent());
        System.out.println("Path to this File: " + file.getPath());
        System.out.println("Is this a directory: " + file.isDirectory());
        System.out.println("Is this a File: " + file.isFile());
        System.out.println("Full path to file: " + file.getAbsolutePath());
        System.out.println("Is this file readable : " + file.canRead());
        System.out.println("Is this File writeable : " + file.canWrite());
        System.out.println("The File size is : " + file.length() / 1024d);
        System.out.println("The File size is : " + file.length() / 1024.0);
        System.out.println("hidden? " + file.isHidden());

        //create new empty file "k.txt"

        File file2 = new File("k.txt");
        try {
            file2.createNewFile();
        } catch (Exception e) {
            System.out.println("Fehler: "+e.getMessage());


        }
    }
}
