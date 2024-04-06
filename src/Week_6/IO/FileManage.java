package Week_6.IO;

import java.io.*;

public class FileManage {

    public static void main(String[] args) {
        String filePath = "file.txt";
        int total = 0;

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                int number = Integer.parseInt(line);
                total += number;
            }
            System.out.println("Total : " + total);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }


    }
}
