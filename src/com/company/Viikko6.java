package com.company;

public class Viikko6 {

    public static void main(String[] args) {
        SalainenAgentti.koodiOk("123");
    }

    class Merkkijonoapuri {
        public static int laskeVokaalit(String jono) {
            int vokaalit = 0;
            char[] chars = jono.toCharArray();
            for (int i = 0; i < jono.length(); i++) {
                if (jono.charAt(i) == 'a' || jono.charAt(i) == 'e'
                        || jono.charAt(i) == 'i' || jono.charAt(i) == 'o'
                        || jono.charAt(i) == 'u' || jono.charAt(i) == 'y'
                        || jono.charAt(i) == 'ä' || jono.charAt(i) == 'ö') {

                    vokaalit++;
                }
            }
            return vokaalit;
        }

        public static int laskeMuut(String jono) {
            int vokaalit = Merkkijonoapuri.laskeVokaalit(jono);
            return jono.length() - vokaalit;
        }
    }

    class SalainenAgentti {
        private String nimi;
        private String koodi;

        public SalainenAgentti(String nimi, String koodi) {
            this.nimi = nimi;
            this.koodi = koodi;
        }

        public String getNimi() {
            return nimi;
        }

        public void setNimi(String nimi) {
            this.nimi = nimi;
        }

        public String getKoodi() {
            return koodi;
        }

        public void setKoodi(String koodi) {
            if (SalainenAgentti.koodiOk(koodi)) {
                this.koodi = koodi;

            } else {
                this.koodi = "000";
            }
            ;
        }


        public static boolean koodiOk(String koodi) {
            char[] charArray = koodi.toCharArray();

            return koodi.length() == 2 && charArray[0] == 0 && charArray[1] == 0;
        }
    }

    class Pohjoismaat {
        public static String SUOMI = "FI";
        public static String RUOTSI = "SE";
        public static String NORJA = "NO";
        public static String TANSKA = "DE";
        public static String ISLANTI = "IS";
    }

    class KalaMitat {
        public static final int MINIMIPITUUS = 25;
        public static final int MAKSIMIPITUUS = 75;
        public static final double MINIMIPAINO = 1.0;
        public static final double MAKSIMIPAINO = 5.0;
    }

    class Kala {
        private int pituus;
        private double paino;

        public Kala(int pituus, double paino) {
            this.pituus = pituus;
            this.paino = paino;
        }
        public boolean sallittu(){
            return pituus > KalaMitat.MINIMIPITUUS && pituus < KalaMitat.MAKSIMIPITUUS && paino > KalaMitat.MINIMIPAINO && paino < KalaMitat.MAKSIMIPAINO;
        }
    }
}
