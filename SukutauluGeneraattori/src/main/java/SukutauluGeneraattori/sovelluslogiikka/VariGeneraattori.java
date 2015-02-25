/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

import java.util.Random;

/**
 *
 * @author Liisa
 */
public class VariGeneraattori {

    public static String valitseVari() {
        String[] varit = {"violetti", "oranssi", "musta", "valkoinen", "ruskea", "liila", "vaaleanpunainen", "vihreä", "sininen", 
        "pinkki", "punainen", "sateenkaarenkirjava", "kultainen", "hopeinen"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

}
