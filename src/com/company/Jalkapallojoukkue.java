package com.company;

import java.util.Objects;

public class Jalkapallojoukkue {
    private int maalivahdit;
    private int kenttäpelaajat;
    private String kotistadion;

    public Jalkapallojoukkue(int maalivahdit, int kenttäpelaajat, String kotistadion) {
        this.maalivahdit = maalivahdit;
        this.kenttäpelaajat = kenttäpelaajat;
        this.kotistadion = kotistadion;
    }

    public static void main(String[] args) {
        Jalkapallojoukkue fcYpa = new Jalkapallojoukkue(1, 17, "Ylivieska");
        fcYpa.setMaalivahdit(4);
        System.out.println(fcYpa.toString());
    }

    public int getMaalivahdit() {
        return maalivahdit;
    }

    public void setMaalivahdit(int maalivahdit) {
        if (maalivahdit <= 2 && maalivahdit > 0) {
            this.maalivahdit = maalivahdit;

        }
    }

    public int getKenttäpelaajat() {
        return kenttäpelaajat;
    }

    public void setKenttäpelaajat(int kenttäpelaajat) {
        if (kenttäpelaajat <= 20 && kenttäpelaajat > 0) {
            this.kenttäpelaajat = kenttäpelaajat;
        }
    }

    public String getKotistadion() {
        return kotistadion;
    }

    public void setKotistadion(String kotistadion) {
        this.kotistadion = kotistadion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Jalkapallojoukkue that)) return false;
        return maalivahdit == that.maalivahdit && kenttäpelaajat == that.kenttäpelaajat && Objects.equals(kotistadion, that.kotistadion);
    }


    @Override
    public String toString() {
        return "Jalkapallojoukkue{" +
                "maalivahdit=" + maalivahdit +
                ", kenttäpelaajat=" + kenttäpelaajat +
                ", kotistadion='" + kotistadion + '\'' +
                '}';
    }
}

class Jalkapallopelaaja {
    private String nimi;
    private String pelipaikka;

    public Jalkapallopelaaja(String nimi, String pelipaikka) {
        this.nimi = nimi;
        this.pelipaikka = pelipaikka;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getPelipaikka() {
        return pelipaikka;
    }

    public void setPelipaikka(String pelipaikka) {
        this.pelipaikka = pelipaikka;
    }

    @Override
    public String toString() {
        return "Jalkapallopelaaja{" +
                "nimi='" + nimi + '\'' +
                ", pelipaikka='" + pelipaikka + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jalkapallopelaaja that)) return false;
        return Objects.equals(nimi, that.nimi) && Objects.equals(pelipaikka, that.pelipaikka);
    }


}