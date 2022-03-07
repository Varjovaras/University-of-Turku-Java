import java.security.Key;
import java.util.*;

public class Tentti {

    public static int laskePisteet(ArrayList<Asiakas> asiakkaat) {
        int pisteet = 0;
        for (Asiakas asiakas : asiakkaat) {
            if (asiakas.getClass() == VipAsiakas.class) {
                pisteet += asiakas.annaAsiakaspisteet();
                pisteet += ((VipAsiakas) asiakas).annaPlatinapisteet();
                pisteet += ((KantaAsiakas) asiakas).annaBonuspisteet();


            } else if (asiakas.getClass() == KantaAsiakas.class) {
                pisteet += asiakas.annaAsiakaspisteet();
                pisteet += ((KantaAsiakas) asiakas).annaBonuspisteet();
            } else {
                pisteet += asiakas.annaAsiakaspisteet();
            }

        }
        return pisteet;

    }

    //Kirjoita ohjelma, joka kysyy käyttäjältä kokonaislukuja. Kun käyttäjä syöttää luvun -1, ohjelma tulostaa sen luvun, jota käyttäjä syötti eniten. Tämän jälkeen ohjelman suoritus päättyy.
    //
    //Katso mallia tulostukseen esimerkkisuorituksesta. Huomaa myös, mitä tietorakenteita ohjelmassa on käytettävissä.
    //
    //Voit myös olettaa, että eniten syötetty luku on yksikäsitteinen - ts. että vain yhtä lukua on syötetty enemmän kuin muita.
    //
    //Esimerkki suorituksesta:
    //
    //Anna luku: 1
    //Anna luku: 2
    //Anna luku: 2
    //Anna luku: 2
    //Anna luku: -1
    //Eniten: 2


    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int luku = 0;
        Scanner lukija = new Scanner(System.in);

        while (true) {

            System.out.print("Anna luku: ");

            luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            if (map.containsKey(luku)) {
                int counter = map.get(luku) + 1;
                map.put(luku, counter);
            } else {
                map.put(luku, 1);
            }
        }
        int maxValueInMap = (java.util.Collections.max(map.values()));  // This will return max value in the HashMap
        for (java.util.Map.Entry<Integer, Integer> mapp : map.entrySet()) {  // Iterate through HashMap
            if (mapp.getValue() == maxValueInMap) {
                System.out.println("Eniten: " + mapp.getKey());
            }
        }
    }
}


class Rahayksikko {
    private String nimi;
    private double arvo;

    public Rahayksikko(String nimi, double arvo) {
        this.nimi = nimi;
        this.arvo = arvo;
    }

    public String getNimi() {
        return nimi;
    }

    public double getArvoEuroissa() {
        return arvo;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setArvoEuroissa(double arvo) {
        this.arvo = arvo;
    }

    @Override
    public String toString() {
        return nimi + " (" + arvo + ")";
    }

    ;
}

enum Viikonpaiva {
    MAANANTAI, TIISTAI, KESKIVIIKKO, TORSTAI, PERJANTAI, LAUANTAI, SUNNUNTAI
}

class Tenttipoikkeus extends Exception {

    public Tenttipoikkeus(String viesti) {
        super(viesti);
    }

}

interface Salaaja {
    String annaSalattuna();
}

class SalainenViesti implements Salaaja {
    private String salattu;

    public SalainenViesti(String salattu) {
        this.salattu = salattu;
    }

    @Override
    public String annaSalattuna() {
        char[] charArr = salattu.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : charArr) {
            if (Character.isLowerCase(c)) {
                c++;
                result.append(c);

            } else
                result.append(c);
        }
        return result.toString();
    }
}

class Asiakas {
    private String nimi;
    private String asiakasnumero;
    private int asiakaspisteet;

    public Asiakas(String nimi, String asiakasnumero, int asiakaspisteet) {
        this.nimi = nimi;
        this.asiakasnumero = asiakasnumero;
        this.asiakaspisteet = asiakaspisteet;
    }

    public int annaAsiakaspisteet() {
        return asiakaspisteet;
    }

    public String toString() {
        return nimi + " (" + asiakasnumero + "), asiakasp.:" + asiakaspisteet;
    }
}

class KantaAsiakas extends Asiakas {
    private int bonuspisteet;

    public KantaAsiakas(String nimi, String asiakasnumero, int asiakaspisteet, int bonuspisteet) {
        super(nimi, asiakasnumero, asiakaspisteet);
        this.bonuspisteet = bonuspisteet;
    }

    public int annaBonuspisteet() {
        return bonuspisteet;
    }

    public String toString() {
        return super.toString() + ", bonusp.: " + bonuspisteet;
    }
}

class VipAsiakas extends KantaAsiakas {
    private int platinapisteet;

    public VipAsiakas(String nimi, String asiakasnumero, int asiakaspisteet, int bonuspisteet, int platinapisteet) {
        super(nimi, asiakasnumero, asiakaspisteet, bonuspisteet);
        this.platinapisteet = platinapisteet;
    }

    public int annaPlatinapisteet() {
        return platinapisteet;
    }

    public String toString() {
        return super.toString() + ", platinap.: " + platinapisteet;
    }
}