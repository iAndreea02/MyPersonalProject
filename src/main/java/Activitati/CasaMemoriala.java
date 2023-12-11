/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activitati;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import yas.proiect.smart.Turism;

/*
Casa memoriabila 
-  

 */
public class CasaMemoriala extends Turism {

    public String Proprietar;
    public String EvenimentMemorial;
    public String tipCladire; //conac cetate casa 
    public boolean ghid;
    public int an;
    public CasaMemoriala() {
        super();
        this.Proprietar = "Necunoscut";
        this.EvenimentMemorial = "Nimic";
        tipCladire = "Necunoscut";
        ghid = false;
        an=0;
    }

    public CasaMemoriala(String nume, String adresa, int program[], float rating, double[] pret, String tipCladire, int an, String Proprietar, String EvenimentMemoriala, boolean ghid) {
        super(nume, adresa, program, rating, pret);
        this.Proprietar = Proprietar;
        this.EvenimentMemorial = EvenimentMemoriala;
        this.tipCladire = tipCladire;
        this.ghid = ghid;
        this.an=an;
    }

    public CasaMemoriala(CasaMemoriala m) {
        super(m);
        this.Proprietar = m.Proprietar;
        this.EvenimentMemorial = m.EvenimentMemorial;
        this.tipCladire = m.tipCladire;
        this.ghid = m.ghid;
        this.an=m.an;
    }

    public void cumparBilet(int nrCopii, int nrAdulti) {
        System.out.println("******Bine ai venit la: " + nume + " ********");
        System.out.println("Pret la adulti este : " + pret[1] + "lei.   \nPret la copii: " + pret[0] + " lei.");

        bill += nrCopii * pret[0] + nrAdulti * pret[1];
        System.out.println("Nr de adulti: " + nrAdulti + " \nNr de copii " + nrCopii + " va ajunge la pretul de " + (nrCopii * pret[0] + nrAdulti * pret[1]) + " lei\n\n");
    }

    public double showThatPrice(String nume) {
        Map<String, Double> m = new HashMap<>();
        m.put("Ghid", pret[2]);
        m.put("Sceneta", pret[3]);
        return m.get(nume);
    }
    
    public double getValBilet(int nrCopii,int nrAdulti){
        return (nrCopii * pret[0] + nrAdulti * pret[1]);
    
    }
    
    public void vreaGhid() {
        if (ghid == true) {
            System.out.println("Taxa pentru ghid este " + pret[2]);
            bill += pret[2];
        } else {
            System.out.println(nume + "nu are ghid");
        }
    }

    public void vreaSceneta() {
        System.out.println("Pretul la sceneta este " + pret[3]);
        bill += pret[3];

    }

    public void vreaSaDoneze(double donare) {
        System.out.println("Vizitatorii vor dona: ");
        bill += donare;

    }
    
    public static void conditieCasa(ArrayList<CasaMemoriala> vecCasaMemoriala,boolean ghid,int an){
        for(CasaMemoriala casa: vecCasaMemoriala){
        if(ghid == casa.ghid && casa.an >= an){
            System.out.println(casa);
        } 
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip cladire: " + this.tipCladire + "\n Autor: " + Proprietar + "\nEveniment memorial: " + this.EvenimentMemorial + "\n Ghid: " + (ghid ? "Da" : "Nu") + "\nAn: "+an+"\n\n";
    }

}
