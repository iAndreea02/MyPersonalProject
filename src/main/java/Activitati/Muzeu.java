/*
Muzeu 
-Initializez info despre muzeu :an , tipul ,
            super (ratting ,adresa ,nume,program ,nr adulti ,nr copii),
            pretcopil,pretadult

-Creez constructori(parametru,fara parametru ,copiere)
-setam pretul pt adult dar si pt copil,dar la el va fi cu reducere
            *si setam si pretul pentru :suvenir,poze ,donari(aici va scris la tastatura)
-Cu toate ca alegem ce tip de muzeu vizitam,vom specifica si obiectele pe care le vor descoperi la intrare in muzeu
-Cream metoda cumparBilet ,unde vom adauga in factura pretul total la achizitionarea biletelor
-creem metoda vreaSaIntre,iar daca nu are bilet nu are acces sa intre
- create ghid

 */
package Activitati;

import static datele_mele.DateCity.vecCasaMemoriala;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import yas.proiect.smart.Turism;
// String[] tipul = {"Casa memoriabila","Muzeu"};

public class Muzeu extends Turism {
//Nume muzeu

    //Date despre muzeu
    public int an;
    public String tipul;
    public int suprafata;

//Date bilet
    //Constructo -fara parametrii
    public Muzeu() {

        super();
        tipul = "Necunoscut";
        an = 0;
        suprafata = 0;

    }

    //-cu param
    public Muzeu(String nume, String adresa, int program[], float rating, double[] pret, String tipul, int an, int suprafata) {
        super(nume, adresa, program, rating, pret);
        this.tipul = tipul;
        this.an = an;
        this.suprafata = suprafata;

    }

    //-de copiere
    public Muzeu(Muzeu m) {
        super(m);
        this.tipul = m.tipul;
        this.an = m.an;
        this.suprafata = m.suprafata;
    }

    //Buy ticket & Entry
    public void cumparBilet(int nrCopii, int nrAdulti) {
        System.out.println("\n\nBine ai venit la: " + nume);
        System.out.println("Pret la adulti este : " + pret[1] + "lei.   \nPret la copii: " + pret[0] + " lei.");
        bill += nrCopii * pret[0] + nrAdulti * pret[1];
        System.out.println("Nr de adulti: " + nrAdulti + " \nNr de copii: " + nrCopii + "  va ajunge la pretul de " + (nrCopii * pret[0] + nrAdulti * pret[1]) + " lei\n\n");
    }

    public double getValBilet(int nrCopii, int nrAdulti) {

        return (nrCopii * pret[0] + nrAdulti * pret[1]);
    }

    public double showThatPrice(String nume) {
        Map<String, Double> m = new HashMap<>();
        m.put("Poze", pret[2]);
        m.put("Breloc", pret[3]);
        m.put("Magneti", pret[4]);
        m.put("Carti", pret[5]);
        return m.get(nume);
    }

    //Shop +Poze
    public void vreaPoze() {
        System.out.println("Taxa de poze este : " + pret[2]);
        bill += pret[2];
    }

    public void vreaSuvenir(String raspuns) {
        System.out.println("La suvenir avem : Breloc " + pret[3] + " \n Magneti- " + pret[4] + "\n Carti -" + pret[5]);
        //String raspuns = in.next();
        switch (raspuns) {
            case "Breloc":
                bill += pret[3];
                break;
            case "Magneti":
                bill += pret[4];
                break;
            case "Carti":
                bill += pret[5];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    public void vreaSaDoneze(double donare) {

        System.out.println("Vizitatorii vor dona: " + donare);
        //  donare = in.nextDouble();
        bill += donare;

    }

    //@Override
    @Override
    public String toString() {
        return super.toString() + "\nCategorie: " + this.tipul + "\n Anul infintat: " + an + "\nSuprafata: " + this.suprafata + "\n\n";
    }

    public static void conditieMuzeu(ArrayList<Muzeu>vecMuzeu,int program,String tipul)
    {
    
    for (Muzeu muzeu:vecMuzeu){
        if(muzeu.program[0]>program && muzeu.tipul.equals(tipul))
            System.out.println(muzeu);
    }}
}
