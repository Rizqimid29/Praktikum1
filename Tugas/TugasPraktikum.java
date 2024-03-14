package Tugas;

import java.util.Scanner;

public class TugasPraktikum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DaftarBuku buku = new DaftarBuku();
        int pilihan;
        String jawaban;
        do {
            System.out.println("\n========[Perpustakaan]========");
            System.out.println("1. Teknologi" + "\n2. Filsafat" + "\n3. Sejarah" + "\n4. Agama" 
            + "\n5. Psikologi" + "\n6. Politik" + "\n7. Fiksi" + "\n8. Tampilkan total buku yang tersedia"
            + "\n9. Keluar dari program");
            System.out.print("Pilihan Anda: ");
            pilihan = scn.nextInt();
            if (pilihan == 1) {
                buku.bukuTeknologi();
            } else if (pilihan == 2) {
                buku.bukuFilsafat();
            } else if (pilihan == 3) {
                buku.bukuSejarah();
            } else if (pilihan == 4) {
                buku.bukuAgama();
            } else if (pilihan == 5) {
                buku.bukuPsikologi();
            } else if (pilihan == 6) {
                buku.bukuPolitik();
            } else if (pilihan == 7) {
                buku.bukuFiksi();
            } else if (pilihan == 8) {
                System.out.println("COUNT: Total semua buku = 35");
                break;
            } else if (pilihan == 9) {
                break;
            }
        System.out.print("\nApakah Anda ingin melihat buku lain? (y/n): ");
        jawaban = scn.next();
        } while (jawaban.equals("y"));
    }
}
