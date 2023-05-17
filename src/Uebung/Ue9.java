package Uebung;

import java.io.*;

public class Ue9 {
    public static void main(String[] args) throws IOException {

        File f = new File("printwriter.txt");


        FileWriter pw = new FileWriter(f,true);
        PrintWriter fpw = new PrintWriter(pw);

        fpw.println("Hello");
        fpw.println("Try again");
        fpw.println("Try again");
        fpw.println("SSSS");
        fpw.println("AAAAA");
       fpw.flush();
        fpw.close();


    }
}
