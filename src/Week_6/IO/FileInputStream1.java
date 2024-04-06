package Week_6.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStream1 {
    public static void main(String[] args) {
        FileInputStream input = null;
        try {
            input = new FileInputStream("src/Week_5/SQL/SQL.md");

            int i = input.read();

            while (i != -1){
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}