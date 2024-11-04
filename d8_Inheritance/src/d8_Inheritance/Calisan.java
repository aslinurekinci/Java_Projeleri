package d8_Inheritance;

public class Calisan {// superclass veya baseclass denir.
	private String isim;
	private int maas;
	private String departman;

	public Calisan(String isim, int maas, String departman) {
		this.setIsim(isim);
		this.setMaas(maas);
		this.setDepartman(departman);
	}

	public void calis() {
		System.out.println("çalışan çalışıyor..");

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void bilgilerigöster() {
		System.out.println("isim: " + getIsim());
		System.out.println(" maaş: " + getMaas());
		System.out.println("departman:" + getDepartman());

	}

	public void depertman_degistir(String yeni_departman) {
		System.out.println("departman değiştiriliyor...;");
		this.setDepartman(yeni_departman);

		System.out.println("yeni departmanınız: " + this.getDepartman());

	}
	
	

}
