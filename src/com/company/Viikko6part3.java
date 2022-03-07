package com.company;

import java.util.ArrayList;

public class Viikko6part3 {

    public static int lastiaYhteensa(ArrayList<Auto> autot) {
        int i = 0;
        for (Auto kuormaAuto : autot) {
            KuormaAuto muutettuAuto = (KuormaAuto) kuormaAuto;
            i += muutettuAuto.getLasti();
        }
        return i;
    }

    public static int laskeVelhot(ArrayList<Satuhahmo> hahmot) {
        int velhot = 0;
        for (Satuhahmo hahmo : hahmot) {
            if (hahmo.getClass() == Velho.class) {
                velhot++;
            }
        }

        return velhot;
    }

    public static int ihmisiaLaivoissa(ArrayList<Laiva> laivat) {
        int ihmiset = 0;
        for (Laiva laiva : laivat) {
            if (laiva.getClass() == Laiva.class) {
                ihmiset += laiva.getHenkilosto();
            } else if (laiva.getClass() == Matkustajalaiva.class) {
                ihmiset += laiva.getHenkilosto() + ((Matkustajalaiva) laiva).getMatkustajat();
            } else if (laiva.getClass() == Luksusristeilija.class) {
                ihmiset += laiva.getHenkilosto() + ((Luksusristeilija) laiva).getMatkustajat() + ((Luksusristeilija) laiva).getPalvelijat();
            }
        }
        return ihmiset;
    }


    class Auto {
        protected String merkki;

        public Auto(String merkki) {
            this.merkki = merkki;
        }

        public String getMerkki() {
            return merkki;
        }
    }

    class KuormaAuto extends Auto {
        private int lasti;

        public KuormaAuto(String merkki, int lasti) {
            super(merkki);
            this.lasti = lasti;
        }

        public int getLasti() {
            return lasti;
        }

        public String toString() {
            return merkki + ", lastia: " + lasti;
        }
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
            return super.toString() + ", " + lakinVari + " lakki (veljenpoika)";
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
            return super.toString() + ", " + sauva + "sauva (velho)";
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
            return super.toString() + ", supervoima: " + supervoima + " (supersankari)";
        }
    }

    class Laiva {

        private int henkilosto;

        public Laiva(int henkilosto) {
            this.henkilosto = henkilosto;
        }

        public int getHenkilosto() {
            return henkilosto;
        }

        @Override
        public String toString() {
            return "Laiva (" + henkilosto + ")";
        }

    }

    class Matkustajalaiva extends Laiva {

        private int matkustajat;

        public Matkustajalaiva(int henkilosto, int matkustajat) {
            super(henkilosto);
            this.matkustajat = matkustajat;
        }

        public int getMatkustajat() {
            return this.matkustajat;
        }

        @Override
        public String toString() {
            return "Matkustajalaiva (" + (getHenkilosto() + matkustajat) + ")";
        }
    }

    class Luksusristeilija extends Matkustajalaiva {

        private int palvelijat;

        public Luksusristeilija(int henkilosto, int matkustajat, int palvelijat) {
            super(henkilosto, matkustajat);
            this.palvelijat = palvelijat;
        }


        public int getPalvelijat() {
            return this.palvelijat;
        }

        public String toString() {
            return "Luksusristeilija (" + (getHenkilosto() + getMatkustajat() + palvelijat) + ")";
        }
    }

    class Vari {
        final int MUSTA = 2;
        final int VALKOINEN = 1;
    }

    final class Pelinappula {
        int vari;

        public Pelinappula(int vari) {
            this.vari = vari;
        }

        public int getVari() {
            return vari;
        }
    }

    class Pelilauta {
        private final int koko;
        private int vapaatRuudut;
        private Pelinappula viimeinenLisaaja;

        public Pelilauta(int koko) {
            this.koko = koko;
            this.vapaatRuudut = koko;
        }

        boolean lisaaNappulat(Pelinappula nappula, int maara) {
            if (maara <= vapaitaRuutuja()) {
                viimeinenLisaaja = nappula;
                vapaatRuudut -= maara;
                return true;
            } else return false;

        }

        int vapaitaRuutuja() {
            return vapaatRuudut;
        }

        Pelinappula viimeinenLisaaja() {
            return viimeinenLisaaja;
        }

        public int getKoko() {
            return koko;
        }
    }
}
