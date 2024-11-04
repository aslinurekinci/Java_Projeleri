package e4_beybladeprogrami;

public class Beyblade {
	private String beybladeci;
	private int donushizi;
	private int saldirigucu;

	public Beyblade(String beybladeci, int donushizi, int saldirigucu) {
		this.beybladeci = beybladeci;
		this.donushizi = donushizi;
		this.saldirigucu = saldirigucu;

	}

	public String getBeybladeci() {
		return beybladeci;
	}

	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}

	public int getDonushizi() {
		return donushizi;
	}

	public void setDonushizi(int donushizi) {
		this.donushizi = donushizi;
	}

	public int getSaldirigucu() {
		return saldirigucu;
	}

	public void setSaldirigucu(int saldirigucu) {
		this.saldirigucu = saldirigucu;
	}

	public void saldiri() {
		System.out.println(beybladeci + " " + saldirigucu + "ve" + donushizi + "ile saldırıyor.");

	}

	public void kutsalcanavarortayacikar() {
		System.out.println("bu beybladenin kutsal canavarı bulunmuyor..");
	}

	public void bilgilerigoster() {
		System.out.println("beybladeci isim: " + beybladeci);
		System.out.println("saldiri gücü: " + saldirigucu);
		System.out.println(" dçönüş hızı: " + donushizi);

	}

}
