package Cake;

import java.text.DecimalFormat;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        DecimalFormat harga = new DecimalFormat("#,###");
        String formattedHarga = harga.format(hitungHarga());
        return "Nama Kue\t: " + getNama() + "\nHarga Kue\t: Rp " + formattedHarga;
    }
}
