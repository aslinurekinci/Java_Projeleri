package d8_Inheritance;

public class Yoneticii extends Calisan {
	
private  int sorumlu_kisi_sayisi;

  public Yoneticii(String ad,String soyad,int id,int sorumlu_kisi_sayisi) {
	  super(ad,id,soyad);
	  this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
  }

@Override
public void bilgilerigöster() {
	// TODO Auto-generated method stub
	super.bilgilerigöster();
	System.out.println("yöneticinin sorumlu olduğu kişi sayısı. "+sorumlu_kisi_sayisi);
}
public void zam_yap(int zam_miktarı) {
	System.out.println(this.getAd())+"çalışanlara"+zam_miktarı+"kadar zam yapıldı.");
}


}

