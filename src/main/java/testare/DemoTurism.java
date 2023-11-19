package testare;



import java.util.ArrayList;
import java.util.Scanner;
import Hotel.Apartament;
import Mancare.Cafenele;
import Activitati.CasaMemoriala;
import Hotel.Hotel;
import Activitati.Muzeu;
import Activitati.ParcPublic;
import Mancare.Restaurant;

/**
 *
 * @author andre
 */
public class DemoTurism {

    public static void main(String[] args) {

         
   //-----Restaurant
   //Constructor fara parametri
   Restaurant a =new Restaurant();
   System.out.println(a);
   
   int[] program1={10,22};
   double[] pret1={48.5,15.99,20.99,25.99};
   //Constructor cu parametri efectivi
   Restaurant b =new Restaurant("Blue Aqua","pescaresc","str. regiment 11 siret", 4.5f,program1, 100,true,true,"ciorba de vacuta si friptura cu piure","ou cu bacon impreuna cu gemuri si branzeturi","ciorba de burta si icre de  peste","paste carbonara impreuna cu carne de vita la cuptor cu portocale","aperol spritz , rom,cola si apa minerala",false,false,pret1 );
   System.out.println(b);
   //Constructor de copiere
   Restaurant copy_res = new Restaurant (b);  
   System.out.println(copy_res);
   
   //-----Cafene 
    //Constructor fara parametri
   Cafenele c=new Cafenele();
        System.out.println(c);
        program1[0]=7;
        program1[1]=4;
        //Constructor cu parametri efectivi
        Cafenele d=new Cafenele("FRESH","str basarabiei nr. 56",4.8f,program1,false,"sandwich italian,sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,sandwich grecesc,sandwich caesar","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret1,true,true,true);
        System.out.println(d);
        //Constructor de copiere
        Cafenele copy_caf=new Cafenele();
        System.out.println(copy_caf);
        
        //------Parc Public 
          //Constructor fara parametri
        ParcPublic parc0 = new ParcPublic();
        //Constructor cu parametri efectivi
        ParcPublic parc1 = new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10);
       //Constructor de copiere
        ParcPublic parc_copy = new ParcPublic(parc1);
       
        //---Muzeu
          //Constructor fara parametri
        Muzeu muzeu0 = new Muzeu();
        System.out.println(muzeu0);
        //Constructor cu parametri efectivi
         Muzeu muzeu1 =new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", new int[]{10, 17}, 4.5f, new double[]{3.5, 10.4,10.5, 4.5, 6.7, 3.4}, "Stiinte ale naturii", 1930, 843);
         System.out.println(muzeu1);
         //Constructor de copiere
        Muzeu muzeu_copy = new Muzeu(muzeu1);
        System.out.println(muzeu_copy);
        //---Casa Memoriala
           //Constructor fara parametri
        CasaMemoriala casa0 = new CasaMemoriala();
        System.out.println(casa0);
        //Constructor cu parametri efectivi
        CasaMemoriala casa1 = new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19,}), 4.3f, (new double[]{3.5, 8.2, 4.7, 8.4}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE",true);
        System.out.println(casa1);
        //Constructor de copiere
        CasaMemoriala casa_copy = new CasaMemoriala(casa1);
        System.out.println(casa_copy);
        
       
       
       
       ///---------------------------Muzeu------------------------
       ArrayList<Muzeu> vecMuzeu = new ArrayList<Muzeu>();
        
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{10, 17}), 4.5f, (new double[]{3.5, 10.4,10.5, 4.5, 6.7, 3.4}), "Stiinte ale naturii", 1930, 843));
        vecMuzeu.add(new Muzeu("Muzeul de Arta Vizuala", "Str Dimitre", (new int[]{11, 19}), 4.4f, (new double[]{3.9, 6.2,15, 4.3, 4.7, 8.4}), "Arte", 1935, 436));
        vecMuzeu.add(new Muzeu("Muzeul de Istorie Paul Paltanea", "Str Fotea", (new int[]{9, 15}), 4.3f, (new double[]{6.4, 14,14, 7.5, 6.5, 2.4}), "Istorie", 1944, 216 ));
        vecMuzeu.add(new Muzeu("Muzeul de Istoriei,Culturii, Spiritualitatii Crestine  ", "Str Domneasca", (new int[]{8, 10}), 4.6f, (new double[]{0, 5.2,9.5, 4.5, 3.5, 3.4}), "Istorie", 1936, 804));
        vecMuzeu.add(new Muzeu("Muzeul Satului", "Sivita", (new int[]{12, 17}), 4.7f, (new double[]{3, 5,10.5, 6, 6.7, 3.9}), "Traditii si Obiceiuri", 1950, 964));
        vecMuzeu.add(new Muzeu("Muzeul de Istorie Teodor Cincu", "Tecuci", (new int[]{11, 18}), 4.4f, (new double[]{5, 7,10, 4.2, 7.3, 5.4}), "Istorie", 1949, 522));
        vecMuzeu.add(new Muzeu("Muzeul Casa Colectiei ", "Str Traian", (new int[]{10, 14}), 4.2f, (new double[]{0, 4,13.5, 6.5, 6.7, 6.4}), "Istorie", 1960, 1052));
        vecMuzeu.add(new Muzeu("Muzeul Zonei Pescaresti", "Tulucesti", (new int[]{12, 17}), 3.9f, (new double[]{9, 15,13.5, 6.5, 6.7, 6.4}), "Istorie", 1935, 634));
        vecMuzeu.add(new Muzeu("Muzeul Carol I", "Braila", (new int[]{14, 19}), 3.4f, (new double[]{3, 5,8.5, 5.5, 3.7, 5.4}), "Istorie", 1806, 326));
        vecMuzeu.add(new Muzeu("Muzeul de Etnografie", "Braila", (new int[]{12, 15}), 3.5f, (new double[]{2, 8,6.5, 5.5, 7.7, 4.4}), "Istorie", 1842, 764));

        
         ///---------------------------Case Memoriale------------------------
        ArrayList<CasaMemoriala> vecCasaMemoriala = new ArrayList<CasaMemoriala>();
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{11, 14}), 4.8f, (new double[]{3.6, 5.2, 3.7, 5.4}), "Casa", 1900, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Auschnitt", "Str Domneasca", (new int[]{12, 16}), 3.7f, (new double[]{3.5, 8.2, 3.7, 5.4}), "Casa", 1939, "Auschnitt", " Istoric reprezentativ pentru patrimoniul cultural local",false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Nicolae Mantu", "Str Alexandru Cuza", (new int[]{14, 19}), 3.9f, (new double[]{5.4, 10.2, 5.7, 3.4}), "Casa", 1954, "Nicolae Mantu", "Cenuşăreasa arhitecturii gălăţene",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Costache Negri", "Str Costache Negri", (new int[]{11, 18}), 4.5f, (new double[]{0, 5.2, 3.2, 6.4}), "Cetate", 1922, "Costache Negri", "Rememorează personalitatea celui care a participat intens la Revoluția de la 1848",false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Hortentia Papadat Bencescu", "Ivesti", (new int[]{12, 16}), 3.6f, (new double[]{2, 9, 5, 10}), "Casa", 1931, "Hortentia Papadat Bencescu", "Casa cu sfatii",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Bancotescu", "Braila", (new int[]{11, 17}), 3.3f, (new double[]{3.5, 8.2, 3.7, 5}), "Casa", 1939, "Bancotescu", "Sugerează secvenţe din viaţa cotidiană patriarhală trăită de oameni",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Rurala Ion Avram Dunarean", "Suhurlui", (new int[]{12, 15}), 5.0f, (new double[]{6.7,10.4, 3, 5.4}), "Casa", 1965, "Ion Avram Dunarean", "Ambient tradiţional ţărănesc",false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala D.P Perpessicius", "Braila", (new int[]{8, 14}), 4.5f, (new double[]{8.4,13.5, 16, 5.4}), "Conac", 1901, "D.P Perpessicius", "Personalități ale spiritualității brăilene",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Tudor Pamfile", "Tecuci", (new int[]{10, 15}), 4.0f, (new double[]{3.8,7.5, 3.2, 7.4}), "Cetate", 1921, "Tudor Pamfile", "TRAISTA CU TRADIŢII",true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Calistrat Hogas", "Tecuci", (new int[]{11, 17}), 4.7f, (new double[]{3.5,10, 3.7, 5.4}), "Conac", 1917, "Calistrat Hogas", "Impresionează prin simplitatea şi frumuseţea rustică caracteristică acestei zone de munte",false));
        
         ///---------------------------Parc Public------------------------
        ArrayList<ParcPublic> vecParcPublic = new ArrayList<ParcPublic>();
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{12, 18}), 4.1f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 11));
        vecParcPublic.add(new ParcPublic("Gradina Botanica", "Strada Regiment 11 Siret", (new int[]{10, 22}), 4.0f, (new double[]{8.5, 10.5}), 988.0, 9, 7, 9));
        vecParcPublic.add(new ParcPublic("Parc Mihai Eminescu", "Strada Iacob Lahovari 1", (new int[]{10, 19}), 3.5f, (new double[]{8.5, 10.5}), 988.0, 6, 7, 15));
        vecParcPublic.add(new ParcPublic("Parcul Carol 1", "Strada Prutului", (new int[]{10, 20}), 4.8f, (new double[]{8.5, 10.5}), 988.0, 4, 7, 20));
        vecParcPublic.add(new ParcPublic("Parcul Closca ", "Tiglina 1", (new int[]{10, 16}), 4.6f, (new double[]{8.5, 10.5}), 988.0, 8, 7, 17));
        vecParcPublic.add(new ParcPublic("Parcul Rizer", "Strada Traian", (new int[]{10, 19}), 2.4f, (new double[]{8.5, 10.5}), 988.0, 4, 7, 10));
        vecParcPublic.add(new ParcPublic("Parcul Libertatii", "Bulevardul Basarabiei", (new int[]{11, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 0, 9, 20));
        vecParcPublic.add(new ParcPublic("Parcul Viva", "Faleza", (new int[]{12, 19}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 2, 9, 30));
        vecParcPublic.add(new ParcPublic("Parcul Potcoava de Aur", "Strada Braile", (new int[]{10, 22}), 3.5f, (new double[]{8.5, 10.5}), 988.0, 1, 4, 20));
        vecParcPublic.add(new ParcPublic("Parcul cu Fantani", "Strada Siderugistilor", (new int[]{11, 19}), 3.5f, (new double[]{8.5, 10.5}), 988.0, 0, 8, 12));
        
      
       ///---------------------------Hotel------------------------
        Hotel h =new Hotel();
        System.out.println(h);
        ArrayList<Hotel> vectorHotel= new ArrayList<Hotel>();
        vectorHotel.add(new Hotel("Steluta",4.5f,( new double[] {450.50}),"Bd Crizantemelor, Nr.15",new int[] {10,22},30, true, false, false,true,true)) ;
        vectorHotel.add( new Hotel("VEGA",3.2f, ( new double[] {545.50}),"Str. Sperantei, Nr.70",new int[] {9,22},45, true, true, true,true,false));
        vectorHotel.add(new Hotel("MERCUR",5.0f,( new double[] {850.60}),"Str.Domneasca, nr 1",new int[] {8,20},20, false, false, true,true,true));
        vectorHotel.add(new Hotel("Resort Dunarea",4.2f, ( new double[] {650.55}),"Bld Traian Vuia",new int[] {6,22},80, true, true, true,true,false)); 
        vectorHotel.add(new Hotel("Danubius",3.2f,( new double[] {677.50}),"Str Basarabiei, Nr.15",new int[] {10,22},30, true, false, false,true,true)) ;
        vectorHotel.add( new Hotel("Angel",3.2f, ( new double[] {574.50}),"Str. Cluj, Nr.75",new int[] {9,22},45, true, true, true,true,false));
        vectorHotel.add(new Hotel("NEXUS",5.0f,( new double[] {690.60}),"Str.Regiment Siret, nr 74",new int[] {8,23},110, false, false, true,true,true));
        vectorHotel.add(new Hotel("SATURN",2.2f, ( new double[] {238.55}),"Bld Calugareni, nr 43",new int[] {6,22},80, true, true, true,true,false)); 
        vectorHotel.add(new Hotel("Galmond",3.89f, ( new double[] {350.57}),"Bld. Mihai Eminescu, Nr 45",new int[] {10,22},90, true, false, true,true,false)) ;
        vectorHotel.add(new Hotel("Ibis",3.4f, ( new double[] {363.57}),"Bld. Vlad Tepes, Nr 377",new int[] {10,22},100, true, false, true,true,false)) ;
       
        
         ///---------------------------Apartament------------------------
        Apartament A =new Apartament();
        System.out.println(A);
        ArrayList<Apartament> vectorApartament= new ArrayList<Apartament>();
        vectorApartament.add(new Apartament("ApartHotel", 3.22f,( new double[] {450.50}),"Str. Brailei , Nr.120",new int[] {10,22},"dublu",4,2,23,5,true,true,true));
        vectorApartament.add(new Apartament("Belvedere", 4.32f,( new double[] {670.50}),"Str. Henri Coanda, Nr.13",new int[] {11,22},"triplu",5,3,53,6,false,true,true));
        vectorApartament.add(new Apartament("FRUMI", 3.22f,( new double[] {783.59}),"Bld. Mihail Petrini, Nr 33",new int[] {8,20},"dublu",4,2,66,2,true,true,false));
        vectorApartament.add(new Apartament("POO", 5.00f,( new double[] {120.50}),"Str. Otelarilor, nr 47",new int[] {11,23},"King",5,3,45,4,false,true,false));
        vectorApartament.add(new Apartament("Angeli", 4.42f,( new double[] {320.50}),"Str. George Cosbuc , Nr.43",new int[] {10,22},"dublu",4,2,20,1,true,true,true));
        vectorApartament.add(new Apartament("Paul", 3.32f,( new double[] {330.55}),"Str. Frunzei, Nr.42",new int[] {10,23},"triplu",5,3,35,6,false,true,true));
        vectorApartament.add(new Apartament("Alina", 3.33f,( new double[] {433.49}),"Bld. Basarabiei, Nr 34",new int[] {8,24},"dublu",4,2,10,1,true,true,false));
        vectorApartament.add(new Apartament("Apartamentul lu' Sesam", 2.5f,( new double[] {222.55}),"Str. Mihai Bravo, nr 47",new int[] {11,23},"King",5,3,55,4,false,true,false));
        vectorApartament.add(new Apartament("Apartamentul 21", 3.22f,( new double[] {993.59}),"Bld. Ciprian Porumbescu, Nr 30",new int[] {11,20},"dublu",4,2,8,1,true,true,false));
        vectorApartament.add(new Apartament("Novac", 1.4f,( new double[] {321.93}),"Str. Siderurgistilor, nr 47",new int[] {7,23},"King",5,3,34,2,false,true,false));
        Scanner in =new Scanner(System.in);
        
        
        
        System.out.println("Bine ati venit in Galati! \n");
        boolean i=false ;
        while(i!=true){
        System.out.println("Despre ce vreti sa aflati?" );
        String raspuns = in.next();
        switch(raspuns){
        case("Hotel"):
          System.out.println(vectorHotel);  
          break;
          case("Apartament"):
              System.out.println(vectorApartament);
                break;
          case("Restaurant"):
              System.out.println();
              break;
          case ("Cafenea"):
              System.out.println();
              break;
           case("Spital"):
               System.out.println();
              break;
              case("Clinica"):
               System.out.println();
              break;
              case("Prim Ajutor"):
               System.out.println();
              break;
              case("Muzeu"):
              System.out.println(vecMuzeu);
              break;
              case("Parc Public"):
              System.out.println(vecParcPublic);
              break;
              case("Casa memoriala"):
               System.out.println(vecCasaMemoriala);    
              break;
              case("Exit"):
                i=false;
                break;
              default:
                  System.out.println("Nu am gasit");
        }
        }
        System.out.println("Ne mai vedem!:)");
        
        
        
         
        //
        //
        //


//ArrayList<ParcPublic> vecGasit=new ArrayList<ParcPublic>();
//       Scanner in = new Scanner (System.in);
//       System.out.println("De unde sa inceapa rating-ul"); 
//       double rating = in.nextDouble();
//      for (ParcPublic i :vecParcPublic){
//          if (i.rating>rating)
//          {    vecGasit.add(i);
//              
//           }
//      }
//       System.out.print(vecGasit);
        
    }

}
