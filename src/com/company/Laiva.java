package com.company;

public class Laiva {

    private String nimi;
    private double pituus;
    private double syväys;
    private double nopeus; //solmuina

    public Laiva(String nimi, double pituus, double syväys, double nopeus) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.syväys = syväys;
        this.nopeus = nopeus;
    }

    public static void main(String[] args) {
        Laiva paatti = new Laiva("jorma", 15, 14, 15);
        System.out.println("Matka tunneissa: " + matkanKesto(30000, paatti));

    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getSyväys() {
        return syväys;
    }

    public void setSyväys(double syväys) {
        this.syväys = syväys;
    }

    public double getNopeus() {
        return nopeus;
    }

    public void setNopeus(double nopeus) {
        this.nopeus = nopeus;
    }

    public static double matkanKesto(double matka, Laiva laiva) {
        double nopeusMetreinaSekunnissa = laiva.nopeus * 0.51;

        double matkaSekunneissa = matka / nopeusMetreinaSekunnissa;
        double matkaTunneissa = matkaSekunneissa / (60 * 60);
        return matkaTunneissa;
    }


    class Rahtilaiva extends Laiva {
        private double kapasiteetti;
        private double rahti;

        public Rahtilaiva(String nimi, double pituus, double syväys, double nopeus, double kapasiteetti, double rahti) {
            super(nimi, pituus, syväys, nopeus);
            this.kapasiteetti = kapasiteetti;
            this.rahti = rahti;
        }

        public double getKapasiteetti() {
            return kapasiteetti;
        }

        public void setKapasiteetti(double kapasiteetti) {
            this.kapasiteetti = kapasiteetti;
        }

        public double getRahti() {
            return rahti;
        }

        public void setRahti(double rahti) {
            if (rahti <= kapasiteetti) {
                this.rahti = rahti;

                double rahtiProsentti = rahti / kapasiteetti;
                setNopeus(nopeus * (1 - rahtiProsentti));

            }
        }
    }

    class Autolautta extends Laiva {
        private final int kapasiteetti;
        private int matkustajamäärä;
        private int ajoneuvojenmäärä;

        public Autolautta(String nimi, double pituus, double syväys, double nopeus, int kapasiteetti, int matkustajamäärä, int ajoneuvojenmäärä) {
            super(nimi, pituus, syväys, nopeus);
            this.kapasiteetti = kapasiteetti;
            this.matkustajamäärä = matkustajamäärä;
            this.ajoneuvojenmäärä = ajoneuvojenmäärä;
        }

        public int getKapasiteetti() {
            return kapasiteetti;
        }

        public int getMatkustajamäärä() {
            return matkustajamäärä;
        }

        public void setMatkustajamäärä(int matkustajamäärä) {
            if (matkustajamäärä + getAjoneuvojenmäärä() * 10 <= kapasiteetti) {
                this.matkustajamäärä = matkustajamäärä;
            }
        }

        public int getAjoneuvojenmäärä() {
            return ajoneuvojenmäärä;
        }

        public void setAjoneuvojenmäärä(int ajoneuvojenmäärä) {
            if (ajoneuvojenmäärä * 10 + getMatkustajamäärä() <= kapasiteetti) {
                this.ajoneuvojenmäärä = ajoneuvojenmäärä;
            }
        }
    }
}



