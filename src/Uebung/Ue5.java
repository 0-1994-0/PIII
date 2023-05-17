package Uebung;

import java.io.File;

public class Ue5 {
    public static void main(String[] args) {

        File newDirectory = new File("C:\\Users\\s53038\\IdeaProjects\\PIII\\.idea\\a\\b\\c");

        if(newDirectory.mkdirs()){
            System.out.println("Directory created "+ newDirectory.getAbsolutePath()+ " created "+ newDirectory.exists());
        } else {
            System.out.println("Directory "+newDirectory.getAbsolutePath()+ " can´t be created " + newDirectory.exists());

        }
    }
}
