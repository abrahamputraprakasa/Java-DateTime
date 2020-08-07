package site.abrahamprakasa;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now().plusDays(1);
        System.out.println(tanggalSekarang.toString());

        LocalTime waktuSekarang = LocalTime.now();
        System.out.println(waktuSekarang);

        LocalDateTime tanggalDanWaktuSekarang = LocalDateTime.now();
        System.out.println(tanggalDanWaktuSekarang.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy hh:mm:ss a")));

        LocalDate awal = LocalDate.parse("2015-02-20");
        LocalDate akhir = LocalDate.of(2015, 03, 15);
        System.out.println(awal.format(DateTimeFormatter.ofPattern("dd MM yy")));
        System.out.println(akhir.format(DateTimeFormatter.ofPattern("dd MM yy")));

        int jumlahHari = Period.between(awal, akhir).getDays();
        System.out.println("Jumlah harinya: " + jumlahHari);


        LocalDateTime dtAwal = LocalDateTime.parse("2020-02-20T20:20:20");
        LocalDateTime dtAkhir = LocalDateTime.of(2020, 03, 15,20,20,20);
        long jumlahDetik = Duration.between(dtAwal, dtAkhir).getSeconds();
        System.out.println("Jumlah detiknya: " + jumlahDetik);

    }
}
