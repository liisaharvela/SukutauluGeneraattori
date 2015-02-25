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
public class Elain {

    private int sakakorkeus;
    private String vari;
    private String nimi;
    private String skp;
    private String laji;
    private String isannimi;
    private String emannimi;
    private String isanisannimi;
    private String isanemannimi;
    private String emanisannimi;
    private String emanemannimi;

    public Elain() {
        this.laji = Lajigeneraattori.generoiLaji();
        this.sakakorkeus = Sakakorkeusgeneraattori.generoiSakakorkeus(180, 100);
        this.vari = VariGeneraattori.valitseVari();
        this.skp = Sukupuoligeneraattori.valitseSkp(); 
        this.nimi = Nimigeneraattori.englantilainenNimi();
        this.isannimi = Nimigeneraattori.englantilainenOri();
        this.isanisannimi = Nimigeneraattori.englantilainenOri();
        this.isanemannimi = Nimigeneraattori.englantilainenTamma();
        this.emannimi = Nimigeneraattori.englantilainenTamma();
        this.emanisannimi = Nimigeneraattori.englantilainenOri();
        this.emanemannimi = Nimigeneraattori.englantilainenTamma();
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public String getSkp() {
        return this.skp;
    }
    
    public String getVari() {
        return this.vari;
    }
    
    public String getLaji() {
        return this.laji;
    }
    
    public int getSakakorkeus() {
        return this.sakakorkeus;
    }
    
    public String getIsa() {
        return this.isannimi + " " + "(" + this.isanisannimi + " x " + this.isanemannimi + ")";
    }
    
    public String getEma() {
        return this.emannimi + " " + "(" + this.emanisannimi + " x " + this.emanemannimi + ")";
    }

    @Override
    public String toString() {
        return this.nimi + this.laji + this.skp + this.vari + this.sakakorkeus + this.isannimi + this.emannimi;
    }

}
