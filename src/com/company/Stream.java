package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {

    public static void tulosta(ArrayList<Jaakiekkoilija> pelaajat) {
        pelaajat.stream().forEach(pelaaja -> System.out.println(pelaaja.getNimi() + ", " + (pelaaja.getMaalit() + pelaaja.getSyotot()) + " pistettä"));
    }

    public static void tulostaPohjoisenReitit(ArrayList<Reitti> reitit) {
        reitit.stream().filter(reitti -> reitti.getSuunta() == Ilmansuunta.POHJOINEN).forEach(reitti -> System.out.println(reitti.toString()));
    }

    public static ArrayList<String> pisteellisetLauseet(ArrayList<String> lauseet) {
        return lauseet.stream().map(lause -> lause.toCharArray()).filter(lause -> lause[lause.length - 1] == '.').map(lause -> String.valueOf(lause)).collect(Collectors.toCollection(ArrayList::new));
    }

  //  public static ArrayList<String> pisteellisetLauseet(ArrayList<String> lauseet) {
    //    return lauseet.stream().map(lause -> lause.toCharArray()).filter(lause -> lause[lause.length - 1] == '.').map(lause -> lause.toString()).collect(Collectors.toCollection(ArrayList::new));
    //}
    //lause.toString() testaus

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luku = Integer.parseInt(lukija.nextLine());
            if (luku == -1) break;
            else lista.add(luku);
        }
        System.out.println("Summa: " + lista.stream().mapToInt(luku -> luku).sum());
        System.out.println("Keskiarvo: " + lista.stream().mapToInt(luku -> luku).average().getAsDouble());
        System.out.println("Minimi: " + lista.stream().mapToInt(luku -> luku).min().getAsInt());
        System.out.println("Maksimi: " + lista.stream().mapToInt(luku -> luku).max().getAsInt());

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

        public String toString() {
            return "Suunta: " + suunta + ", pituus: " + pituus;
        }
    }


    enum Ilmansuunta {
        POHJOINEN, ETELA, ITA, LANSI
    }

    class Jaakiekkoilija {
        private String nimi;
        private int maalit;
        private int syotot;

        public Jaakiekkoilija(String nimi, int maalit, int syotot) {
            this.nimi = nimi;
            this.maalit = maalit;
            this.syotot = syotot;
        }

        public String getNimi() {
            return nimi;
        }

        public int getMaalit() {
            return maalit;
        }

        public int getSyotot() {
            return syotot;
        }


        public String toString() {
            return nimi + ", " + maalit + " maalia ja " + syotot + " syöttöä.";
        }
    }
}
