package Week_5.FindFrequentWord;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //String metin = "Kullanıcı tarafından girilen bir metinde en çok geçen kelimeyi bulup ekrana yazdıran bir Java projesi yazınız.";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metne Gir : ");
        String metin = scanner.nextLine();

        // Metni kelimelere ayır
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saymak için HashMap kullan
        Map<String, Integer> kelimeSayisi = new HashMap<>();

        // Kelimeleri döngüyle tek tek dolaşarak her birini HashMap'e ekle
        for (String kelime : kelimeler) {
            // Küçük-büyük harf duyarlılığını önlemek için küçük harfe çevir
            String temizKelime = kelime.toLowerCase();

            // Eğer kelime HashMap'te varsa, count'u bir artır; yoksa yeni bir giriş yap
            if (kelimeSayisi.containsKey(temizKelime)) {
                kelimeSayisi.put(temizKelime, kelimeSayisi.get(temizKelime) + 1);
            } else {
                kelimeSayisi.put(temizKelime, 1);
            }
        }

        // En çok geçen kelimeyi bul
        String enCokGecenKelime = "";
        int enYuksekSayi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayisi.entrySet()) {
            if (entry.getValue() > enYuksekSayi) {
                enYuksekSayi = entry.getValue();
                enCokGecenKelime = entry.getKey();
            }
        }

        // Sonucu ekrana yazdır
        System.out.println("En çok geçen kelime: " + enCokGecenKelime + " (" + enYuksekSayi + " kez)");
    }
}