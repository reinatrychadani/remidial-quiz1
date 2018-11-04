/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class TiketKonser {
    private TiketVIP vip;
    private TiketReguler reguler;
    private Pembeli pembeli;
    private int harga;
    private int jumlah;

    //membuat konstruktor default
    public TiketKonser() {
    }

    //membuat konstruktor berparameter
    public TiketKonser(TiketVIP vip, TiketReguler reguler, Pembeli pembeli, int harga, int jumlah) {
        this.vip = vip;
        this.reguler = reguler;
        this.pembeli = pembeli;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    //membuat getter dan setter dari atribut yang telah diisikan
    public TiketVIP getVip() {
        return vip;
    }

    public void setVip(TiketVIP vip) {
        this.vip = vip;
    }

    public TiketReguler getReguler() {
        return reguler;
    }

    public void setReguler(TiketReguler reguler) {
        this.reguler = reguler;
    }

    public Pembeli getPembeli() {
        return pembeli;
    }

    public void setPembeli(Pembeli pembeli) {
        this.pembeli = pembeli;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //menghitung total tiket yang dibeli
    public int totalTiket(){
        return jumlah*harga;
    }
    
    //menampilkan info harga dan tribun
    public void infoTiketKonser(){
        System.out.println(vip.getTribun());
        System.out.println("Harga Tiket: "+vip.getHarga());
        System.out.println(reguler.getTribun());
        System.out.println("Harga Tiket: "+reguler.getHarga());
    }
}
