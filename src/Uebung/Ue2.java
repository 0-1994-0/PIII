package Uebung;

import java.io.File;
import java.util.Arrays;

public class Ue2 {
    public static void main(String[] args) {
        //String dir = "C:\\";

        String dir = "C:\\";

        File f = new File(dir);
        System.out.println("Gibt es diese File : " + f.exists());
        System.out.println("Ist diese File ein Directory: " + f.isDirectory());

       // int[] myIntArray = {4, 5, 6};
        File[] myFilesInThisSpecificDirectory = f.listFiles();
//        System.out.println("Eintrag 0: " + myFilesInThisSpecificDirectory[0].toString());
//        System.out.println("Eintrag 1: "+myFilesInThisSpecificDirectory[1]);

        for (int i = 0; i < myFilesInThisSpecificDirectory.length; i++) {
            if(myFilesInThisSpecificDirectory[i].isDirectory()) {
                System.out.println("Eintrag" + i + ": Dir " + myFilesInThisSpecificDirectory[i].getAbsolutePath());

            }else {
                System.out.println("Eintrag" + i + ": File " + myFilesInThisSpecificDirectory[i].getAbsolutePath());
        }
//        int i = 0;
//        for (File g : myFilesInThisSpecificDirectory) {
//            if (g.isDirectory()) {
//                System.out.println("Eintrag" + i + ": Dir " + g.getAbsolutePath());
//            } else {
//                System.out.println("Eintrag" + i + ": File " + g.getAbsolutePath());
//            }
//            i++;

//        try {
//            File file3 = new File("C:\\");
//            File[] result = file3.listFiles();
//            System.out.println("Files are: ");
//            for (int i = 0; i < file3.length(); i++) {
//                System.out.println(result[i].getName());
//            }
//        } catch (Exception e) {
//
//            System.out.println(e.getMessage());
        }

        printFilesOfSpecifDirection(myFilesInThisSpecificDirectory);
    }


    public static void printFilesOfSpecifDirection(File[] inputarray){

        for (int i = 0; i < inputarray.length; i++) {
            if(inputarray[i].isDirectory()){
                System.out.println("Eintrag " + i + "DIR" + inputarray[i].getAbsolutePath());
            } else {
                System.out.println("Eintrag " + i + "FILE" + inputarray[i].getAbsolutePath());
            }

        }
    }
}


