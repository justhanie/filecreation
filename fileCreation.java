import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {

        // writing text to a file
        // ctrl + / = shortcut sa comment
        // try {

        // File main = new File("main.txt");
        // FileWriter writer = new FileWriter(main);

        // writer.write("Hello Worlds, Never been there.\n");
        // writer.write("Hello Worlds, Never been there.\n");
        // writer.write("Hello Worlds, Never been there.");
        // writer.close();

        // System.out.println("Nisulod na ang data sa file.");

        // } catch (Exception e) {
        // System.out.println("Nar error sya");
        // }

        // reading text in file

        try {
            File main = new File("main.txt");
            Scanner scan = new Scanner(main);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Nar error sya");
        }

    }
}
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) {

        // writing text to a file
        // ctrl + / = shortcut sa comment
        // try {

        // File main = new File("main.txt");
        // FileWriter writer = new FileWriter(main);

        // writer.write("Hello Worlds, Never been there.\n");
        // writer.write("Hello Worlds, Never been there.\n");
        // writer.write("Hello Worlds, Never been there.");
        // writer.close();

        // System.out.println("Nisulod na ang data sa file.");

        // } catch (Exception e) {
        // System.out.println("Nar error sya");
        // }

        // reading text in file

        try {
            File main = new File("main.txt");
            Scanner scan = new Scanner(main);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Nar error sya");
        }

    }
}