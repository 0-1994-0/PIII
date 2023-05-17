package Uebung;

import java.io.File;

public class Ue4 {
    public static void main(String[] args) {
        String dir = "C:\\Users\\s53038\\";

        File f = new File(dir);
        System.out.println("Gibt es diese File : " + f.exists());
        System.out.println("Ist diese File ein Directory: " + f.isDirectory());

        if(f.isDirectory()== false){
            System.out.println("FEHLER: Angegebenes Verzeichnis("+dir+") gibt es nicht.");
        }

        // int[] myIntArray = {4, 5, 6};
        File[] myFilesInThisSpecificDirectory = f.listFiles();
//        System.out.println("Eintrag 0: " + myFilesInThisSpecificDirectory[0].toString());
//        System.out.println("Eintrag 1: "+myFilesInThisSpecificDirectory[1]);
//
//        for (int i = 0; i < myFilesInThisSpecificDirectory.length; i++) {
//            if(myFilesInThisSpecificDirectory[i].isDirectory()) {
//                System.out.println("Eintrag" + i + ": Dir " + myFilesInThisSpecificDirectory[i].getAbsolutePath());
//
//            }else {
//                System.out.println("Eintrag" + i + ": File " + myFilesInThisSpecificDirectory[i].getAbsolutePath());
//            }
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
        //      }

        printFilesOfSpecifDirection(myFilesInThisSpecificDirectory);
    }

    //    public static void printFilesOfSpecifDirection(File[] inputarray){
//
//        for (int i = 0; i < inputarray.length; i++) {
//            if(inputarray[i].isDirectory()){
//                System.out.println("Eintrag " + i + "DIR" + inputarray[i].getAbsolutePath()+" size: "+inputarray[i].length());
//            } else {
//                System.out.println("Eintrag " + i + "FILE" + inputarray[i].getAbsolutePath());
//            }
//
//        }
//    }
    public static void printFilesOfSpecifDirection(File[] inputarray) {
        int counter = 0;
        long sum = 0;

        for (int i = 0; i < inputarray.length; i++) {
            if (inputarray[i].isFile()) {
                System.out.print("Eintrag " + counter + "FILE" + inputarray[i].getName()+ " "+ inputarray[i].getAbsolutePath() + " ");
                System.out.println(inputarray[i].length());
                sum = sum + inputarray[i].length();
            }
            counter++;

        }
        System.out.println(sum);
    }
}

