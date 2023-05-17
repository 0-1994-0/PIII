package Uebung;

import java.io.File;

public class Ue3 {
    public static void main(String[] args) {

        String dir = "C:\\Users\\s53038\\";
        File f = new File(dir);

        System.out.println("Dieser File existiert :" + f.exists());
        System.out.println("Dieser File existiert :" + f.getAbsolutePath());

        File[] myFilesInThisSpecificDirectory = f.listFiles();
//
//        for (int i = 0; i < myFilesInThisSpecificDirectory.length; i++) {
//            if (myFilesInThisSpecificDirectory[i].isDirectory()) {
//                System.out.println("Eintrag" + i + ": Dir " + myFilesInThisSpecificDirectory[i].getAbsolutePath());
//
//            } else {
//                System.out.println("Eintrag" + i + ": File " + myFilesInThisSpecificDirectory[i].getAbsolutePath());
//            }
//        }
        printFilesOfSpecifDirection(myFilesInThisSpecificDirectory);
    }


    public static void printFilesOfSpecifDirection(File[] inputarray) {

        for (int i = 0; i < inputarray.length; i++) {
            if (inputarray[i].isDirectory()) {
                System.out.println("Eintrag " + i + "DIR" + inputarray[i].getAbsolutePath());
                System.out.println("Weil das ein Dir ist, hier der Inhalt : ");
                File[] subdirectory = inputarray[i].listFiles();
                //printFilesOfSpecifDirection(inputarray[i].listFiles());
                printFilesOfSpecifDirection(subdirectory);
            } else {
                System.out.println("Eintrag " + i + "FILE" + inputarray[i].getAbsolutePath());
            }
        }
    }
}
