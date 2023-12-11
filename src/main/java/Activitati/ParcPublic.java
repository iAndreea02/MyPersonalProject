/*
    -constructori
    -nr de banci
    -toalete publice
    -tolomatul de inghetata
    -activitati:    -mersul cu masinile pt copii
                    -trambuline
                    -caruser
                    -inchiriere biciclete
 */
package Activitati;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import yas.proiect.smart.Turism;


public class ParcPublic extends Turism {

    public int nrToalete;
    public double suprafata;
    
    public int nrBiciclete ;
    public int nrBanci;
    public int reducere;
    ///private String[] other;
    
    public ParcPublic() {
        super();
        suprafata=0;
        nrBanci = 0;
        nrToalete = 0;
        nrBiciclete=0;
        reducere=0;
    }
     public double showThatPrice(String nume) {
        Map<String, Double> m = new HashMap<>();
        m.put("Toaleta", pret[2]);
        m.put("Bicicleta", pret[3]);
        return m.get(nume);
    }
    
    public double getValBilet(int nrCopii,int nrAdulti){
        return (nrCopii * pret[0] + nrAdulti * pret[1]);
    
    }

    public ParcPublic(String nume, String adresa, int program[], float rating, double[] pret,double suprafata ,int nrToalete,int nrBanci,int nrBiciclete,int reducere) {
        super(nume, adresa, program, rating, pret);
        this.suprafata=suprafata;
        this.nrToalete = nrToalete;
        this.nrBanci=nrBanci;
        this.nrBiciclete=nrBiciclete;
        this.reducere=reducere;
    }

    public ParcPublic(ParcPublic P) {
        super(P);
        this.suprafata = P.suprafata;
        this.nrBanci=P.nrBanci;
        this.nrToalete=P.nrToalete;
        this.nrBiciclete=P.nrBiciclete;
        this.reducere=P.reducere;
    }
    
        public void vreaSaIntre(int nrCopii,int nrAdulti){
            if(pret[0]!=0){
                bill+=nrCopii * pret[0] + nrAdulti * pret[1];
                System.out.println("Ai achitat!! "+bill);
            }else System.out.println("nu platesti nimic");
        }
    public void folosescToaleta() {
      
        System.out.println("\nTaxa la toaleta: " + pret[2]);
        bill += pret[2];
    }
    
    public void setBiciclete(int nr_biciclete) {
    if(nr_biciclete<0)
    {System.out.println("Ati introdus o valoare negativa");
        System.exit(1);
    }
        this.nrBiciclete=nr_biciclete;
    }
    
    public void inchiriezBicicleta(int ora,int nr_adulti,int nr_copii,int reducere){
    if(this.nrBiciclete ==0)
        System.out.println("Nu aveti biciclete disponibile:(");
    else 
    {   
        System.out.println("Ati inchiriat "+(nr_adulti+nr_copii)+"bicicleta/e.\n Pret/ora la *adult: " +super.pret[1]+ " *copii: " +super.pret[0]);
        bill+=(super.pret[3]*nr_adulti+(pret[3]-reducere*pret[3]/100)*nr_copii)*ora;
        System.out.println("Suma totata pentru "+ora+ "ora/e: "+((pret[2]*nr_adulti+pret[3]*nr_copii)*ora));
    }   
    }
        public double getBike(int ora,int nr_adulti,int nr_copii,int reducere){
        return (super.pret[3]*nr_adulti+(pret[3]-reducere*pret[3]/100)*nr_copii)*ora;
        }
    //magazin

    @Override
    public String toString() {
        return super.toString() +"\nSuprafata: " 
                +this.suprafata+"\nNr de *toalete " 
                + this.nrToalete+"\nNr de banci: "+this.nrBanci
                +"\nNr de biciclete de inchiriat: "+this.nrBiciclete+"\n\n"+(pret[0]==0?"\nIntrare libera ":"Taxa de intrare este : *copii "+pret[0]+" *adulti:"+pret[1]) ;
    }
     
    public static void conditieParc(ArrayList<ParcPublic>vecParcPublic,float rating,boolean toilet){
     
    for (ParcPublic parc:vecParcPublic)
        if((toilet==true && parc.nrToalete>0)||(toilet==false && parc.nrToalete==0))
            if(parc.rating>rating ){
            System.out.println(parc);
        }
    }
        
    }
    


