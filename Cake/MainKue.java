package Cake;

import java.text.DecimalFormat;

public class MainKue {
    public static void main(String[] args) {
        double totalHargaKue = 0.0, totalHargaKuePesanan = 0.0, totalHargaKueJadi = 0.0, totalBerat = 0.0, totalJumlah = 0.0;
        
        KuePesanan[] kue = new KuePesanan[10];
        KueJadi[] jajan = new KueJadi[10];

        kue[0] = new KuePesanan("Dadar Gulung", 2500, 8);
        System.out.println(kue[0]);
        System.out.println();
        kue[1] = new KuePesanan("Ketan Hitam", 2000, 5);
        System.out.println(kue[1]);
        System.out.println();
        kue[2] = new KuePesanan("Ketan Salak", 1500, 5);
        System.out.println(kue[2]);
        System.out.println();
        kue[3] = new KuePesanan("Lepet", 1500, 6);
        System.out.println(kue[3]);
        System.out.println();
        kue[4] = new KuePesanan("Pertolo", 3000, 9);
        System.out.println(kue[4]);
        System.out.println();
        kue[5] = new KuePesanan("Putu Ayu", 2500, 5);
        System.out.println(kue[5]);
        System.out.println();
        kue[6] = new KuePesanan("Jenang Jagung", 3000, 6);
        System.out.println(kue[6]);
        System.out.println();
        kue[7] = new KuePesanan("Lemper", 2500, 7);
        System.out.println(kue[7]);
        System.out.println();
        kue[8] = new KuePesanan("Putri Mandi", 2500, 6);
        System.out.println(kue[8]);
        System.out.println();
        kue[9] = new KuePesanan("Kue Cucur", 2000, 5);
        System.out.println(kue[9]);
        System.out.println();

        jajan[0] = new KueJadi("Terang Bulan Mini", 2500, 20);
        System.out.println(jajan[0]);
        System.out.println();
        jajan[1] = new KueJadi("Sosis Solo", 2500, 25);
        System.out.println(jajan[1]);
        System.out.println();
        jajan[2] = new KueJadi("Risoles", 2500, 15);
        System.out.println(jajan[2]);
        System.out.println();
        jajan[3] = new KueJadi("Risol Mayo", 3000, 10);
        System.out.println(jajan[3]);
        System.out.println();
        jajan[4] = new KueJadi("Roti Sosis", 3500, 10);
        System.out.println(jajan[4]);
        System.out.println();
        jajan[5] = new KueJadi("Rogut", 3000, 15);
        System.out.println(jajan[5]);
        System.out.println();
        jajan[6] = new KueJadi("Agar-agar", 2000, 25);
        System.out.println(jajan[6]);
        System.out.println();
        jajan[7] = new KueJadi("Martabak", 3000, 15);
        System.out.println(jajan[7]);
        System.out.println();
        jajan[8] = new KueJadi("Lumpia", 2500, 20);
        System.out.println(jajan[8]);
        System.out.println();
        jajan[9] = new KueJadi("Kue Sus", 2500, 35);
        System.out.println(jajan[9]);
        System.out.println();

        for (int i = 0; i < kue.length; i++) {
            if (kue[i] != null) {
                totalHargaKue += kue[i].hitungHarga() + jajan[i].hitungHarga();
            }
        }
        DecimalFormat harga = new DecimalFormat("#,###");
        String formattedTotalHargaKue = harga.format(totalHargaKue);
        System.out.println("============[S T A T S]============" + "\nTotal Harga Semua Kue: Rp " + formattedTotalHargaKue);

        for (int i = 0; i < 10; i++) {
            if (kue[i] != null) {
                totalHargaKuePesanan += kue[i].hitungHarga();
                totalBerat += kue[i].getBerat();
            }
        }
        DecimalFormat harga1 = new DecimalFormat("#,###");
        String formattedTotalHargaKuePesanan = harga1.format(totalHargaKuePesanan);
        System.out.println("\nTotal Harga Kue Pesanan: Rp " + formattedTotalHargaKuePesanan + "\nTotal Berat Kue Pesanan: " + totalBerat + " gram");

        for (int i = 0; i < 10; i++) {
            if (jajan[i] != null) {
                totalHargaKueJadi += jajan[i].hitungHarga();
                totalJumlah += jajan[i].getJumlah();
            }
        }
        DecimalFormat harga2 = new DecimalFormat("#,###");
        String formattedTotalHargaKueJadi = harga2.format(totalHargaKueJadi);
        System.out.println("\nTotal Harga Kue Jadi: Rp " + formattedTotalHargaKueJadi + "\nTotal Jumlah Kue Jadi: " + totalJumlah + " buah");

        System.out.println("\nKue Dengan Harga Tertinggi" + "\n\tBerdasarkan Jenis\t: Kue Jadi" + "\n\tBerdasarkan Nama Kue\t: Kue Sus");
    }
}
