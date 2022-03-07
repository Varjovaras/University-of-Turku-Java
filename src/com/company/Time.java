package com.company;


//aikaa mallintava luokka
//konstruktori kutsuu setTime(), parametrinä kolme kokonaislukua
//tulostaa kuukauden stringinä
//kuukausi enum
//kuukauden päivät enumin kautta
public class Time {
    enum Kuukausi {
        TAMMIKUU(31),
        HELMIKUU(29),
        MAALISKUU(28),
        HUHTIKUU(30),
        TOUKOKUU(31),
        KESÄKUU(30),
        HEINÄKUU(31),
        ELOKUU(31),
        SYYSKUU(30),
        LOKAKUU(31),
        MARRASKUU(30),
        JOULUKUU(31),
        ;
        private final int days;

        Kuukausi(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }


    }

    public static void main(String[] args) {
        Time aika = new Time(28, 2, 1900);
        System.out.println(aika.getMonth());
        System.out.println(kuukaudenNimi(12));
        System.out.println(aika.toString());
    }

    private int day;
    private int month;
    private int year;

    public Time(int day, int month, int year) {
        setTime(day, month, year);
    }

    public void setTime(int day, int month, int year) {
        if (month == 2 && day == 29 && !onkoKarkausVuosi(year)) {
            return;
        } else if (day < 32 && month < 13) {
            setDay(day, month);
            setMonth(month);
            setYear(year);
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day, int month) {

        Kuukausi oikeaKuukausi = kuukausiMethodi(month);
        if (day <= oikeaKuukausi.getDays()) {
            this.day = day;
        }
    }

    public String getMonth() {
        return kuukaudenNimi(month);
    }


    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static String kuukaudenNimi(int month) {
        Kuukausi oikeaKuukausi;
        return  kuukausiMethodi(month).toString();

    }

    public static Kuukausi kuukausiMethodi(int month) {
        int i = 1;
        Kuukausi[] kuukaudet = Kuukausi.values();

        for (Kuukausi kuukausi : kuukaudet
        ) {
            if (i == month) {
                return kuukausi;
            } else i++;
        }
        return null;
    }

    public static boolean onkoKarkausVuosi(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    @Override
    public String toString() {
        return "Päivämäärä on: " + getDay() + ". " + getMonth().toLowerCase() + "ta " + getYear();
    }
}
