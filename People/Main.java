package People;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------" + "\nKelas Manusia\n" + "-------------");
        Manusia a1 = new Manusia("Rizqi", "3523162906050001", true, true);
        System.out.println(a1); //Laki-laki telah menikah
        System.out.println();
        Manusia a2 = new Manusia("Selly", "3523161005040003", false, true);
        System.out.println(a2); //Perempuan telah menikah
        System.out.println();
        Manusia a3 = new Manusia("Angga", "3523162805050001", true, false);
        System.out.println(a3); //Belum menikah
        System.out.println();

        System.out.println("---------------------" + "\nKelas MahasiswaFILKOM\n" + "---------------------");
        MahasiswaFILKOM b1 = new MahasiswaFILKOM("235150201111027", 2.9, "Jono", "3523163005050001", true, true);
        System.out.println(b1); //ipk < 3
        System.out.println();
        MahasiswaFILKOM b2 = new MahasiswaFILKOM("235150301111028", 3.3, "Syahla", "3523160709040003", false, true);
        System.out.println(b2); //ipk 3 - 3.5
        System.out.println();
        MahasiswaFILKOM b3 = new MahasiswaFILKOM("235150401111029", 4.0, "Rakha", "3523162001050001", true, false);
        System.out.println(b3); //ipk 3.5 - 4
        System.out.println();

        System.out.println("-------------" + "\nKelas Pekerja\n" + "-------------");
        Pekerja c1 = new Pekerja(1000, 2022, 4, 3, 2, "Hendy", "3523162807000001", true, true);
        System.out.println(c1); //Lama bekerja 2 tahun, anak 2
        System.out.println();
        Pekerja c2 = new Pekerja(1000, 2015, 6, 5, 0, "Yasmin", "3523162312000003", false, true);
        System.out.println(c2); //Lama bekerja 9 tahun
        System.out.println();
        Pekerja c3 = new Pekerja(1000, 2004, 8, 7, 10, "Sujono", "3523162802730001", true, false);
        System.out.println(c3); //Lama bekerja 20 tahun, anak 10
        System.out.println();

        System.out.println("-------------" + "\nKelas Manager\n" + "-------------");
        Manager d = new Manager("HRD", 7500, 2009, 10, 9, 0, "Arif", "3523161703980001", true, true);
        System.out.println(d); //Lama bekerja 15 tahun dengan gaji $7500
    }
}
