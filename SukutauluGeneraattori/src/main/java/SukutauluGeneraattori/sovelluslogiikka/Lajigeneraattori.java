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

    private List<String> lajit;
    private Random randomGenerator;

    public static String generoiLaji() {

        String[] lajit = {"koira", "kissa", "joutsen", "yksisarvinen", "hevonen", "aasi", "kentauri", "lohikäärme", "nauta", 
        "sika", "hanhi", "vuohi", "kani", "gerbiili", "etana", "leijona", "griffoni", "riikinkukko", "leopardi", "kultakala", 
        "mörkö", "trolli", "susi", "riikinkukko"};

        String laji = lajit[(int) (Math.random() * lajit.length)];

        return laji;
    }

    public Lajigeneraattori() {
        lajit = new ArrayList();

        lajit.add("kissa");
        lajit.add("koira");
        lajit.add("joutsen");
        lajit.add("yksisarvinen");
        lajit.add("hevonen");
        lajit.add("aasi");
        lajit.add("kentauri");
        lajit.add("lohikäärme");
        lajit.add("nauta");
        lajit.add("sika");
        lajit.add("hanhi");
        lajit.add("vuohi");
        lajit.add("kani");
        lajit.add("gerbiili");
        lajit.add("etana");
        lajit.add("leijona");
        lajit.add("leopardi");
        lajit.add("riikinkukko");
        lajit.add("kultakala");
        lajit.add("mörkö");
    }

//    public String getLaji() {
//        
//        int index = randomGenerator.nextInt(lajit.size());
//        this.laji = lajit.get(index);
//        return this.laji;
//    }

}
