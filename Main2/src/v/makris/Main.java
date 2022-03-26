package v.makris;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        try {
            URL url = Main2.class.getResource("./File.txt");
            File file = new File(url.getPath());
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){

                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
