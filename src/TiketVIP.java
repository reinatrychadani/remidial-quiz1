/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class TiketVIP {
    private int harga;
    private String tribun;

    //membuat konstruktor default
    public TiketVIP() {
    }
    
    //membuat konstruktor tiket vip berparameter
    public TiketVIP(int harga, String tribun) {
        this.harga = harga;
        this.tribun = tribun;
    }
    
    //membuat getter dan setter dari atribut yang telah diisikan
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getTribun() {
        return tribun;
    }

    public void setTribun(String tribun) {
        this.tribun = tribun;
    }
}
