package if1.pkg10119030.latihan26.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program : Program ini menampilkan waktu saat program dijalankan!
*/
public class WaktuSaatIni{
    static Date date = new Date();
    static Locale lokal = Locale.forLanguageTag("id");
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);

    private static void tampilWaktu(){
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
    
    public static void main(String[] args){
        tampilWaktu();
        System.out.println("(Developed by : Rendy Dermawan)");
    }
    
}
