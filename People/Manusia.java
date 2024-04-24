package People;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getJenisKelamin() {
        if (jenisKelamin) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public double getTunjangan() {
        if (jenisKelamin && menikah) {
            return 25.0;
        } else if (!jenisKelamin && menikah) {
            return 20.0;
        } else if (!menikah) {
            return 15.0;
        }
        return 0.0;
    }
    public double getPendapatan() {
        return 80.0;
    }
    public String toString() {
        return String.format("Nama\t\t\t: %s\nNIK\t\t\t: %s\nJenis Kelamin\t\t: %s\nJumlah Pendapatan\t: $%.1f", nama, nik, getJenisKelamin(), getPendapatan() + getTunjangan());
    }
}
