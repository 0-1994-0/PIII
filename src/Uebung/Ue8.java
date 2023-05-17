package Uebung;

import java.io.*;

public class Ue8 {
    public static void main(String[] args) throws IOException {


        InputStreamReader fr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(fr);

        String zeile = br.readLine();

        while (zeile != null) {
            if (zeile.toLowerCase().equals("stop")) {
                break;
            }

            System.out.println(zeile);
            zeile = br.readLine();
            System.out.println();

        }


        br.close();
    }
}


