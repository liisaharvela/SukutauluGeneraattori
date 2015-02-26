/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

/**
 * Luokka generoi eläimelle lajin
 * @author Liisa
 */
public class Lajigeneraattori {


    /**
     * Metodi palauttaa lajin, joka valitaan randomilla Arraysta.
     * @return laji muodossa String
     */
    
    public static String generoiLaji() {

        String[] lajit = {"koira", "kissa", "joutsen", "yksisarvinen", "hevonen", "aasi", "kentauri", "lohikäärme", "nauta", 
        "sika", "hanhi", "vuohi", "kani", "gerbiili", "etana", "leijona", "griffoni", "riikinkukko", "leopardi", "kultakala", 
        "mörkö", "trolli", "susi", "riikinkukko", "delfiini", "mursu", "norsu", "virtahepo", "kirahvi", "kilpikonna", 
        "hiiri", "pegasos", "muumi", "mörökölli", "karvapallero"};

        String laji = lajit[(int) (Math.random() * lajit.length)];

        return laji;
    }


}
