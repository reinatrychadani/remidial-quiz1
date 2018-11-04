/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Pembeli {
    private String nama;
    private String alamat;

    //membuat konstruktor default
    public Pembeli() {
    }

    //membuat konstruktor berparameter
    public Pembeli(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    //membuat getter dan setter dari atribut yang telah diisikan
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //menampilkan info dari pembeli tiket
    public void infoPembeli(){
        System.out.println("Nama Pembeli: "+nama);
        System.out.println("Alamat Pembeli: "+alamat);
    }
}
