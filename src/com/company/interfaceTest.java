/*package com.company;

import java.util.ArrayList;

public class interfaceTest {
    interface Laskin {
        void lisaa(int i);

        void vahenna(int i);

        void kerro(int i);

        void jaa(int i);

        double annaTulos();
    }

    public static int montakoMahtuu(Astia isoAstia, Astia pieniAstia){
    return (int) (isoAstia.getTilavuus() / pieniAstia.getTilavuus());
    }
}*/

    /*class Laskukone implements Laskin {
        private double tulos;

        public Laskukone() {
            tulos = 0.0;
        }

        @Override
        public void lisaa(int i) {
            tulos += i;
        }

        @Override
        public void vahenna(int i) {
            tulos -= i;

        }

        @Override
        public void kerro(int i) {
            tulos *= i;

        }

        @Override
        public void jaa(int i) {
            tulos /= i;

        }

        @Override
        public double annaTulos() {
            return tulos;
        }

        public static Reitti pisinReitti(ArrayList<Reitti> reitit) {
            Reitti pisinReitti = reitit.get(0);
            for (Reitti reitti : reitit) {
                if (reitti.compareTo(pisinReitti) > 0) {
                    pisinReitti = reitti;
                }
            }
            return pisinReitti;

        }
    }

    class Reitti implements Comparable<Reitti> {
        private String lahtopiste;
        private String paatepiste;
        private int matka;

        public Reitti(String lahtopiste, String paatepiste, int matka) {
            this.lahtopiste = lahtopiste;
            this.paatepiste = paatepiste;
            this.matka = matka;
        }

        @Override
        public int compareTo(Reitti o) {
            return this.matka - o.matka;
        }

        @Override
        public String toString() {
            return lahtopiste + " - " + paatepiste + ": " + matka + " km.";
        }


    }

    interface Astia {
        double getTilavuus();
    }

    class Pullo implements Astia {
        private String nimi;
        private double tilavuus;

        public Pullo(String nimi, double tilavuus) {
            this.nimi = nimi;
            this.tilavuus = tilavuus;
        }

        @Override
        public double getTilavuus() {
            // TODO Auto-generated method stub
            return tilavuus;
        }

        @Override
        public String toString() {
            return nimi + "pullo, tilavuus " + tilavuus + " litraa";
        }
    }

    class Tynnyri implements Astia {
        private String nimi;
        private double tilavuus;

        public Tynnyri(String nimi, double tilavuus) {
            this.nimi = nimi;
            this.tilavuus = tilavuus;
        }

        @Override
        public double getTilavuus() {
            // TODO Auto-generated method stub
            return tilavuus;
        }

        @Override
        public String toString() {
            return nimi + "tynnyri, tilavuus " + tilavuus + " litraa";
        }

    }*/