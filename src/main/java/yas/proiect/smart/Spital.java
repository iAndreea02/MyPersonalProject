package yas.proiect.smart;
import java.util.HashMap;
import java.util.Map;

public class Spital extends Turism{
    public String tipServiciu;
    public String domeniu;
   
    public Spital() 
    {
        super();
        tipServiciu=" ";
        domeniu=" ";
    }

    public Spital(String tipServiciu, String domeniu, String nume, String adresa, int[] program, float rating, double[] pret)
    {
        super(nume, adresa, program, rating, pret);
        this.tipServiciu=tipServiciu;
    }

    public Spital(Spital copie)
    {
        super(copie);
        tipServiciu=copie.tipServiciu;
    }
    
    public double preturi(String tipServiciu)
    {
    Map<String,Double> m =new HashMap<>();
    m.put("Neurologie",pret[0]);
    m.put("Oftamologie",pret[1]);
    m.put("Chirurgie",pret[2]);
    m.put("ORL",pret[3]);
    m.put("Boli Infectioase",pret[4]);
    m.put("Radiologie",pret[5]);
    m.put("Stomatologie",pret[6]);
    m.put("Pediatrie",pret[7]);
    m.put("Cardiologie",pret[8]);
        return m.get(tipServiciu);
    }
    
    public void serviciiDorite(int nrCopii, int nrAdulti, String trimitereMedicala) throws Exception
    {
        System.out.println("Ati ales serviciile sanitare la: " +nume+" serviciul "+tipServiciu);
        
        if(nrCopii!=0)
        {
            switch (tipServiciu)
            {
                case "Neurologie" -> bill += pret[0];
                case "Oftamologie" -> bill += pret[1];
                case "Chirurgie" -> bill += pret[2];
                case "ORL" -> bill += pret[3];
                case "Boli Infectioase" -> bill += pret[4];
                case "Radiologie" -> bill += pret[5];
                case "Stomatologie" -> bill += pret[6];
                case "Pediatrie" -> bill += pret[7];
                case "Cardiologie" -> bill += pret[8];
                default -> System.out.println("Nu avem aceasta specialitate.");
            }
            bill-=50;
        }
        if(nrAdulti!=0)
        { 
            switch (tipServiciu)
            {
                case "Neurologie" -> bill += pret[0];
                case "Oftamologie" -> bill += pret[1];
                case "Chirurgie" -> bill += pret[2];
                case "ORL" -> bill += pret[3];
                case "Boli Infectioase" -> bill += pret[4];
                case "Radiologie" -> bill += pret[5];
                case "Stomatologie" -> bill += pret[6];
                case "Pediatrie" -> bill += pret[7];
                case "Cardiologie" -> bill += pret[8];
                default -> System.out.println("Nu avem aceasta specialitate.");
            }
        }
        
  
        if(nrCopii<=0 && nrAdulti<=0)
         {
            throw new Exception("Nu ati introdus corect numarul de persoane");
          }
        else if(nrCopii!=0 && nrAdulti<=0)
            {
            throw new Exception("Nu uitati: Copiii nu pot fi lasati singuri!");
             }
        
        
        if("Da".equals(trimitereMedicala))
        {
            bill=0.0;
            System.out.println("Srviciile din cadrul spitalelor sunt gratuite, pe baza trimiterii de la medicul de familie!");
        }
        else if("Nu".equals(trimitereMedicala))
                {
                    System.out.println("Plata servicilor este de "+bill+" lei.");
                }
        
    }
    
    
    @Override
        public String toString()
    {
        return super.toString() + "\nTip serviciu: " + tipServiciu;
    }
    
}
