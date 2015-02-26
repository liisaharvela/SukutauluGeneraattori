package SukutauluGeneraattori.sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Liisa
 */
import sukutaulugeneraattori.sovelluslogiikka.Elain;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.junit.matchers.JUnitMatchers.either;

/**
 *
 * @author Liisa
 */
public class ElainTest {

    public ElainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void generaattoriTekeeErilaisiaElaimia() {
        Elain elainYksi = new Elain();
        Elain elainKaksi = new Elain();

        String eka = elainYksi.toString();
        String toka = elainKaksi.toString();

        assertThat(eka, not(toka));
    }

    @Test
    public void generaattorinElaimillaOnEriNimet() {
        Elain elainYksi = new Elain();
        String nimiYksi = elainYksi.getNimi();
        Elain elainKaksi = new Elain();
        String nimiKaksi = elainKaksi.getNimi();
        assertThat(nimiYksi, not(nimiKaksi));
    }

    @Test
    public void generaattorinElaimillaOnEriSakakorkeudet() {
        Elain elainYksi = new Elain();
        int sakaYksi = elainYksi.getSakakorkeus();
        Elain elainKaksi = new Elain();
        int sakaKaksi = elainKaksi.getSakakorkeus();
        assertThat(sakaYksi, not(sakaKaksi));
    }

    @Test
    public void generaattorinElaimetSaavatSukupuolen() {
        Elain elainYksi = new Elain();
        String skpYksi = elainYksi.getSkp();

        assertThat(skpYksi, either(containsString("uros")).or(containsString("naaras")));
    }

    @Test
    public void HTMLGeneraattoriTulostaaSukupuolen() {
        Elain elainYksi = new Elain();
        String htmlYksi = elainYksi.forHTML();

        assertThat(htmlYksi, either(containsString("uros")).or(containsString("naaras")));
    }

    @Test
    public void HTMLGeneraattoriTulostaaNimenOikein() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.forHTML();

        assertThat(elukkaYksi, containsString(elainYksi.getNimi()));
    }

    @Test
    public void HTMLGeneraattoriTulostaaSukupuolenOikein() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.forHTML();

        assertThat(elukkaYksi, containsString(elainYksi.getSkp()));
    }

    @Test
    public void HTMLGeneraattoriTulostaaVarinOikein() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.forHTML();

        assertThat(elukkaYksi, containsString(elainYksi.getVari()));
    }


    @Test
    public void HTMLGeneraattoriTulostaaLajinOikein() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.forHTML();

        assertThat(elukkaYksi, containsString(elainYksi.getLaji()));
    }
    
    
    @Test
    public void ElainSaaVarin() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.toString();

        assertThat(elukkaYksi, containsString(elainYksi.getVari()));
    }
    
    @Test
    public void ElainSaaIsan() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.toString();

        assertThat(elukkaYksi, containsString(elainYksi.getIsanNimi()));
    }
    
    @Test
    public void ElainSaaEman() {
        Elain elainYksi = new Elain();

        String elukkaYksi = elainYksi.toString();

        assertThat(elukkaYksi, containsString(elainYksi.getEmanNimi()));
    }
    


}
