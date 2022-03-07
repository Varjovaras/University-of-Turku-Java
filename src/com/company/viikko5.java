package com.company;

public class viikko5 {

    class Vene {
    }

    class Purjevene extends Vene {
    }

    class Soutuvene extends Vene {
    }

    class Kanootti extends Vene {
    }

    class Kirja {
        private String nimi;
        private String kirjailija;

        public Kirja(String nimi, String kirjailija) {
            this.nimi = nimi;
            this.kirjailija = kirjailija;
        }

        public String getNimi() {
            return nimi;
        }

        public void setNimi(String nimi) {
            this.nimi = nimi;
        }

        public String getKirjailija() {
            return kirjailija;
        }

        public void setKirjailija(String kirjailija) {
            this.kirjailija = kirjailija;
        }
    }

    class Lopputyo extends Kirja {
        private int arvosana;

        public Lopputyo(String nimi, String kirjailija, int arvosana) {
            super(nimi, kirjailija);
            this.arvosana = arvosana;
        }

        public int getArvosana() {
            return arvosana;
        }

        public void setArvosana(int arvosana) {
            this.arvosana = arvosana;
        }
    }
}
