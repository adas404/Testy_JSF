/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.odrobina;

import java.util.Date;

/**
 *
 * @author Adam
 */
public class Notowanie {
    private double cena;
    private Date dzien;
    private double zmiana;
    private Spolka spolka;

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Date getDzien() {
        return dzien;
    }

    public void setDzien(Date dzien) {
        this.dzien = dzien;
    }

    public double getZmiana() {
        return zmiana;
    }

    public void setZmiana(double zmiana) {
        this.zmiana = zmiana;
    }

    public Spolka getSpolka() {
        return spolka;
    }

    public void setSpolka(Spolka spolka) {
        this.spolka = spolka;
    }
    public Notowanie() {}
    public Notowanie(double cena, Date dzien, double zmiana, Spolka spolka){
        this.cena = cena;
        this.dzien = dzien;
        this.zmiana = zmiana;
        this.spolka = spolka;
    }
}
