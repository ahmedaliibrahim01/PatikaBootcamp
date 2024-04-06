package Week_6.IO;

import java.io.*;
import java.util.Scanner;

public class Notepad {
    static String filePath = "notes";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text : ");
        String text = scanner.nextLine();

        fileWriter(text);
        fileReader();
    }

    public static void fileWriter(String text){
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }

    public static void fileReader(){
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readText = bufferedReader.readLine();
            System.out.println(readText);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }

    }
}
