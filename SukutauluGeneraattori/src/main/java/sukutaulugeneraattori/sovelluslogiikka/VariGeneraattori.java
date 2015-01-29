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
public class VariGeneraattori {

    public static String vainPerusvarit() {
        String[] varit = {"rt", "rn", "m", "km", "mkm", "tprt", "tprn", "trt",
            "trn", "rnkm", "mkm", "rtkm", "sysrt", "mksrt", "klm", "kkm", "klm"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

    public static String salliErikoisVarit() {
        String[] varit = {"hkko", "hrkko", "hpm", "hprn", "khkko", "mpäist",
            "mvkk", "phkko", "päist", "rtpäist", "rnhkko", "rnpäist", "ssvkk",
            "vhkk", "vkk", "vvkk", "rt", "rn", "m", "km", "mkm", "tprt", "tprn", "trt",
            "trn", "rnvkk", "rnkm", "mkm", "rtkm", "sysrt", "mksrt", "klm", "kkm", "klm"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

    public static String salliKirjavat() {
        String[] varit = {"fr", "krj", "mkrj", "rtkrj", "rnkrj", "sb",
            "spl", "tkrj", "to", "rt", "rn", "m", "km", "mkm", "tprt", "tprn", "trt",
            "trn", "rnvkk", "rnkm", "mkm", "rtkm", "sysrt", "mksrt", "klm", "kkm", "klm"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

    public static String salliKaikkiVarit() {
        String[] varit = {"fr", "hkko", "hrkko", "hpm", "hprn", "khkko", "krj", "mkrj", "mpäist",
            "mvkk", "phkko", "päist", "rtkrj", "rtpäist", "rnhkko", "rnpäist", "rnkrj", "sb", "ssvkk",
            "spl", "tkrj", "to", "vhkk", "vkk", "vvkk", "rt", "rn", "m", "km", "mkm", "tprt", "tprn", "trt",
            "trn", "rnvkk", "rnkm", "mkm", "rtkm", "sysrt", "mksrt", "klm", "kkm", "klm"};

        String vari = varit[(int) (Math.random() * varit.length)];

        return vari;
    }

}
