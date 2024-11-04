package e2_encapsulation;

public class GelismisAbone {
	private String isim;
	private int bakiye = 120;
	private String sehir;

	public GelismisAbone(String isim, int bakiye, String sehir) {
		this.isim = isim;
		if (bakiye >= 0 && bakiye <= 120) {
			this.bakiye = bakiye;
		}
		this.sehir = sehir;

	}

	public void dogalgaz_kullan(int miktar) {
		if ((this.bakiye - miktar) < 0) {
			System.out.println("yeterli bakiye bulunmamaktadır");
		} else {
			this.bakiye -= miktar;
			if (this.bakiye <= 0) {
				System.out.println(
						"bakiyeniz bitmiştir.lütfen  en yakın abone merkezine gidiniz." + "kredi limiti: 120TL");

			} else {
				System.out.println("yeni bakiye: " + bakiye);

			}
		}
	}

	public void bakiye_ogren() {
		System.out.println("bakiye: " + bakiye);
	}

}
