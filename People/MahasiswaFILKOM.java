package People;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk; 
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }
    public String getStatus() {
        String program = null;
        switch (nim.substring(6, 7)) {
            case "2":
                program = "Teknik Informatika";
                break;
            case "3":
                program = "Teknik Komputer";
                break;
            case "4":
                program = "Sistem Informasi";
                break;
            case "6":
                program = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                program = "Teknologi Informasi";
            default:
                break;
        }
        
        if (program != null) {
            return program + ", 20" + nim.substring(0, 2);
        } 
        return null;
    }
    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50.0;
        } else if (ipk >= 3.5 && ipk <= 4.0) {
            return 75.0;
        }
        return 0.0;
    }
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }
    public String toString() {
        return super.toString() + String.format("\nNIM\t\t\t: %s\nIPK\t\t\t: %.1f\nStatus\t\t\t: %s", nim, ipk, getStatus());
    }
}
