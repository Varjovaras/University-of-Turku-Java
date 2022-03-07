import java.util.ArrayList;

public class Puhelut {
    public static ArrayList<Videopuhelu> jamesinPuhelut(ArrayList<Videopuhelu> puhelut) {
        ArrayList<Videopuhelu> uusiLista = new ArrayList<>();
        for (Videopuhelu puhelu : puhelut
        ) {
            if (puhelu.getHenkilo1().equals("James Bond") || puhelu.getHenkilo2().equals("James Bond")) {
                if (puhelu.isVideoPaalla()) {
                    uusiLista.add(puhelu);
                }
            }
        }
        return uusiLista;
    }


    class Puhelu {
        private String henkilo1;
        private String henkilo2;
        private int kestoMin;

        public Puhelu(String henkilo1, String henkilo2, int kestoMin) {
            this.henkilo1 = henkilo1;
            this.henkilo2 = henkilo2;
            this.kestoMin = kestoMin;
        }

        public String getHenkilo1() {
            return henkilo1;
        }

        public String getHenkilo2() {
            return henkilo2;
        }

        public int getKestoMin() {
            return kestoMin;
        }
    }

    class Videopuhelu extends Puhelu {
        private boolean videoPaalla;

        public Videopuhelu(String henkilo1, String henkilo2, int kestoMin, boolean videoPaalla) {
            super(henkilo1, henkilo2, kestoMin);
            this.videoPaalla = videoPaalla;
        }

        public boolean isVideoPaalla() {
            return videoPaalla;
        }

        public String toString() {
            return getHenkilo1() + " - " + getHenkilo2() + ", " + getKestoMin() + " min., video: " +
                    (videoPaalla ? "päällä" : "pois");
        }
    }
}