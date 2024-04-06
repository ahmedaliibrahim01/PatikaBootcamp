package Week_6.IO;


import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        File file = new File("src/Week_6/IO/file");
        if (file.delete()){
            System.out.println(file.getName() + " deleted");
        }else {
            System.out.println(file.getName() + " not found");
        }
    }
}
