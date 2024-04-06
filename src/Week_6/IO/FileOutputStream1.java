package Week_6.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
    public static void main(String[] args) {
        String data = "\n ve tekrar";
        try {
            FileOutputStream output = new FileOutputStream("ali.txt", true);
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
