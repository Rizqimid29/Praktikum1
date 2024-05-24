package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Daftar_Ulang extends Frame {
    Label lbNama_Lengkap, lbTanggal_Lahir, lbNomor_Pendaftaran, lbNo_Telp, lbAlamat, lbEmail;
    TextField txtNama_Lengkap, txtTanggal_Lahir, txtNomor_Pendaftaran, txtNo_Telp, txtAlamat, txtEmail;
    Button btnSubmit;

    public Daftar_Ulang() {
        setLayout(null);

        lbNama_Lengkap = new Label("Nama Lengkap");
        add(lbNama_Lengkap);
        lbNama_Lengkap.setBounds(50, 30, 100, 25);

        lbTanggal_Lahir = new Label("Tanggal Lahir");
        add(lbTanggal_Lahir);
        lbTanggal_Lahir.setBounds(50, 60, 100, 25);

        lbNomor_Pendaftaran = new Label("Nomor Pendaftaran");
        add(lbNomor_Pendaftaran);
        lbNomor_Pendaftaran.setBounds(50, 90, 110, 25);

        lbNo_Telp = new Label("No. Telp");
        add(lbNo_Telp);
        lbNo_Telp.setBounds(50, 120, 100, 25);

        lbAlamat = new Label("Alamat");
        add(lbAlamat);
        lbAlamat.setBounds(50, 150, 100, 25);

        lbEmail = new Label("Email");
        add(lbEmail);
        lbEmail.setBounds(50, 200, 100, 25);

        txtNama_Lengkap = new TextField(null);
        add(txtNama_Lengkap);
        txtNama_Lengkap.setBounds(200, 30, 200, 20);

        txtTanggal_Lahir = new TextField(null);
        add(txtTanggal_Lahir);
        txtTanggal_Lahir.setBounds(200, 60, 200, 20);

        txtNomor_Pendaftaran = new TextField(null);
        add(txtNomor_Pendaftaran);
        txtNomor_Pendaftaran.setBounds(200, 90, 200, 20);

        txtNo_Telp = new TextField(null);
        add(txtNo_Telp);
        txtNo_Telp.setBounds(200, 120, 200, 20);

        txtAlamat = new TextField(null);
        add(txtAlamat);
        txtAlamat.setBounds(200, 150, 200, 40);

        txtEmail = new TextField(null);
        add(txtEmail);
        txtEmail.setBounds(200, 200, 200, 20);

        btnSubmit = new Button("submit");
        add(btnSubmit);
        btnSubmit.setBounds(300, 230, 100, 20);
        btnSubmit.addActionListener(new MainAction());
    }

    class MainAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String namaLengkap = txtNama_Lengkap.getText().trim();
            String tanggalLahir = txtTanggal_Lahir.getText().trim();
            String nomorPendaftaran = txtNomor_Pendaftaran.getText().trim();
            String nomorTelp = txtNo_Telp.getText().trim();
            String alamat = txtAlamat.getText().trim();
            String email = txtEmail.getText().trim();

            boolean fieldTerisi = true;

            if (namaLengkap.isEmpty()) {
                txtNama_Lengkap.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(tanggalLahir.isEmpty()) {
                txtTanggal_Lahir.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(nomorPendaftaran.isEmpty()) {
                txtNomor_Pendaftaran.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(nomorTelp.isEmpty()) {
                txtNo_Telp.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(alamat.isEmpty()) {
                txtAlamat.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(email.isEmpty()) {
                txtEmail.setText("Mohon diisi terlebih dahulu!");
                fieldTerisi = false;
            } else if(fieldTerisi) {
                boolean showNewWindow = true;
                int confirmation = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

                if (confirmation != JOptionPane.YES_OPTION) {
                    showNewWindow = false;
                } else if (showNewWindow) {
                    NewWindow newWindow = new NewWindow(namaLengkap, tanggalLahir, nomorPendaftaran, nomorTelp, alamat, email);
                    newWindow.setSize(400, 350);
                    newWindow.setVisible(true);
                }
            }
        }
    }
}

class MainDaftarUlang {
    public static void main(String[] args) {
        Daftar_Ulang frame = new Daftar_Ulang();
        frame.setTitle("Form Daftar Ulang");
        frame.setSize(450, 300);
        frame.setVisible(true);
    }
}

class NewWindow extends JFrame {
    private String namaLengkap;
    private String tanggalLahir;
    private String nomorPendaftaran;
    private String nomorTelp;
    private String alamat;
    private String email;

    public NewWindow(String namaLengkap, String tanggalLahir, String nomorPendaftaran, String nomorTelp, String alamat, String email) {
        setLayout(null);

        this.namaLengkap = namaLengkap;
        this.tanggalLahir = tanggalLahir;
        this.nomorPendaftaran = nomorPendaftaran;
        this.nomorTelp = nomorTelp;
        this.alamat = alamat;
        this.email = email;

        setTitle("Data Mahasiswa");

        JLabel lbJudul = new JLabel("Data Mahasiswa");
        lbJudul.setFont(new Font("Arial", 1, 14));
        add(lbJudul);
        lbJudul.setBounds(100, 30, 250, 20);

        JLabel lbNama_Lengkap = new JLabel("Nama Lengkap: " + namaLengkap);
        add(lbNama_Lengkap);
        lbNama_Lengkap.setBounds(50, 60,300, 25);

        JLabel lbTanggal_Lahir = new JLabel("Tanggal Lahir: " + tanggalLahir);
        add(lbTanggal_Lahir);
        lbTanggal_Lahir.setBounds(50, 90,300, 25);

        JLabel lbNomor_Pendaftaran = new JLabel("No. Pendaftaran: " + nomorPendaftaran);
        add(lbNomor_Pendaftaran);
        lbNomor_Pendaftaran.setBounds(50, 120,300, 25);

        JLabel lbNomor_Telp = new JLabel("No. Telp: " + nomorTelp);
        add(lbNomor_Telp);
        lbNomor_Telp.setBounds(50, 150,300, 25);

        JLabel lbAlamat = new JLabel("Alamat: " + alamat);
        add(lbAlamat);
        lbAlamat.setBounds(50, 180,300, 25);

        JLabel lbEmail = new JLabel("Email\t: " + email);
        add(lbEmail);
        lbEmail.setBounds(50, 210,300, 25);
    }
}





