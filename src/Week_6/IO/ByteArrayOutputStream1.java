package Week_6.IO;

import java.io.ByteArrayInputStream;

public class ByteArrayOutputStream1 {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            // 2 baytlık veri atlanacaktır
            input.skip(2);

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}