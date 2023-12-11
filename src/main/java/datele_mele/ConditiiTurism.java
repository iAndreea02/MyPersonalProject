package datele_mele;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ConditiiTurism {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
          
          DateCity.addVectori(); 
          ArrayList<Object> filtru = new ArrayList<Object>();
      
           for (int i = 0; i < 10; i++) {
    if (DateCity.vecCasaMemoriala.get(i).rating > 3.5f && DateCity.vecCasaMemoriala.get(i).program[0] > 12) {
        filtru.add(DateCity.vecCasaMemoriala.get(i));
    }
    
    if (DateCity.vecParcPublic.get(i).rating>3.5f && DateCity.vecParcPublic.get(i).nrToalete>0) {
        filtru.add(DateCity.vecParcPublic.get(i));
    }
    
    if (DateCity.vecMuzeu.get(i).rating>3.5f && "Istorie".equals(DateCity.vecMuzeu.get(i).tipul)) {
        filtru.add(DateCity.vecMuzeu.get(i));
/*
  if(DateCity.vecParcPublic.get(i).rating>3.5f && DateCity.vecParcPublic.get(i).nrToalete>0)
                   System.out.println(DateCity.vecParcPublic.get(i)+"\n\n");
  if(DateCity.vecMuzeu.get(i).rating>3.5f && "Istorie".equals(DateCity.vecMuzeu.get(i).tipul))
                   System.out.println(DateCity.vecMuzeu.get(i)+"\n\n");
  */             
    }
}
           System.out.println(filtru);
// Afișarea rezultatului fiind a 2-a metoda
               /* for (Object obiect : filtru) {
                    System.out.println(obiect);
}*/
               
               
           }
           
          
             
}
    


