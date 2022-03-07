package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Viikko5osa2 {
    class Piste {
        protected int x;
        protected int y;

        public Piste(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }


    class MuokattavaPiste extends Piste {
        public MuokattavaPiste(int x, int y) {
            super(x, y);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

    }

    class Arvosana {
        private final String opiskelija;
        private final int arvosana;

        public Arvosana(String opiskelija, int arvosana) {
            this.opiskelija = opiskelija;
            this.arvosana = arvosana;
        }

        public String getOpiskelija() {
            return opiskelija;
        }

        public int getArvosana() {
            return arvosana;
        }

    }

    class Arvostelukirja {
        protected String omistaja;
        protected ArrayList<Arvosana> arvosanat;

        public Arvostelukirja(String omistaja) {
            this.omistaja = omistaja;
            arvosanat = new ArrayList<>();
        }
    }


    class Ohjaaja {
        protected String nimi;
        protected int ohjaustunnit;
        protected int ylitunnit;

        public Ohjaaja(String nimi, int ohjaustunnit, int ylitunnit) {
            this.nimi = nimi;
            this.ohjaustunnit = ohjaustunnit;
            this.ylitunnit = ylitunnit;
        }

        public int tunnitYhteensa() {
            return ohjaustunnit + ylitunnit;
        }
    }

    class Erityisohjaaja extends Ohjaaja {
        private final int erityistunnit;

        public Erityisohjaaja(String nimi, int ohjaustunnit, int ylitunnit, int erityistunnit) {
            super(nimi, ohjaustunnit, ylitunnit);
            this.erityistunnit = erityistunnit;
        }


        public int tunnitYhteensa() {
            return ohjaustunnit + ylitunnit + erityistunnit;
        }
    }


    class Kauppalista {
        private final ArrayList<String> tuotteet;

        public Kauppalista() {
            tuotteet = new ArrayList<>();
        }

        public void lisaaTuote(String tuote) {
            tuotteet.add(tuote);
        }

        public String annaLista() {
            return String.join("\n", tuotteet);
        }
    }

    class LuomuKauppalista extends Kauppalista {
        public LuomuKauppalista() {
        }

        public String annaLista() {
            String oldString = super.annaLista();
            StringBuilder newString = new StringBuilder();

            ArrayList<String> list = new ArrayList<>(java.util.Arrays.asList(oldString.split("\n")));
            for (String i : list) {
                if (i.contains("luomu")) {
                    newString.append(i + "\n");
                }
            }
            return newString.toString();
        }

    }

    class Lompakko {
        protected double rahaa;

        public Lompakko(double rahaa) {
            this.rahaa = rahaa;
        }

        public void lisaaRahaa(double rahamaara) {
            rahaa += rahamaara;
        }

        public double getRahaa() {
            return rahaa;
        }
    }

    class ParempiLompakko extends Lompakko {
        public ParempiLompakko(double rahaa) {
            super(rahaa);
        }

        public void lisaaRahaa(int eurot, int sentit) {
            rahaa += eurot;
            rahaa += sentit / 100.0;
        }

        public void lisaaRahaa(String rahamäärä) {
            rahaa += Double.parseDouble(rahamäärä);
        }
    }

    class Yhteys {
        protected int nopeus;

        public Yhteys(int nopeus) {
            this.nopeus = nopeus;
        }

        public int getNopeus() {
            return nopeus;
        }
    }

    class SuojattuYhteys extends Yhteys {
        private String suojaus;
        private String salasana;

        public SuojattuYhteys(int nopeus, String suojaus, String salasana) {
            super(nopeus);
            this.suojaus = suojaus;
            this.salasana = salasana;
        }

        public SuojattuYhteys(int nopeus) {
            super(nopeus);
            this.suojaus = "SHA";
            this.salasana = "abcabc";
        }

        public SuojattuYhteys() {
            super(100);
            this.suojaus = "SHA";
            this.salasana = "abcabc";
        }

        public String getSuojaus() {
            return suojaus;
        }

        public void setSuojaus(String suojaus) {
            this.suojaus = suojaus;
        }

        public String getSalasana() {
            return salasana;
        }

        public void setSalasana(String salasana) {
            this.salasana = salasana;
        }
    }

    class Elokuva {
        private final String ohjaaja;
        private final String nimi;
        int kesto;

        public Elokuva(String ohjaaja, String nimi, int kesto) {
            this.ohjaaja = ohjaaja;
            this.nimi = nimi;
            this.kesto = kesto;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Elokuva other = (Elokuva) obj;
            if (kesto != other.kesto)
                return false;
            if (nimi == null) {
                if (other.nimi != null)
                    return false;
            } else if (!nimi.equals(other.nimi))
                return false;
            if (ohjaaja == null) {
                return other.ohjaaja == null;
            } else return ohjaaja.equals(other.ohjaaja);
        }


        @Override
        public String toString() {
            return nimi + " (" + ohjaaja + "), " + kesto + " min.";
        }
    }

    //poikkeukset
    //

    class SuperPoikkeus extends Exception {
        public SuperPoikkeus(String message) {
            super(message);
        }
    }

    class SuperElain {
        private String laji;
        private String nimi;
        private String supervoima;

        public SuperElain(String laji, String nimi, String supervoima) {
            this.laji = laji;
            this.nimi = nimi;
            this.supervoima = supervoima;
        }

        public String getLaji() {
            return laji;
        }

        public String getNimi() {
            return nimi;
        }

        public String getSupervoima() {
            return supervoima;
        }

        @Override
        public String toString() {
            return nimi + " (" + laji + "), supervoima: " + supervoima;
        }
    }




}
