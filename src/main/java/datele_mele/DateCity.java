/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datele_mele;

import Activitati.CasaMemoriala;
import Activitati.Muzeu;
import Activitati.ParcPublic;
import Hotel.Apartament;
import Hotel.Hotel;
import Mancare.Cafenele;
import Mancare.Restaurant;
import java.util.ArrayList;
import yas.proiect.smart.Clinica;
import yas.proiect.smart.PPA;
import yas.proiect.smart.Spital;

/**
 *
 * @author andre
 */
public class DateCity {
    ///---------------------------Muzeu------------------------

    public static ArrayList<Muzeu> vecMuzeu = new ArrayList<Muzeu>();
    public static ArrayList<CasaMemoriala> vecCasaMemoriala = new ArrayList<CasaMemoriala>();
    public static ArrayList<Hotel> vectorHotel = new ArrayList<Hotel>();
    public static ArrayList<ParcPublic> vecParcPublic = new ArrayList<ParcPublic>();
    public static ArrayList<Apartament> vectorApartament = new ArrayList<Apartament>();
    public static ArrayList<Spital> vecSpital = new ArrayList<Spital>();
    public static ArrayList<Clinica> vecClinica = new ArrayList<Clinica>();
    public static ArrayList<PPA> vecPPA = new ArrayList<PPA>();
    public static ArrayList<Restaurant> vecRestaurant = new ArrayList<Restaurant>();
    public static ArrayList<Cafenele> vecCafenele = new ArrayList<Cafenele>();

    static public void addVectori() {
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{9, 17}), 4.5f, (new double[]{3.5, 10.4, 10.5, 4.5, 6.7, 3.4}), "Stiinte ale naturii", 1930, 843));
        vecMuzeu.add(new Muzeu("Muzeul de Arta Vizuala", "Str Dimitre", (new int[]{11, 19}), 4.4f, (new double[]{3.9, 6.2, 15, 4.3, 4.7, 8.4}), "Arte", 1935, 436));
        vecMuzeu.add(new Muzeu("Muzeul de Stiintei", "Str Fotea", (new int[]{9, 15}), 4.3f, (new double[]{6.4, 14, 14, 7.5, 6.5, 2.4}), "Stiinte ale naturii", 1944, 216));
        vecMuzeu.add(new Muzeu("Muzeul de Istoriei,Culturii, Spiritualitatii Crestine  ", "Str Domneasca", (new int[]{8, 10}), 4.6f, (new double[]{0, 5.2, 9.5, 4.5, 3.5, 3.4}), "Istorie", 1936, 804));
        vecMuzeu.add(new Muzeu("Muzeul Satului", "Sivita", (new int[]{12, 17}), 4.7f, (new double[]{3, 5, 10.5, 6, 6.7, 3.9}), "Traditii si Obiceiuri", 1950, 964));
        vecMuzeu.add(new Muzeu("Muzeul de Istorie Teodor Cincu", "Tecuci", (new int[]{11, 18}), 4.4f, (new double[]{5, 7, 10, 4.2, 7.3, 5.4}), "Istorie", 1949, 522));
        vecMuzeu.add(new Muzeu("Muzeul Casa Colectiei ", "Str Traian", (new int[]{10, 14}), 4.2f, (new double[]{0, 4, 13.5, 6.5, 6.7, 6.4}), "Arte", 1960, 1052));
        vecMuzeu.add(new Muzeu("Muzeul Zonei Pescaresti", "Tulucesti", (new int[]{12, 17}), 3.9f, (new double[]{9, 15, 13.5, 6.5, 6.7, 6.4}), "Traditii si Obiceiuri", 1935, 634));
        vecMuzeu.add(new Muzeu("Muzeul Carol I", "Braila", (new int[]{14, 19}), 3.4f, (new double[]{3, 5, 8.5, 5.5, 3.7, 5.4}), "Istorie", 1806, 326));
        vecMuzeu.add(new Muzeu("Muzeul de Etnografie", "Braila", (new int[]{12, 15}), 3.5f, (new double[]{2, 8, 6.5, 5.5, 7.7, 4.4}), "Istorie", 1842, 764));

        ///---------------------------Case Memoriale------------------------
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{11, 14}), 4.8f, (new double[]{3.6, 5.2, 3.7, 5.4}), "Casa", 1900, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Auschnitt", "Str Domneasca", (new int[]{12, 16}), 3.7f, (new double[]{3.5, 8.2, 3.7, 5.4}), "Casa", 1939, "Auschnitt", " Istoric reprezentativ pentru patrimoniul cultural local", false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Nicolae Mantu", "Str Alexandru Cuza", (new int[]{14, 19}), 3.9f, (new double[]{5.4, 10.2, 5.7, 3.4}), "Casa", 1954, "Nicolae Mantu", "Cenuşăreasa arhitecturii gălăţene", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Costache Negri", "Str Costache Negri", (new int[]{11, 18}), 4.5f, (new double[]{0, 5.2, 3.2, 6.4}), "Cetate", 1922, "Costache Negri", "Rememorează personalitatea celui care a participat intens la Revoluția de la 1848", false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Hortentia Papadat Bencescu", "Ivesti", (new int[]{12, 16}), 3.6f, (new double[]{2, 9, 5, 10}), "Casa", 1931, "Hortentia Papadat Bencescu", "Casa cu sfatii", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Bancotescu", "Braila", (new int[]{11, 17}), 3.3f, (new double[]{3.5, 8.2, 3.7, 5}), "Casa", 1939, "Bancotescu", "Sugerează secvenţe din viaţa cotidiană patriarhală trăită de oameni", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Rurala Ion Avram Dunarean", "Suhurlui", (new int[]{12, 15}), 5.0f, (new double[]{6.7, 10.4, 3, 5.4}), "Casa", 1965, "Ion Avram Dunarean", "Ambient tradiţional ţărănesc", false));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala D.P Perpessicius", "Braila", (new int[]{8, 14}), 4.5f, (new double[]{8.4, 13.5, 16, 5.4}), "Conac", 1901, "D.P Perpessicius", "Personalități ale spiritualității brăilene", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Tudor Pamfile", "Tecuci", (new int[]{10, 15}), 4.0f, (new double[]{3.8, 7.5, 3.2, 7.4}), "Cetate", 1921, "Tudor Pamfile", "TRAISTA CU TRADIŢII", true));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Memoriala Calistrat Hogas", "Tecuci", (new int[]{11, 17}), 4.7f, (new double[]{3.5, 10, 3.7, 5.4}), "Conac", 1917, "Calistrat Hogas", "Impresionează prin simplitatea şi frumuseţea rustică caracteristică acestei zone de munte", false));

        ///---------------------------Parc Public------------------------
      
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{12, 18}), 4.1f, (new double[]{3.5,11.3,8.5, 10.5}), 988.0, 0, 7, 11,10));
        vecParcPublic.add(new ParcPublic("Gradina Botanica", "Strada Regiment 11 Siret", (new int[]{10, 22}), 4.0f, (new double[]{11.3,8.0,8.5, 10.5}), 988.0, 9, 7, 9,26));
        vecParcPublic.add(new ParcPublic("Parc Mihai Eminescu", "Strada Iacob Lahovari 1", (new int[]{10, 19}), 3.5f, (new double[]{8.4,13.5, 16, 5.4}), 988.0, 6, 7, 15,50));
        vecParcPublic.add(new ParcPublic("Parcul Carol 1", "Strada Prutului", (new int[]{10, 20}), 4.8f, (new double[]{3.5,10, 3.7, 5.4}), 988.0, 4, 7, 20,60));
        vecParcPublic.add(new ParcPublic("Parcul Closca ", "Tiglina 1", (new int[]{10, 16}), 4.6f, (new double[]{2, 9, 5, 10}), 988.0, 8, 7, 17,10));
        vecParcPublic.add(new ParcPublic("Parcul Rizer", "Strada Traian", (new int[]{10, 19}), 2.4f, (new double[]{3.5, 8.2, 3.7, 5.4}), 988.0, 0, 7, 10,0));
        vecParcPublic.add(new ParcPublic("Parcul Libertatii", "Bulevardul Basarabiei", (new int[]{11, 18}), 4.5f, (new double[]{0, 5.2, 3.2, 6.4}), 988.0, 0, 9, 20,80));
        vecParcPublic.add(new ParcPublic("Parcul Viva", "Faleza", (new int[]{12, 19}), 4.5f, (new double[]{0, 4,13.5, 6.5}), 988.0, 2, 9, 30,60));
        vecParcPublic.add(new ParcPublic("Parcul Potcoava de Aur", "Strada Braile", (new int[]{10, 22}), 3.5f, (new double[]{0, 5.2, 7.2, 10.4}), 988.0, 1, 4, 20,50));
        vecParcPublic.add(new ParcPublic("Parcul cu Fantani", "Strada Siderugistilor", (new int[]{11, 19}), 3.5f, (new double[]{0, 5.2, 3.2, 5.4}), 988.0, 0, 8, 12,45));

        ///---------------------------Hotel------------------------
        vectorHotel.add(new Hotel("Steluta", 4.5f, (new double[]{450.50}), "Bd Crizantemelor, Nr.15", new int[]{10, 22}, 30, true, false, false, true, true));
        vectorHotel.add(new Hotel("VEGA", 3.2f, (new double[]{545.50}), "Str. Sperantei, Nr.70", new int[]{9, 22}, 45, true, true, true, true, false));
        vectorHotel.add(new Hotel("MERCUR", 5.0f, (new double[]{850.60}), "Str.Domneasca, nr 1", new int[]{8, 20}, 20, false, false, true, true, true));
        vectorHotel.add(new Hotel("Resort Dunarea", 4.2f, (new double[]{650.55}), "Bld Traian Vuia", new int[]{6, 22}, 80, true, true, true, true, false));
        vectorHotel.add(new Hotel("Danubius", 3.2f, (new double[]{677.50}), "Str Basarabiei, Nr.15", new int[]{10, 22}, 30, true, false, false, true, true));
        vectorHotel.add(new Hotel("Angel", 3.2f, (new double[]{574.50}), "Str. Cluj, Nr.75", new int[]{9, 22}, 45, true, true, true, true, false));
        vectorHotel.add(new Hotel("NEXUS", 5.0f, (new double[]{690.60}), "Str.Regiment Siret, nr 74", new int[]{8, 23}, 110, false, false, true, true, true));
        vectorHotel.add(new Hotel("SATURN", 2.2f, (new double[]{238.55}), "Bld Calugareni, nr 43", new int[]{6, 22}, 80, true, true, true, true, false));
        vectorHotel.add(new Hotel("Galmond", 3.89f, (new double[]{350.57}), "Bld. Mihai Eminescu, Nr 45", new int[]{10, 22}, 90, true, false, true, true, false));
        vectorHotel.add(new Hotel("Ibis", 3.4f, (new double[]{363.57}), "Bld. Vlad Tepes, Nr 377", new int[]{10, 22}, 100, true, false, true, true, false));

        ///---------------------------Apartament------------------------
        vectorApartament.add(new Apartament("ApartHotel", 3.22f, (new double[]{450.50}), "Str. Brailei , Nr.120", new int[]{10, 22}, "dublu", 4, 2, 23, 5, true, true, true));
        vectorApartament.add(new Apartament("Belvedere", 4.32f, (new double[]{670.50}), "Str. Henri Coanda, Nr.13", new int[]{11, 22}, "triplu", 5, 3, 53, 6, false, true, true));
        vectorApartament.add(new Apartament("FRUMI", 3.22f, (new double[]{783.59}), "Bld. Mihail Petrini, Nr 33", new int[]{8, 20}, "dublu", 4, 2, 66, 2, true, true, false));
        vectorApartament.add(new Apartament("POO", 5.00f, (new double[]{120.50}), "Str. Otelarilor, nr 47", new int[]{11, 23}, "King", 5, 3, 45, 4, false, true, false));
        vectorApartament.add(new Apartament("Angeli", 4.42f, (new double[]{320.50}), "Str. George Cosbuc , Nr.43", new int[]{10, 22}, "dublu", 4, 2, 20, 1, true, true, true));
        vectorApartament.add(new Apartament("Paul", 3.32f, (new double[]{330.55}), "Str. Frunzei, Nr.42", new int[]{10, 23}, "triplu", 5, 3, 35, 6, false, true, true));
        vectorApartament.add(new Apartament("Alina", 3.33f, (new double[]{433.49}), "Bld. Basarabiei, Nr 34", new int[]{8, 24}, "dublu", 4, 2, 10, 1, true, true, false));
        vectorApartament.add(new Apartament("Apartamentul lu' Sesam", 2.5f, (new double[]{222.55}), "Str. Mihai Bravo, nr 47", new int[]{11, 23}, "King", 5, 3, 55, 4, false, true, false));
        vectorApartament.add(new Apartament("Apartamentul 21", 3.22f, (new double[]{993.59}), "Bld. Ciprian Porumbescu, Nr 30", new int[]{11, 20}, "dublu", 4, 2, 8, 1, true, true, false));
        vectorApartament.add(new Apartament("Novac", 1.4f, (new double[]{321.93}), "Str. Siderurgistilor, nr 47", new int[]{7, 23}, "King", 5, 3, 34, 2, false, true, false));

        ///---------------------------Spital------------------------
        vecSpital.add(new Spital("Spitalul Militar", "Strada Traian 199", new int[]{0, 24}, 3.7f, new double[]{110, 155, 205, 60, 0, 165, 87, 110, 160}, "Stat", new String[]{"Neurologie", "Oftamologie", "Chirurgie", "ORL", "Radiologie", "Psihiatrie", "Pediatrie", "Cardiologie"}));
        vecSpital.add(new Spital("Spitalul CFR", "Strada Alexandru Moruzzi 6", new int[]{0, 24}, 3.8f, new double[]{110, 155, 205, 60, 0, 0, 0, 110, 160}, "Stat", new String[]{"Neurologie", "Oftamologie", "Chirurgie", "ORL", "Pediatrie", "Cardiologie"}));
        vecSpital.add(new Spital("Spitalul de Boli Infectioase", "Strada Traian 393", new int[]{0, 24}, 3.7f, new double[]{0, 0, 250, 0, 150, 0, 0, 0, 0}, "Stat", new String[]{"Boli Infectioase", "Chirurgie"}));
        vecSpital.add(new Spital("Spitalul de Urgenta pentru Copii", "Strada Gheorghe Asachi 2", new int[]{0, 24}, 3.3f, new double[]{100, 110, 210, 85, 0, 140, 90, 110, 160}, "Stat", new String[]{"Neurologie", "Oftamologie", "Chirurgie", "ORL", "Radiologie", "Psihiatrie", "Pediatrie", "Cardiologie"}));
        vecSpital.add(new Spital("Spitalul de Pneumoftiziologie", "Strada Radu Negru", new int[]{0, 24}, 4.4f, new double[]{0, 0, 100, 0, 0, 185, 70, 0, 0}, "Stat", new String[]{"Chirurgie", "Radiologie", "Psihiatrie"}));
        vecSpital.add(new Spital("Spitalul de Psihiatrie", "Strada Traian 290", new int[]{0, 24}, 2.9f, new double[]{0, 0, 0, 0, 0, 0, 165, 0, 0}, "Stat", new String[]{"Psihiatrie"}));
        vecSpital.add(new Spital("Medicus Center", "Strada Traian 120", new int[]{9, 15}, 3.1f, new double[]{110, 155, 0, 60, 0, 165, 87, 0, 0}, "Privat", new String[]{"Neurologie", "Oftamologie", "ORL", "Radiologie", "Psihiatrie"}));
        vecSpital.add(new Spital("MedCity", "Strada Brăilei nr. 156", new int[]{9, 16}, 4.7f, new double[]{0, 155, 0, 65, 0, 0, 97, 115, 180}, "Privat", new String[]{"Oftamologie", "ORL", "Psihiatrie", "Pediatrie", "Cardiologie"}));
        vecSpital.add(new Spital("LAUNER", "Bulevardul George Coșbuc 410", new int[]{10, 15}, 2.7f, new double[]{115, 255, 0, 200, 0, 0, 0, 160, 195}, "Privat", new String[]{"Neurologie", "Oftamologie", "ORL", "Pediatrie", "Cardiologie"}));

        ///---------------------------Clinica------------------------
        vecClinica.add(new Clinica("Clinica Sanavita", "Strada Grădina Veche NR 90", new int[]{9, 19}, 3.1f, new double[]{125, 80, 145, 210, 75, 165}, new String[]{"Oftamologie", "ORL", "Radiologie", "Nutritionist", "Pediatrie", "Psihiatrie"}));
        vecClinica.add(new Clinica("Clinica Medicover", "Strada Domnească 66", new int[]{8, 20}, 2.8f, new double[]{200, 0, 0, 215, 80, 0}, new String[]{"Oftamologie", "Nutritionist", "Pediatrie"}));
        vecClinica.add(new Clinica("Epert Med Centrul Medical Irina", "Strada Crinului 24", new int[]{9, 20}, 2.7f, new double[]{125, 75, 125, 175, 0, 0}, new String[]{"Oftamologie", "ORL", "Radiologie", "Nutritionist"}));
        vecClinica.add(new Clinica("Aves Medicom - Clinica Medicala", "Strada Ion Luca Caragiale 13", new int[]{7, 15}, 4.0f, new double[]{120, 95, 155, 210, 75, 165}, new String[]{"Oftamologie", "ORL", "Radiologie", "Nutritionist", "Pediatrie", "Psihiatrie"}));
        vecClinica.add(new Clinica("Terra Clinique", " Strada Brăilei", new int[]{7, 14}, 4.6f, new double[]{0, 95, 155, 0, 75, 0}, new String[]{"ORL", "Radiologie", "Pediatrie"}));
        vecClinica.add(new Clinica("Laurus Medical ", " Strada Cristofor Columb 100", new int[]{8, 16}, 4.6f, new double[]{110, 0, 155, 250, 0, 0}, new String[]{"Oftamologie", "Radiologie", "Nutritionist"}));
        vecClinica.add(new Clinica("CENTRUL MEDICAL MAYCOR", " Aleea Domnească", new int[]{8, 15}, 4.3f, new double[]{0, 75, 90, 0, 85, 125}, new String[]{"ORL", "Radiologie", "Pediatrie", "Psihiatrie"}));
        vecClinica.add(new Clinica("DC Clinic", "Strada Română 208", new int[]{9, 15}, 4.7f, new double[]{160, 195, 185, 230, 95, 265}, new String[]{"Oftamologie", "ORL", "Radiologie", "Nutritionist", "Pediatrie", "Psihiatrie"}));
        vecClinica.add(new Clinica("MEDIMAGE", "Strada Anul Revoluției 1848 50", new int[]{9, 15}, 3.0f, new double[]{0, 0, 155, 210, 75, 0}, new String[]{"Radiologie", "Nutritionist", "Pediatrie"}));
        ///---------------------------Prim Ajutor------------------------

        vecPPA.add(new PPA("SRAU", "Drumul de Centură 39", new int[]{0, 24}, 5.0f, new double[]{75, 0}, true, new String[]{"Cursuri", "Prim Ajutor"}));
        vecPPA.add(new PPA("Asociatia Pentru Ajutor Umanitar - AJUT", "Strada Dunarea 18", new int[]{7, 20}, 3.0f, new double[]{55, 0}, false, new String[]{"Cursuri", "Prim Ajutor"}));
        vecPPA.add(new PPA("Societatea Studenților Mediciniști Galați (SSMG)", "Str. Gării, nr. 59-61, Cămin IB - parter", new int[]{7, 20}, 4.8f, new double[]{0, 0}, false, new String[]{"Prim Ajutor"}));
        vecPPA.add(new PPA("Crucea Roşie Galaţi ", "Strada Closca 13", new int[]{0, 24}, 4.8f, new double[]{130, 0}, true, new String[]{"Cursuri"}));
        vecPPA.add(new PPA("Ajutor, nu mai pot", "Bulevardul Vise Frante", new int[]{0, 24}, 5.0f, new double[]{0, 0}, true, new String[]{"Prim Ajutor"}));
        vecPPA.add(new PPA("Prim Ajutor in Caz de Urgente", "Aleea Domneasca", new int[]{9, 21}, 3.0f, new double[]{0, 0}, false, new String[]{"Cursuri"}));
        vecPPA.add(new PPA("Prima Rugaciune", "Strada Brailei", new int[]{5, 24}, 3.8f, new double[]{40, 0}, false, new String[]{"Cursuri"}));
        vecPPA.add(new PPA("Ajutor, CHIAR nu mai pot", "Drumul Ultimei Sperante", new int[]{0, 24}, 4.0f, new double[]{80, 0}, true, new String[]{"Cursuri", "Prim Ajutor"}));
        vecPPA.add(new PPA("Aia e Strict Problema ta", "Drumul de Centură 42", new int[]{0, 24}, 2.0f, new double[]{15, 5}, false, new String[]{"Cursuri", "Prim Ajutor"}));

        ///---------------------------Restaurant------------------------
        vecRestaurant.add(new Restaurant("The Folly", "restaurant & lounge", "Bloc L1, Strada Domnească 13, Galați 800015", 4.1f, new int[]{9, 20}, 80, true, true, "degetele de pui cu cartofi prajiti si sos de usturoi ", "mic dejun fitness", "risotto cu creveti si dovlecei", "Piept de pui cu sos gorgonzola", "Cocktail Green Apple,Jagermeister,Bubble tea,Caramel Frappe,Kozel Dark (Draught)", true, true, new double[]{99.99, 67.45, 67.89, 90.0}));
        vecRestaurant.add(new Restaurant("MALU", "restaurant & lounge & bar", " Strada Domnească 13, Galați 800015", 4.3f, new int[]{10, 18}, 128, true, true, "Tigaie cu fășii de vită, brocoli, cartofi dulci, alune sărate", "avocado toast", "Piept de rață cu reducție de fructe", "Somon exotic la cuptor", "Cocktail Sex on the beach,Vodka,mint tea,chocolate  Frappe,Peroni Nastro Azzurro - Draught", false, true, new double[]{56.7, 45.9, 50.0, 23.99}));
        vecRestaurant.add(new Restaurant("Acquarello ", "restaurant ", " Strada Nicolae Bălcescu 25, Galați 800017", 4.5f, new int[]{11, 19}, 90, true, true, "Turnedo Rossini", "Salmone Afumicato", "Filetto alla pizzaiolo", "Tagliattelle con gamberi", "Cocktail Hugo,Ursus Retro,Peach Tea,Cosmopolitan,Apa Aqua Carpatica plata,Red Bull,Pepsi,Peroni Nastro Azzurro - Draught", false, true, new double[]{52.7, 87.9, 56.0, 18.99}));
        vecRestaurant.add(new Restaurant("CRAFT Rebel Food ", "restaurant ", " lângă CEC Bank, Complex Potcoava de Aur, Galați 800070", 4.5f, new int[]{9, 20}, 80, true, false, " meniu cu pui tempura", "Tigaie taraneasca(mic dejun)", "ciorba de burta", "muschiulet de porc in sos de piper verde", "Cocktail Italian Gipsy,strawberry tea,Caffe Latte Viennese,Apa  perrier plata,Rockstar,Fanta,Corona", false, true, new double[]{36.7, 45.9, 57.6, 73.99}));
        vecRestaurant.add(new Restaurant("Union Jack ", "restaurant & pub ", " Strada Roșiori 1, Galați 800066", 4.5f, new int[]{12, 17}, 100, true, false, " Cotlet de porc la cuptor cu piure și salata de varza, Sote de mazăre  cu piept de pui și castraveți murati ", "U.J. Energy Bomb Breakfast", "Kettle Fried Coquelet de Bretagne", "Union Jack Skillet", "Cocktail Cranberry Prosecco,Mojito,Long Island Iced Tea,Apa Minerala / Sparkling Water,Pepsi Max,Sprite,Peroni", false, false, new double[]{34.7, 89.9, 55.0, 34.9}));
        vecRestaurant.add(new Restaurant("Amadeus", "restaurant  ", " Strada Brăilei 157, Galați 800402", 4.5f, new int[]{11, 21}, 60, true, true, "Aripioare picante la grill cu dulceata de ardei iuti si cartofi pai ", "Omletă cu verdeață", "Ciorbă de vită, ardei iute, smântână", "Salmone Zingarella", "Margarita,Frappe cu inghetata / Iced coffee with ice-cream,Evervess,Espresso Dublu / Double Espresso,Apa Minerala / Sparkling Water,Limonada cu ghimbir / Lemonade with ginger,Coca Cola,apa plata izvorul muntelui,Hoegaarden", true, true, new double[]{55.0, 77.9, 34.9, 35.8}));
        vecRestaurant.add(new Restaurant("STAGE - Nice Dining", "restaurant  ", " Strada General Alexandru Cernat 79, Galați 800105", 4.9f, new int[]{14, 20}, 110, false, true, "MUSCHI DE VITA PE PIATRA INCINSA", "Bon Ton", "VALDOSTANA DE CURCAN", "MUSCHI DE VITA IN CRUSTA DE IERBURI PROVENSALE", "Cuba Libre,Cappuccino,Apa Plata / Still Water,Prigat,Fresh Grapefruit / Fresh Squeezed Grapefruit Juice,Mythos,Blue Lagoon,Jack Daniels", false, true, new double[]{49.99, 67.90, 23.23, 12.90}));
        vecRestaurant.add(new Restaurant("Ca Jou", "restaurant  ", " Strada Domnească Strada Domnească, nr. 100, Galați 800201", 4.5f, new int[]{9, 19}, 100, true, true, "MENIU CIORBA DE PESTE/PIPOTE LA CUPTOR", "GOURMAND BREAKFAST", "PASTRAV PRAJIT CU MUJDEI SI MAMALIGA", "BEEFSTEAK SURF & TURF", "Chivas Regal 12 yrs,Bombay Sapphire,Pina Colada,Heineken,Limonada cu menta si ghimbir / Lemonade with mint & ginger,Apa Plata / Still Water,Seven Up", false, true, new double[]{99.99, 67.45, 67.89, 90.0}));
        vecRestaurant.add(new Restaurant("NOAH bar & lounge", "restaurant  ", " Aleea Faleza Dunării, Galați 800172", 3.4f, new int[]{9, 15}, 140, true, false, "MENIU CIORBA DE PESTE/PIPOTE LA CUPTOR", "Omletă Primavera", "Pârjoale moldovenești", "Mâncare de varză călită cu coastă de porc", "Mirinda,Fresh Mixt / Fresh Squeezed Mixt Juice,Carlsberg,Miami Beach,Mexicola", true, true, new double[]{78.90, 67.90, 45.99, 23.99}));
        vecRestaurant.add(new Restaurant("Blue Aqua", "pescaresc", "Bulevardul Marea Unire 75, Galați 827100", 4.4f, new int[]{10, 19}, 150, true, true, "ciorba de vacuta si friptura cu piure", "ou cu bacon impreuna cu gemuri si branzeturi", "ciorba de burta si icre de  peste", "paste carbonara impreuna cu carne de vita la cuptor cu portocale", "aperol spritz , rom,cola si apa minerala", false, false, new double[]{36.7, 45.9, 23.23, 12.90}));

        ///---------------------------Cafenea------------------------
        vecCafenele.add(new Cafenele("FRESH", "Bulevardul Basarabiei 20, Galați", 4.8f, new int[]{11, 20}, false, "sandwich italian,sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,sandwich grecesc,sandwich caesar", "cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{4.99, 7.90}, true, true, true));
        vecCafenele.add(new Cafenele("Old Town Coffee Shop", "Strada Domnească 105, Galați 800201", 5.0f, new int[]{9, 19}, false, "sandwich pork,sandwich prosciutto, sandwich pollo,sandwich cu ton,sandwich veggie", "cafea simpla,cafea cu lapte,cafea lunga,cappuccino,ciocolata calda alba/neagra,frappe,irish coffe,ceaiuri diferite arome,pepsi,sprite,apa minerala,apa plata", new double[]{78.90, 67.90}, true, true, true));
        vecCafenele.add(new Cafenele("Caffello", "Strada Eroilor 39, Galați 800119", 5.0f, new int[]{8, 17}, false, " ", "cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,frappe caramelizat,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{6.0, 8.99}, true, false, true));
        vecCafenele.add(new Cafenele("Shisha Caffe", "Bloc Select, Strada Domnească 36, Galați 800008", 4.2f, new int[]{12, 19}, false, "", "Espresso Scurt,Espresso Lung / Long Espresso,Cappuccino Amaretto,Espresso Americano,Caffe Latte Baileys,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{9.99, 8.99}, true, false, true));
        vecCafenele.add(new Cafenele("TED'S COFFEE CO.", "Strada Domnească 29, Galați 800008", 4.4f, new int[]{8, 19}, true, "", "Espresso / Double Espresso,Long Black,Caffe au Lait,Mochaccino,Coconut Macadamia Latte,Flavored Chocolate,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{10.0, 15.55}, true, false, true));
        vecCafenele.add(new Cafenele("Atelierul de cafea", "Bloc S3, Strada 1 Decembrie 1918 Parter, Galați 800251", 4.7f, new int[]{9, 17}, false, " ", "cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{5.55, 9.00}, true, false, true));
        vecCafenele.add(new Cafenele("Wise Cafe", "Strada Domnească 13, Galați 827100", 5.0f, new int[]{10, 17}, false, " ", "cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{10.50, 4.99}, true, false, true));
        vecCafenele.add(new Cafenele("L'amour Caffe", "Strada Brăilei 200a, Galați 800337", 5.0f, new int[]{9, 19}, false, "sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,", "cafea simpla,cafea cu lapte,cafea lunga,fanta,cola,apa minerala,apa plata", new double[]{12.34, 5.66}, true, true, true));
        vecCafenele.add(new Cafenele("Amerijan Cafee", "Str. Doctor Alexandru Carnabel, Galați", 4.4f, new int[]{11, 20}, false, "", "cafea cu lapte,cafea lunga,,frappe,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{7.99, 9.99}, true, false, true));
        vecCafenele.add(new Cafenele("Dream Coffee Shop @Bălcescu", "Nr.3k, Strada Nicolae Bălcescu, Galați 800041", 4.8f, new int[]{13, 20}, false, "sandwich cu sunca,sandwich cu ton,toast,sandwich grecesc,sandwich caesar", ",cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata", new double[]{14.99, 8.80}, true, true, true));
    }
}
