package Ue11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void print() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public void add(Product p) {
        products.add(p);
    }


    public void saveToFile(String path) throws IOException {

        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Product p : products) {
            System.out.println(p.toString());

            bw.write(p.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }


    public void readFromFile(String path) throws IOException {


        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String zeile = br.readLine();

        while (zeile != null) {

            for (Product p : products) {
                System.out.println(p);
                br.readLine();
            }

            br.close();
        }
    }
}