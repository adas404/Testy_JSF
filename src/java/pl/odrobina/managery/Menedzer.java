/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.odrobina.managery;
import java.util.*;
import pl.odrobina.Spolka;
/**
 *
 * @author Adam
 */
public class Menedzer {
    private List<Spolka> spolki;

    public List<Spolka> getSpolki() {
        return spolki;
    }

    public void setSpolki(List<Spolka> spolki) {
        this.spolki = spolki;
    }
    
    public Menedzer(){
        spolki = new ArrayList<Spolka>(3);
        Date d = new Date();
        spolki.add(new Spolka("Kocia Spolka weglowa trololol", "KSW", "energetyczny", 20.0 , 11.1, d));
        spolki.add(new Spolka("KitKompDotCom", "KKDC", "informat", 90.0,3.4,d));
        spolki.add(new Spolka("cosaam","CSC","rozrywka",15.0,-11.7,d));
    }
}
