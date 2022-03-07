package com.company;

import java.util.ArrayList;

public class Generics {

    class Monistaja<T> {
        private T alkio;

        public Monistaja(T alkio) {
            this.alkio = alkio;
        }

        public T getAlkio() {
            return alkio;
        }

        public void setAlkio(T alkio) {
            this.alkio = alkio;
        }

        public ArrayList<T> annaMonta(int maara) {
            ArrayList<T> newList = new ArrayList<>();
            for (int i = 0; i < maara; i++) {
                newList.add(alkio);
            }
            return newList;
        }
    }

    class Jono<T> {
        private ArrayList<T> alkiot;

        public Jono() {
            alkiot = new ArrayList<>();
        }

        public void lisaa(T alkio) {
            alkiot.add(0, alkio);

        }//

        public T poista() {
            T alkio = alkiot.get(alkiot.size() - 1);
            alkiot.remove(alkio);
            return alkio;
        }

        public boolean onkoAlkioita() {
            return !alkiot.isEmpty();
        }
    }

    interface Vaihtaja<T> {
        T vaihdaArvo(T arvo);
    }

    class MerkkijonoVaihtaja implements Vaihtaja<String> {
        private String alkio;

        public MerkkijonoVaihtaja(String alkio) {
            this.alkio = alkio;
        }

        @Override
        public String vaihdaArvo(String arvo) {
            String tempAlkio = alkio;
            alkio = arvo;
            return tempAlkio;
        }
    }

    class MinMax<T extends Comparable<T>> {
        ArrayList<T> array;

        public MinMax(ArrayList<T> array) {
            this.array = array;
        }

        public T pienin() {
            T pienin = array.get(0);
            for (T arrayAlkio : array) {
                if (arrayAlkio.compareTo(pienin) < 0){
                    pienin = arrayAlkio;
                }
            }
            return pienin;
        }

        public T suurin() {
            T suurin = array.get(0);
            for (T arrayAlkio : array) {
                if (arrayAlkio.compareTo(suurin) > 0){
                    suurin = arrayAlkio;
                }
            }
            return suurin;
        }
    }
}
