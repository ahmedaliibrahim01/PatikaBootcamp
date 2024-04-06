package Week_6.IO;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStream1 {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            System.out.println("Available bytes at the beginning: " + input.available());

            System.out.println("The bytes read from the input stream: ");
            for (int i = 0; i < array.length; i++) {
                int data = input.read();
                System.out.print(data + ", ");
            }
            System.out.println("Available bytes at the beginning: " + input.available());
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}