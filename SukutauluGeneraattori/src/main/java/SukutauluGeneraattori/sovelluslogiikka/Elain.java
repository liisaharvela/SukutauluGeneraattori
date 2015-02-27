/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukutaulugeneraattori.sovelluslogiikka;

/**
 * Luokka kokoaa generaattoreiden tiedot Elain-oliolle, sekä tarjoaa 
 * toString ja get-metodeja eri ohjelman toiminnallisuuksille

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

    /**
 * Konstruktori, joka hakee eri luokista generoimalla luodut tiedot Elain-oliolle.
 * 
 * @see SukutauluGeneraattori.sovelluslogiikka.Lajigeneraattori#generoiLaji() 
 * @see SukutauluGeneraattori.sovelluslogiikka.Sakakorkeusgeneraattori#generoiSakakorkeus(int, int) 
 * @see SukutauluGeneraattori.sovelluslogiikka.Nimigeneraattori#englantilainenNaaras() 
 * @see SukutauluGeneraattori.sovelluslogiikka.Nimigeneraattori#englantilainenUros() 
 * @see SukutauluGeneraattori.sovelluslogiikka.Nimigeneraattori#englantilainenNimi() 
 * @see SukutauluGeneraattori.sovelluslogiikka.Varigeneraattori#valitseVari() 
 * @see SukutauluGeneraattori.sovelluslogiikka.Sukupuoligeneraattori#valitseSkp() 
     */
    
    public Elain() {
        this.sakakorkeus = Sakakorkeusgeneraattori.generoiSakakorkeus(180, 100);
        this.vari = Varigeneraattori.valitseVari();
        this.laji = Lajigeneraattori.generoiLaji();
        this.skp = Sukupuoligeneraattori.valitseSkp();
        this.nimi = Nimigeneraattori.englantilainenNimi();
        this.isannimi = Nimigeneraattori.englantilainenUros();
        this.isanisannimi = Nimigeneraattori.englantilainenUros();
        this.isanemannimi = Nimigeneraattori.englantilainenNaaras();
        this.emannimi = Nimigeneraattori.englantilainenNaaras();
        this.emanisannimi = Nimigeneraattori.englantilainenUros();
        this.emanemannimi = Nimigeneraattori.englantilainenNaaras();
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

    public String getIsanNimi() {
        return this.isannimi;
    }

    public String getEmanNimi() {
        return this.emannimi;
    }

    public String getIsanIsanNimi() {
        return this.isanisannimi;
    }

    public String getIsanEmanNimi() {
        return this.isanemannimi;
    }

    public String getEmanIsanNimi() {
        return this.emanisannimi;
    }
    
    public String getEmanEmanNimi() {
        return this.emanemannimi;
    }

    public String getIsa() {
        return this.isannimi + " " + "(" + this.isanisannimi + " x " + this.isanemannimi + ")";
    }

    public String getEma() {
        return this.emannimi + " " + "(" + this.emanisannimi + " x " + this.emanemannimi + ")";
    }
    
    public String forHTML() {
        return this.nimi + "<br />" + this.laji + "-" + this.skp + ", " + this.vari + " " + this.sakakorkeus + "cm";
    }
    
    @Override
    public String toString() {
        return this.nimi + this.laji + this.skp + this.vari + this.sakakorkeus + this.isannimi + this.emannimi;
    }

}
