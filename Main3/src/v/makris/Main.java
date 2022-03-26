package v.makris;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        try {
            PrintStream console = System.out;
            PrintStream fileOut = new PrintStream("./out.txt");

            System.out.println("Enter data line by line. Type exit to terminate the program");
            System.setOut(fileOut);
            Scanner scanner = new Scanner(System.in);
            String inputLine = scanner.nextLine();
            while(true)
            {
                if("exit".equalsIgnoreCase(inputLine))
                {
                    break;
                }
                System.out.println(inputLine);
                inputLine = scanner.nextLine();

            }
            System.out.println("Program terminated");
            System.setOut(console);
            System.out.println("Program terminated");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

