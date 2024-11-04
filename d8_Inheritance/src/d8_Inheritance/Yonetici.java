package d8_Inheritance;

public class Yonetici extends Calisan { // subclass denir
	private int sorumlu_kisi;// extra özellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		/*
		 * this.isim=isim; this.maas=maas; this.departman=departman; bunlar
		 * calisan.javada private tanımlandıkları için erişilemiyor.
		 */
		super(isim, maas, departman);// calisan.javanın içindeki constructor çağrıldı..
		this.sorumlu_kisi = sorumlu_kisi;

	}

	public void zamyap(int zam_miktarı) {
		System.out.println("çalışanlara " + zam_miktarı + "zam yapıldı");
	}

	@Override
	public void bilgilerigöster() {
		super.bilgilerigöster();
		System.out.println("sorumlu kişi: " + sorumlu_kisi);
	}

}
