package Week_6.IO;

public class LogMain {
    public static int bol(int sayi, int bolen){
        String startMessage = "Bölme işlemi başlatıldı. Sayı : " + sayi + ", Bolen : " + bolen;
        String logFileName = "log. " + Loglayici.getToday() + ".txt";
        Loglayici.logla(logFileName, startMessage);
        return sayi/bolen;
    }

    public static void main(String[] args) {
        try {
            int result = bol(20,4);
            System.out.println("Result : " + result);
        }catch (Exception e){
            String errorMessage = "Error Message : " + e.getMessage();
            String logFileName = "log. " + Loglayici.getToday() + ".txt";
            Loglayici.logla(logFileName, errorMessage);
            System.out.println(errorMessage);
        }
    }
}
