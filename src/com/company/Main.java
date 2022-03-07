package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {

    public static void main(String args[]) {

    }

    public static boolean onkoKarkausvuosi(int vuosi) {
        if (vuosi % 4 == 0 && vuosi % 400 == 0) {
            return true;
        } else if (vuosi % 4 == 0 && vuosi % 100 == 0) {
            return false;
        } else if (vuosi % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void karkausvuodet() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna alku: ");
        int alku = Integer.valueOf(lukija.nextLine());
        System.out.print("Anna loppu: ");
        int loppu = Integer.valueOf(lukija.nextLine());

        for (int i = alku; i < loppu; i++) {
            boolean bool = onkoKarkausvuosi(i);
            if (bool == true) {
                System.out.println(i + " on karkausvuosi");
            }
        }

    }

    public static char keskimerkki(String jono) {
        if (jono.length() % 2 == 0) {
            return '-';
        } else {
            return jono.charAt(jono.length() / 2 + 1);
        }
    }

    public static String lopustaAlkuun(String jono) {
        String rev = "";

        for (int i = jono.length() - 1; i >= 0; i--) {
            rev = rev + jono.charAt(i);
        }
        return rev;
    }

    public static void substr() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String jono = lukija.nextLine();
        for (int i = 0; i < jono.length(); i++) {
            System.out.println(jono.substring(0, i));

        }


    }

    public static String korjaa(String todistus) {
        String uusi = todistus.replace("neljä", "kahdeksan");
        return uusi;
    }

    public static String poistaVokaalit(String sana) {
        String[] vocals = {"a", "e", "i", "o", "u", "y", "å", "ä", "ö"};
        for (int i = 0; i < vocals.length; i++) {
            if (sana.contains(vocals[i]) == true) {
                sana = sana.replace(vocals[i], "");
            }
        }
        return sana;
    }

    public static void lista() {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            luvut.add(luku);

        }

        System.out.println(luvut);
    }

    public static int suurinAlkio(ArrayList<Integer> luvut) {
        int isoin = luvut.get(0);
        for (int luku : luvut) {
            if (luku > isoin) {
                isoin = luku;
            }

        }
        return isoin;
    }

    public static int laske(int luku1, int luku2, String operaattori) {
        if (operaattori.equals("+")) {
            return luku1 + luku2;
        } else if (operaattori.equals("-")) {
            return luku1 - luku2;

        } else if (operaattori.equals("*")) {
            return luku1 * luku2;

        } else if (operaattori.equals("/")) {
            return luku1 / luku2;

        } else {
            return 0;
        }
    }

    public static void nimi() {
        ArrayList<String> nimilista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            int o = 0;
            System.out.print("Anna nimi: ");
            String newname = lukija.nextLine();
            if (newname.equals("lopeta")) {
                break;
            }

            for (String nimi : nimilista) {
                if (newname.equals(nimi)) {
                    o = 1;
                }


            }
            if (o == 1) {
                System.out.println("Nimi on jo annettu");
            } else {
                nimilista.add(newname);
                System.out.println("Moi, " + newname);
            }


        }

        System.out.println("Nimet: " + nimilista);


    }

    public static void lisaaSumma(ArrayList<Integer> luvut) {
        int sum = 0;
        for (int luku : luvut) {
            sum += luku;
        }
        luvut.add(sum);
    }

    public static void poistaNegatiiviset(ArrayList<Integer> luvut) {
        luvut.removeIf(val -> val < 0);
    }

    public static int toiseksiPienin(ArrayList<Integer> luvut) {
        ArrayList<Integer> uudetluvut = new ArrayList<>();
        uudetluvut.addAll(luvut);
        Collections.sort(uudetluvut);
        return uudetluvut.get(1);

    }

    public static ArrayList<Integer> muodostaLista(int alku, int loppu) {
        ArrayList<Integer> lista = new ArrayList<>();
        if (alku < loppu) {
            for (int i = alku; i < loppu; i++) {
                lista.add(i);
            }
        } else {

            for (int i = alku; i > loppu; i--) {
                lista.add(i);

            }

        }

        return lista;
    }

    public static ArrayList<Integer> lukuLista(ArrayList<String> lista) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (String i : lista) {

            newList.add(Integer.valueOf(i));
        }

        return newList;
    }

//    public static ArrayList<Integer> yhdista(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
//        ArrayList<Integer> newList = new ArrayList<>();
//        for (int i : lista1) {
//            newList.add(i);
//        }
//        for (int i : lista2) {
//            newList.add(i);
//        }
//        Collections.sort(newList);
//        return newList;
//    }

    public static int summa(int[] luvut) {
        int sum = 0;
        for (int i : luvut) {
            sum += i;
        }
        return sum;
    }

    public static double[] uusiTaulukko(ArrayList<Double> lista) {
        double[] newArr = new double[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            newArr[i] = lista.get(i);
        }

        return newArr;
    }

    public static HashMap<String, Integer> yhdista(ArrayList<String> nimet, ArrayList<Integer> arvosanat) {
        HashMap<String, Integer> pituudet = new HashMap<>();
        for (int i = 0; i < nimet.size(); i++) {
            pituudet.put(nimet.get(i), arvosanat.get(i));
        }


        return pituudet;
    }

//    public static String kylminKaupunki(HashMap<String, Double> lampotilat)
//
//    {
//        double kylmin = lampotilat.get(0);
//        for (String avain : lampotilat.keySet()) {
//
//        }
//    }

    public static ArrayList<Integer> lottonumerot(Random r) {

        ArrayList<Integer> lotto = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            lotto.add(r.nextInt(40));
        }
        return lotto;

    }

    public static StringBuilder nelio(int sivunPituus) {
        StringBuilder string = new StringBuilder("");
        for (int i = 0; i < sivunPituus; i++) {
            for (int j = 0; j < sivunPituus; j++) {
                string.append("*");
            }
            string.append("\n");

        }
        return string;

    }

    public static ArrayList<String> luePelaajat() {
        ArrayList<String> nimet = new ArrayList<>();
        File tiedosto = new File("pelaajat.txt");
        try (Scanner lukija = new Scanner(tiedosto)) {

            while (lukija.hasNextLine()) {
                nimet.add(lukija.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Tapahtui virhe!");
        }
        return nimet;
    }

    public static ArrayList<Integer> kaikkiArvot() {
        ArrayList<Integer> luvut = new ArrayList<>();
        File tiedosto = new File("luvut.csv");
        try (Scanner lukija = new Scanner(tiedosto)) {
            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                String[] palat = rivi.split(",");

                for (String pala : palat) {
                    int luku = Integer.valueOf(pala);
                    luvut.add(luku);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        return luvut;
    }

    public static void lisaaNumero(HashMap<String, String> numerot) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Nimi: ");
        String nimi = lukija.nextLine();

        System.out.print("Numero: ");
        String numero = lukija.nextLine();
        numerot.put(nimi, numero);
    }
}




