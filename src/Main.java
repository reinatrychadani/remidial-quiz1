/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        TiketVIP v = new TiketVIP();
        v.setTribun("Tribun VIP");
        v.setHarga(80000);
        
        TiketReguler r = new TiketReguler();
        r.setTribun("Tribun Reguler");
        r.setHarga(40000);
        
        Pembeli b = new Pembeli();
        b.setNama("Amara Latifa");
        b.setAlamat("Jl. Buah Manggis no 3");
        
        TiketKonser k = new TiketKonser();
        k.setVip(v);
        k.setReguler(r);
        k.setHarga(80000);
        k.setJumlah(3);
        k.setPembeli(b);
        
        System.out.println("----Daftar Tiket----");
        k.infoTiketKonser();
        System.out.println();
        System.out.println("----Data Pembeli----");
        b.infoPembeli();
        System.out.println();
        System.out.println("Total Harga Tiket: "+k.totalTiket());
    }
}
