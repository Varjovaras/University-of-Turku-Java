package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class ville {

    public static void main(String[] args) {
        Kirjainjoukko joukko = new Kirjainjoukko();
        joukko.lisaaKirjain('b');
        joukko.lisaaKirjain('a');
        joukko.lisaaKirjain('d');
        System.out.println(joukko.kaikkiKirjaimet());
    }


    class Lottokierros {
        int viikko;
        ArrayList<Integer> numerot;
        double voittopotti;

        public Lottokierros(int viikko, ArrayList<Integer> numerot, double voittopotti) {
            this.viikko = viikko;
            this.numerot = numerot;
            this.voittopotti = voittopotti;
        }

    }
}

class Peli {
    private String nimi;
    private String genre;
    private int ilmestymisvuosi;

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIlmestymisvuosi() {
        return ilmestymisvuosi;
    }

    public void setIlmestymisvuosi(int ilmestymisvuosi) {
        this.ilmestymisvuosi = ilmestymisvuosi;
    }

    public int getIkaraja() {
        return ikaraja;
    }

    public void setIkaraja(int ikaraja) {
        this.ikaraja = ikaraja;
    }

    private int ikaraja;

    public Peli(String nimi, String genre, int ilmestymisvuosi, int ikaraja) {
        this.nimi = nimi;
        this.genre = genre;
        this.ilmestymisvuosi = ilmestymisvuosi;
        this.ikaraja = ikaraja;
    }
}

class Varasto {
    private String tunniste;
    private int kapasiteetti;
    private int esineita;

    public Varasto(String tunniste, int kapasiteetti, int esineita) {
        this.tunniste = tunniste;
        this.kapasiteetti = kapasiteetti;
        this.esineita = esineita;
    }

    public String getTunniste() {
        return tunniste;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }


    public int getEsineita() {
        return esineita;
    }

    public void setTunniste(String tunniste) {
        this.tunniste = tunniste;
    }

    public void setKapasiteetti(int kapasiteetti) {
        if (kapasiteetti > 0) {
            this.kapasiteetti = kapasiteetti;
        }
    }

    public void setEsineita(int esineita) {
        if (esineita >= 1 && esineita < kapasiteetti) {
            this.esineita = esineita;
        }
    }


}

class Tulokset {
    private String kilpailu;
    private HashMap<String, Double> kierrosAjat;

    public Tulokset(String kilpailu, HashMap<String, Double> kierrosAjat) {
        this.kilpailu = kilpailu;
        this.kierrosAjat = kierrosAjat;
    }

    public String getKilpailu() {
        return kilpailu;
    }

    public void setKilpailu(String kilpailu) {
        this.kilpailu = kilpailu;
    }

    public HashMap<String, Double> getKierrosAjat() {
        return kierrosAjat;
    }

    public void setKierrosAjat(HashMap<String, Double> kierrosAjat) {
        if (kierrosAjat != null) {
            this.kierrosAjat = kierrosAjat;
        }
    }
}

class Laskin {

    private int tulos;

    public void lisaa(int luku) {
        this.tulos += luku;
    }

    public void vahenna(int luku) {
        this.tulos -= luku;
    }

    public void kerro(int luku) {
        this.tulos *= luku;
    }

    public void vastaluvuksi() {
        this.tulos = -tulos;
    }

    public int annaTulos() {
        return tulos;
    }
}

class Kirjainjoukko {
    private String joukko;

    public Kirjainjoukko() {
        this.joukko = "";
    }

    public void lisaaKirjain(char kirjain) {

        if (!joukko.contains(String.valueOf(kirjain))) {
            this.joukko += String.valueOf(kirjain);
            char[] temp = this.joukko.toCharArray();
            java.util.Arrays.sort(temp);
            this.joukko = new String(temp);
        }
    }

    public void lisaaKirjaimet(String kirjaimet) {
        char[] temp = kirjaimet.toCharArray();
        for (char i : temp) {
            lisaaKirjain(i);
        }
    }

    public String kaikkiKirjaimet() {
        return joukko;
    }
}

class Tuote {
    private String nimi;
    private int maara;

    public Tuote(String nimi, int maara) {
        this.nimi = nimi;
        this.maara = maara;
    }

    public String getNimi() {
        return nimi;
    }

    public int getMaara() {
        return maara;
    }

    public static Tuote laskeYhteen(Tuote tuote1, Tuote tuote2) {
        return new Tuote(tuote1.getNimi() + " ja " + tuote2.getNimi(), tuote1.getMaara() + tuote2.getMaara());
    }

    @Override
    public String toString() {
        return "Tuote (nimi=" + nimi + ", maara=" + maara + ")";
    }

}

class Koira {
    private String nimi;

    private int syntymaVuosi;

    public Koira(String nimi, int syntymaVuosi) {
        this.nimi = nimi;
        this.syntymaVuosi = syntymaVuosi;
    }

    public String getNimi() {
        return nimi;
    }

    public int getSyntymaVuosi() {
        return syntymaVuosi;
    }

    public static String vanhinKoira(ArrayList<Koira> koirat) {
        Koira vanhin = koirat.get(0);
        for (Koira koira : koirat) {
            if (koira.getSyntymaVuosi() < vanhin.getSyntymaVuosi()) {
                vanhin = koira;
            }

        }
        return vanhin.getNimi();
    }

    @Override
    public String toString() {
        return nimi + " (" + syntymaVuosi + ")";
    }
}

class Levy {
    private int kappaleita;
    private ArrayList<String> kappaleet;
    private int nykyinenKappale;

    public Levy(ArrayList<String> kappaleet) {
        this.kappaleet = kappaleet;
        this.kappaleita = kappaleet.size();
        this.nykyinenKappale = 0;
    }

    public boolean onkoLisaaKappaleita() {
        return nykyinenKappale < (kappaleita - 1);
    }

    public int getNykyinenKappale() {
        return this.nykyinenKappale;
    }

    public void seuraavaKappale() {
        nykyinenKappale++;
    }

    public String kappaleenNimi() {
        return kappaleet.get(nykyinenKappale);
    }
}

class Levysoitin {
    private ArrayList<Levy> levyt;

    public Levysoitin() {
        levyt = new ArrayList<>();
    }

    public void syotaLevy(Levy levy) {

    }

    public void seuraavaKappale() {

    }

    public String nykyisenKappaleenNimi(){
        String kaksoispistedee = ":D";
        return kaksoispistedee;
    }

}