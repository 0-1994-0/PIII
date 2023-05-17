package Uebung;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Ue6 {
    public static void main(String[] args) {

        File newDirectory = new File("C:\\Users\\s53038\\IdeaProjects\\PIII\\.idea");
        createFiles(newDirectory);
        renameFiles(newDirectory);
    }



    private static void createFiles(File newDirectory) {
        for (int i = 0; i < 10; i++) {
            String filename = ThreadLocalRandom.current().nextInt()+ " .mp3";
            File fileToCreate = new File(newDirectory.getAbsolutePath()+ File.separator +  filename);
           // System.out.println("File "+ i+ " : "+ fileToCreate.getAbsolutePath());

            try {
                fileToCreate.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if(fileToCreate.exists()){
                System.out.println("File "+ fileToCreate.getAbsolutePath()+ " CREATED");
            } else {
                System.out.println("ERROR : file "+fileToCreate.getAbsolutePath()+ " could NOT be created");
            }
        }
    }

    private static void renameFiles(File newDirectory) {
        for (File currentFile: newDirectory.listFiles()) {
            if(currentFile.isFile()){
                File destFile = new File(newDirectory.getAbsolutePath() + File.separator + "1_"+ currentFile.getName());

            }
        }



    }


}
