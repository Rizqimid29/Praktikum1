package People;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int year, int month, int dayofMonth, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        this.tahunMasuk = LocalDate.of(year, month, dayofMonth);
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public double getGaji() {
        return gaji;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public double getBonus() {
        int tahunLamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();

        if (tahunLamaBekerja >= 0 && tahunLamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (tahunLamaBekerja >= 5 && tahunLamaBekerja <= 10) {
            return 0.1 * gaji;
        } else if (tahunLamaBekerja > 10) {
            return 0.15 * gaji;
        }
        return 0.0;
    }
    public double getTunjangan() {
        int tunjangan = 0;
        for (int i = 0; i < jumlahAnak; i++) {
            tunjangan += 20.0;
        }
        return super.getTunjangan() + tunjangan;
    } 
    public double getPendapatan() {
       return super.getPendapatan() + getGaji() + getBonus();
    }
    public String toString() {
        String formatTahunMasuk = tahunMasuk.format(DateTimeFormatter.ofPattern("d M yyyy"));
        return super.toString() + String.format("\nTahun Masuk\t\t: %s\nJumlah Anak\t\t: %d\nGaji\t\t\t: $%.1f", formatTahunMasuk, jumlahAnak, gaji);
    }
}
