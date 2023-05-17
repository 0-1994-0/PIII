package Uebung;

import java.io.*;

public class Ue10 {
    public static void main(String[] args) throws IOException {
        InputStreamReader fr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(fr);

        File f = new File("Noten.txt");

        FileWriter pw = new FileWriter(f, true);
        PrintWriter fpw = new PrintWriter(pw);



        String zeile = br.readLine();

        while (zeile != null) {
            if (zeile.toLowerCase().equals("stop")) {
                break;
            }

            System.out.println(zeile);
            //pw.write(zeile);
            //pw.write("\r\n");
            fpw.write(zeile);
            //fpw.println(zeile);
            fpw.flush();
            zeile = br.readLine();
        }

        br.close();
    }
}

