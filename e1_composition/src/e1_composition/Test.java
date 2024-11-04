package e1_composition;

public class Test {
	public static void main(String[] args) {
		Resolution resolution=new Resolution(1920,1080);
		Monitor monitor=new Monitor("vs197de","asus","18.5",resolution);
		
		Kasa kasa=new Kasa("shadow blade","shadow","temperli cam");
		Anakart anakart=new Anakart("b250-pro","asus",10,"windows10");
		 
		Bilgisayar pc=new Bilgisayar(monitor,kasa,anakart);
		
		 pc.getKasa().bilgisayarı_ac();
		 pc.getMonitor().monitoru_kapat();
		 pc.getAnakart().isletim_sistemi_yükle("ubuntu 16.04");
		
	}

}
