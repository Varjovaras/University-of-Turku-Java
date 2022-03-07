package com.company;

public class Kappaleet {

    interface Kappale {
        double annaAla();
        double annaKeskipiste();

    }

    class Piste {
        private double x;
        private double y;
        private double z;

        public Piste(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Kuutio implements Kappale {

        private Piste[] kulmat;

        public Kuutio(Piste[] kulmat) {
            this.kulmat = kulmat;
        }

        @Override
        public double annaAla() {
            return 0;
        }

        @Override
        public double annaKeskipiste() {
            return 0;
        }
    }

    public static void main(String[] args) {
    }
}
