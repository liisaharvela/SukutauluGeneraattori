/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

import java.util.Random;

/**
 *
 * @author Liisa
 */
public class Hevonen {

    private int sakakorkeus;
    private String vari;
    private String nimi;
    private String skp;
    private String rotu;

    public Hevonen(int min, int max, boolean erikoisvarit, boolean tamma, boolean suomi, String rotu) {
        this.rotu = rotu;
        this.sakakorkeus = Sakakorkeusgeneraattori.generoiSakakorkeus(min, max);

        if (erikoisvarit) {
            this.vari = VariGeneraattori.salliKaikkiVarit();
        } else {
            this.vari = VariGeneraattori.vainPerusvarit();
        }

        if (tamma) {
            this.skp = "tamma";
        } else {
            this.skp = "ori";
        }

        if (suomi && tamma) {
            this.nimi = Nimigeneraattori.suomalainenTamma();
        } else if (suomi && tamma != true) {
            this.nimi = Nimigeneraattori.suomalainenOri();
        } else if (suomi != true && tamma) {
            this.nimi = Nimigeneraattori.englantilainenTamma();
        } else if (suomi != true && tamma != true) {
            this.nimi = Nimigeneraattori.englantilainenOri();
        }
    }

    @Override
    public String toString() {
        return this.nimi + "\n" + this.rotu + "-" + this.skp + ", " + this.vari + " " + this.sakakorkeus;
    }

}
