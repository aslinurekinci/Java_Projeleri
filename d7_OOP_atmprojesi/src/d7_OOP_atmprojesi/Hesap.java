package d7_OOP_atmprojesi;

public class Hesap {
	private String kullaniciad;
	private String parola;
	private int bakiye;

	public Hesap(String kullaniciad, String parola, int bakiye) {
		this.setKullaniciad(kullaniciad);
		this.setParola(parola);
		this.setBakiye(bakiye);

	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getKullaniciad() {
		return kullaniciad;
	}

	public void setKullaniciad(String kullaniciad) {
		this.kullaniciad = kullaniciad;
	}

	public void parayatir(int tutar) {
		bakiye += tutar;
		System.out.println(" yeni bakiyeniz: " + bakiye);

	}

	public void paracek(int tutar) {
		if (bakiye - tutar < 0) {
			System.out.println("yeterli bakiyeniz bulunmamaktadır....");

		} else {
			bakiye -= tutar;
			System.out.println("yeni bakiyeniz:" + bakiye);

		}

	}

}
