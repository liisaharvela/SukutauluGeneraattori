/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Liisa
 */
public class Lajigeneraattori {


    public static String generoiLaji() {

        String[] lajit = {"koira", "kissa", "joutsen", "yksisarvinen", "hevonen", "aasi", "kentauri", "lohikäärme", "nauta", 
        "sika", "hanhi", "vuohi", "kani", "gerbiili", "etana", "leijona", "griffoni", "riikinkukko", "leopardi", "kultakala", 
        "mörkö", "trolli", "susi", "riikinkukko"};

        String laji = lajit[(int) (Math.random() * lajit.length)];

        return laji;
    }


}
