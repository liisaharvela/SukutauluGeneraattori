/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

/**
 * Luokka generoi sukupuolen Arraysta 
 * @author Liisa
 */
public class Sukupuoligeneraattori {

    /**
     * Metodi palauttaa sukupuolen, joka valitaan randomilla Arraysta.
     * @return sukupuoli muodossa String
     */
    
    public static String valitseSkp() {
        String[] sukupuolet = {"naaras", "uros", "naaras", "uros", "naaras", "uros", "naaras", "uros", "naaras", "uros", 
        "naaras", "uros", "naaras", "uros", "naaras", "uros", "naaras", "uros", "naaras", "uros", "naaras", "uros"};

        String skp = sukupuolet[(int) (Math.random() * sukupuolet.length)];

        return skp;
    }
}
