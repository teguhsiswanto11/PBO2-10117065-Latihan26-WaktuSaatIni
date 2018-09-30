package pbo2.pkg10117065.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Memformat tanggal dan waktu sesuai dengan lokasi kita 
 * berada
 * 
 */
public class PBO210117065Latihan26WaktuSaatIni {
    
 public static void main(String[] args) {
     Date date = new Date();
     Calendar cal = Calendar.getInstance();
     int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
//     format tanggal dan waktu
     SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        
//     data array -> nama hari Indonesia
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamus","Jumat"};
        
//     menampilkannya sesuai format
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));

    }
}
