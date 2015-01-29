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
import sukutaulugeneraattori.sovelluslogiikka.Nimigeneraattori;

/**
 *
 * @author Liisa
 */
public class SukutauluGeneraattoriTest {

    public SukutauluGeneraattoriTest() {
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
    public void nimigeneraattoriGeneroiSuomalaisenOrinNimen() {
        String nimi = Nimigeneraattori.suomalainenOri();
        System.out.println(nimi);
        assertEquals(nimi, nimi);
    }

    @Test
    public void nimigeneraattoriGeneroiSuomalaisenTammanNimen() {
        String nimi = Nimigeneraattori.suomalainenTamma();
        System.out.println(nimi);
        assertEquals(nimi, nimi);
    }

    @Test
    public void nimigeneraattoriGeneroiEnglanninkielisenOrinNimen() {
        String nimi = Nimigeneraattori.englantilainenOri();
        System.out.println(nimi);
        assertEquals(nimi, nimi);
    }

    @Test
    public void nimigeneraattoriGeneroiEnglanninkielisenTammanNimen() {
        String nimi = Nimigeneraattori.englantilainenTamma();
        System.out.println(nimi);
        assertEquals(nimi, nimi);
    }

}
