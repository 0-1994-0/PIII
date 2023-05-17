package Ue11;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        ProductManager productManager = new ProductManager();

        Product p1 = new Product("Gurke",2.0,"Gemüse");
        Product p2 = new Product("Tomaten",3.5,"Gemüse");
        System.out.println("Produkt :" +p1);

        productManager.add(p1);
        productManager.add(p2);


        productManager.print();

        productManager.saveToFile("a.txt");
        productManager.readFromFile("a.txt");
    }
}
