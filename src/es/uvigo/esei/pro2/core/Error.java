package es.uvigo.esei.pro2.core;

import com.sun.tools.javah.Gen;

/**
 * @author adotsuarez
 * (C) Agustin Suarez Martinez, 2020 - adot.c1.biz
 */
public class Error extends Exception{

    public static class General extends Exception {
        public General(String msg) {
            super(msg);
        }
    }

    static class Overflow extends General {
        public Overflow(String msg) {
            super(msg);
        }
    }

    static class Inexistente extends General {
        public Inexistente(String msg) {
            super(msg);
        }
    }

    static class YaExisteCita extends General {
        public YaExisteCita(String msg) {
            super(msg);
        }
    }
}
