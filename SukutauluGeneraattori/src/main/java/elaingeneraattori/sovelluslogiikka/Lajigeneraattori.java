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
public class Lajigeneraattori {

    public static String generoiLaji() {
        String[] rodut = {"kissa", "koira", "joutsen", "yksisarvinen", "hevonen", "aasi", "kentauri", "lohikäärme", 
        "nauta", "sika", "haltija", "kani"};

        String rotu = rodut[(int) (Math.random() * rodut.length)];

        return rotu;
    }
}
