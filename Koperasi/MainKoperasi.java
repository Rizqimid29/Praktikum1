package Koperasi;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainKoperasi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pilihan;

        Employee karyawan = new Employee();
        Invoice invoice = new Invoice();

        do {
            System.out.println("\n==========[KOPERASI KARYAWAN]==========");
            System.out.println("1. Login" + "\n2. Belanja" + "\n3. Lihat Detail Belanja" + "\n4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scn.nextInt();
            if (pilihan == 1) {
                System.out.print("\nMasukkan nama Anda: ");
                String nama = scn.next();
                System.out.print("Masukkan nomor registrasi pegawai: ");
                int nomor = scn.nextInt();
                System.out.print("Masukkan jumlah gaji per bulan: ");
                int gaji = scn.nextInt();
                karyawan.setName(nama);
                karyawan.setRegistrationNumber(nomor);
                karyawan.setSalaryPerMonth(gaji);
                
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan jumlah barang yang ingin dibeli: ");
                int jumlahBarang = scn.nextInt();
                invoice.setQuantity(jumlahBarang);
                karyawan.setInvoices(new Invoice[jumlahBarang]);
                for (int i = 0; i < invoice.getQuantity(); i++) {
                    System.out.print("\nMasukkan Nama Barang: ");
                    String productName = scn.next();
                    System.out.print("Masukkan Jumlah Barang: ");
                    int quantity = scn.nextInt();
                    System.out.print("Masukkan Harga Barang: ");
                    int pricePerItem = scn.nextInt();
                    karyawan.getInvoices()[i] = new Invoice(productName, quantity, pricePerItem);
                }

            } else if (pilihan == 3) {
                System.out.println("\n==========[EMPLOYEE STATS]==========");
                System.out.println(karyawan.toString());
                System.out.println("Detail Belanja\t\t:");
                for (int i = 0; i < invoice.getQuantity(); i++) {
                    System.out.println("\t" + (i + 1) + ". " + karyawan.getInvoices()[i]);
                }
                System.out.println("====================================");

                DecimalFormat totalHarga = new DecimalFormat("#,###");
                String formattedTotalHarga = totalHarga.format(karyawan.getPayableAmount());
                System.out.println("\tTotal Belanja: \t\tRp " + formattedTotalHarga);

                DecimalFormat gajiSisa = new DecimalFormat("#,###");
                String formattedGajiSisa = gajiSisa.format(karyawan.gajiSisa());
                System.out.println("Gaji Akhir\t: Rp " + formattedGajiSisa);
            }
        } while (pilihan < 4);
        scn.close();
    }
}

