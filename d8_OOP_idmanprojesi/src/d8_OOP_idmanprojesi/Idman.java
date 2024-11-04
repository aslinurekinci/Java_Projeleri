package d8_OOP_idmanprojesi;

public class Idman {

	private int burpee_sayisi;
	private int pushup_sayisi;
	private int situp_sayisi;
	private int squat_sayisi;

	public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
		this.setBurpee_sayisi(burpee_sayisi);
		this.setPushup_sayisi(pushup_sayisi);
		this.setSitup_sayisi(situp_sayisi);
		this.setSquat_sayisi(squat_sayisi);
	}

	public int getSquat_sayisi() {
		return squat_sayisi;
	}

	public void setSquat_sayisi(int squat_sayisi) {
		this.squat_sayisi = squat_sayisi;
	}

	public int getSitup_sayisi() {
		return situp_sayisi;
	}

	public void setSitup_sayisi(int situp_sayisi) {
		this.situp_sayisi = situp_sayisi;
	}

	public int getPushup_sayisi() {
		return pushup_sayisi;
	}

	public void setPushup_sayisi(int pushup_sayisi) {
		this.pushup_sayisi = pushup_sayisi;
	}

	public int getBurpee_sayisi() {
		return burpee_sayisi;
	}

	public void setBurpee_sayisi(int burpee_sayisi) {
		this.burpee_sayisi = burpee_sayisi;
	}
	
	public void hareketyap(String harekettürü,int sayi) {
		if(harekettürü.equals("burpee")) {
			burpeeyap(sayi);
		}
		else if(harekettürü.equals("pushup")) {
			pushupyap(sayi);
		}
		else if(harekettürü.equals("pushup")) {
			pushupyap(sayi);
		}else if(harekettürü.equals("situp")) {
			situpyap(sayi);
		}
		else if(harekettürü.equals("squat")) {
			squatyap(sayi);
		}
		else {
			System.out.println("geçersiz hareket seçtiniz...");
		}
			
		
	}

}

