package joma;

import java.util.Objects;

public class ville {

}

class Opiskelija {
    private String nimi;
    private String opiskelijanumero;
    private int opintopisteet;

    public Opiskelija(String nimi, String opiskelijanumero, int opintopisteet) {
        this.nimi = nimi;
        this.opiskelijanumero = opiskelijanumero;
        this.opintopisteet = opintopisteet;
    }

    // Havainnointimetodit kaikille attribuuteille


    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    class Elokuva {
        private String ohjaaja;
        private String nimi;
        int kesto;

        public Elokuva(String ohjaaja, String nimi, int kesto) {
            this.ohjaaja = ohjaaja;
            this.nimi = nimi;
            this.kesto = kesto;
        }

        

  


	

	







		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Elokuva other = (Elokuva) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (kesto != other.kesto)
				return false;
			if (nimi == null) {
				if (other.nimi != null)
					return false;
			} else if (!nimi.equals(other.nimi))
				return false;
			if (ohjaaja == null) {
				if (other.ohjaaja != null)
					return false;
			} else if (!ohjaaja.equals(other.ohjaaja))
				return false;
			return true;
		}








		@Override
        public String toString() {
            return nimi + " (" + ohjaaja + "), " + kesto + " min.";
        }



		private Opiskelija getEnclosingInstance() {
			return Opiskelija.this;
		}
    }
}
