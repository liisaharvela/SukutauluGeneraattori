/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elaingeneraattori.sovelluslogiikka;

/**
 *
 * @author Liisa
 */
public class Sukupuoligeneraattori {

    public static String valitseSkp() {
        String[] sukupuolet = {"naaras", "uros"};

        String skp = sukupuolet[(int) (Math.random() * sukupuolet.length)];

        return skp;
    }
}
