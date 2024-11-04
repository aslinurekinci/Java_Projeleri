package e4_beybladeprogrami;

public class Beybladefabrikasi {
	public Beyblade beybladeuret(String beyblade_turu) {

		if (beyblade_turu.equals("dragon")) {
			return new Dragon("takao", 800, 300, "mavi ejderha", "kutsal canavarla konusma");
		} else if (beyblade_turu.equals("dranza")) {
			return new Dranza("kai", 600, 400, "kırmızı anka kuşu");
		} else if (beyblade_turu.equals("drayga")) {
			return new Dranza("rei", 800, 250, "beyaz kaplan");
		} else if (beyblade_turu.equals("draciel")) {
			return new Dranza("max", 400, 1000, "kara kaplumbağa");
		} else {
			return null;
		}

	}
}
