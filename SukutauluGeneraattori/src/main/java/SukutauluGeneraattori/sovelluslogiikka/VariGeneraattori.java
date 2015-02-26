/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;


/**
 * Luokka generoi värin Arraysta
 * @author Liisa
 */
public class Varigeneraattori {

    /**
     * Metodi palauttaa jonkun värin, joka valitaan randomilla Arraysta.
     * @return vari muodossa String
     */
    
    public static String valitseVari() {
        String[] varit = {"violetti", "oranssi", "musta", "valkoinen", "ruskea", "liila", "vaaleanpunainen", "vihreä", "sininen", 
        "pinkki", "punainen", "sateenkaarenkirjava", "kultainen", "hopeinen", "titaaninvalkoinen", "norsunluu", "laventeli", "harmaa", 
        "indigo", "syaani", "turkoosi", "akvamariini", "smaragdinvihreä", "ultramariini", "meripihka", "khaki", "beige", "limenvihreä", 
        "punamulta", "terrakotta", "karmiini", "koralli", "tulenpunainen", "kastanja", "sienna", "seepia", "purppura", "fuksia", 
        "kirsikanpunainen"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

}
