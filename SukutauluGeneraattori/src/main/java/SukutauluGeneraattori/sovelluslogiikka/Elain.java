/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SukutauluGeneraattori.sovelluslogiikka;

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
        this.isannimi = Nimigeneraattori.englantilainenUros();
        this.isanisannimi = Nimigeneraattori.englantilainenUros();
        this.isanemannimi = Nimigeneraattori.englantilainenNaaras();
        this.emannimi = Nimigeneraattori.englantilainenNaaras();
        this.emanisannimi = Nimigeneraattori.englantilainenUros();
        this.emanemannimi = Nimigeneraattori.englantilainenNaaras();
    }
    
 //   public String setLaji () {
 //       Lajigeneraattori lajunen = new Lajigeneraattori();
 //       laji = lajunen.getLaji();
 //       return laji;
 //   }
    
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
