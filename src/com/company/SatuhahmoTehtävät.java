package com.company;

import java.util.ArrayList;

public class SatuhahmoTehtävät {

    public static Satuhahmo vanhinHahmo(ArrayList<Satuhahmo> hahmot) {
        Satuhahmo vanhin = hahmot.get(0);
        for (Satuhahmo hahmo : hahmot) {
            if (hahmo.getIka() > vanhin.getIka()){
                vanhin = hahmo;
            }
        }
        return vanhin;
    }

    class Satuhahmo {
        private String nimi;
        private int ika;

        public Satuhahmo(String nimi, int ika) {
            this.nimi = nimi;
            this.ika = ika;
        }

        public String getNimi() {
            return nimi;
        }

        public int getIka() {
            return ika;
        }

        @Override
        public String toString() {
            return nimi + ", " + ika + " vuotta";
        }
    }

    class Veljenpoika extends Satuhahmo {
        private String lakinVari;

        public Veljenpoika(String nimi, int ika, String lakinVari) {
            super(nimi, ika);
            this.lakinVari = lakinVari;
        }

        @Override
        public String toString() {
            return super.toString() + ", " + lakinVari + " lakki";
        }
    }

    class Velho extends Satuhahmo {
        private String sauva;

        public Velho(String nimi, int ika, String sauva) {
            super(nimi, ika);
            this.sauva = sauva;
        }

        @Override
        public String toString() {
            return super.toString() + ", " + sauva + "sauva";
        }
    }

    class Supersankari extends Satuhahmo {
        private String supervoima;

        public Supersankari(String nimi, int ika, String supervoima) {
            super(nimi, ika);
            this.supervoima = supervoima;
        }

        @Override
        public String toString() {
            return super.toString() + ", supervoima: " + supervoima;
        }
    }
}
