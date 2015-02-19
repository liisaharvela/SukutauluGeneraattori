package sukutaulugeneraattori.sovelluslogiikka;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sukutaulugeneraattori.sovelluslogiikka.VariGeneraattori;

/**
 *
 * @author Liisa
 */
public class VariGeneraattoriTest {

    public VariGeneraattoriTest() {
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
    public void varigeneraattoriGeneroiPerusvarin() {
        String vari = VariGeneraattori.vainPerusvarit();
        assertEquals(vari.length(), vari.length() != 0);
    }

    @Test
    public void varigeneraattoriGeneroiIhanMinkaVaanVarisen() {
        String vari = VariGeneraattori.salliKaikkiVarit();
        assertEquals(vari.length(), vari.length() != 0);
    }

}
