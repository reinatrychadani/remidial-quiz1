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

    //membuat konstruktor default
    public TiketKonser() {
    }

    //membuat konstruktor berparameter
    public TiketKonser(TiketVIP vip, TiketReguler reguler, Pembeli pembeli) {
        this.vip = vip;
        this.reguler = reguler;
        this.pembeli = pembeli;
    }
    
    
}
