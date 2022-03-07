package com.company;

import java.util.ArrayList;

public class Viikko7 {
    enum Ilmansuunta {
        POHJOINEN, ETELA, ITA, LANSI;
    }

    enum ValiIlmansuunta {
        KOILLINEN, KAAKKO, LOUNAS, LUODE;
    }


    class Reitti {
        private double pituus;
        private Ilmansuunta suunta;

        public Reitti(double pituus, Ilmansuunta suunta) {
            this.pituus = pituus;
            this.suunta = suunta;
        }

        public double getPituus() {
            return pituus;
        }

        public void setPituus(double pituus) {
            this.pituus = pituus;
        }

        public Ilmansuunta getSuunta() {
            return suunta;
        }

        public void setSuunta(Ilmansuunta suunta) {
            this.suunta = suunta;
        }
    }

    public static ArrayList<Reitti> reititSuuntaan(ArrayList<Reitti> reitit, Ilmansuunta suunta) {
        ArrayList<Reitti> uudetReitit = new ArrayList<>();
        for (Reitti reitti : reitit) {
            if (reitti.getSuunta() == suunta){
                uudetReitit.add(reitti);
            }
        }
        return uudetReitit;
    }
}
