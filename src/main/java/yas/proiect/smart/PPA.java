
package yas.proiect.smart;

import java.util.HashMap;
import java.util.Map;

public class PPA extends Turism {
    
    private boolean areAmbulanta;
    public String servicii;

    public PPA() 
    {
        super();
        areAmbulanta = false;
    }

    public PPA(String nume, String adresa, int program[], float rating, double[] pret, boolean areAmbulanta) 
    {
        super(nume, adresa, program, rating, pret);
        this.areAmbulanta = areAmbulanta;
    }

    public PPA(PPA copie) 
    {
        super(copie);
        areAmbulanta = copie.areAmbulanta;
    }
    
    public double preturi(String servicii)
    {
         Map<String,Double> m =new HashMap<>();
         m.put("Cursuri",pret[0]);
         m.put("Prim Ajutor",pret[1]);
          return m.get(servicii);
    }
    
    public void serviciiDorite(String servicii, int nrCopii, int nrAdulti)
    {
     System.out.println("Ati ales serviciile de prim ajutor de la "+nume+" pentru serviciul de "+servicii);
      switch (servicii)
        {
            case "Cursuri":
                bill += nrCopii *pret[0] + nrAdulti * pret[0];
                break;
            case "Prim Ajutor":
                System.out.println("Serviciile de Prim Ajutor sunt gratuite.");
                bill=0;
             default:
                System.out.println("Nu avem aceaste servicii.");
        }
      System.out.println("Totalul de plata este a ajuns la valoarea de "+bill+" lei");
     
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nAre ambulanta: " + areAmbulanta;
    }
    
    
}