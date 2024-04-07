package Week_6.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Loglayici {
    public static void logla(String fileName, String message){
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            String date = getToday();
            fileWriter.write("[" + date + "] " + message + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String getToday() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return dateFormat.format(new Date());
    }
}
