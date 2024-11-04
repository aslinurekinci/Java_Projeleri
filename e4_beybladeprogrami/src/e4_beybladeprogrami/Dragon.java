package e4_beybladeprogrami;

public class Dragon extends Beyblade {
	private String kutsalcanavar;
	private String gizliyetenek;

	public Dragon(String beybladeci, int donushizi, int saldirigucu, String kutsalcanavar, String gizliyetenek) {
		super(beybladeci, donushizi, saldirigucu);
		this.kutsalcanavar = kutsalcanavar;
		this.gizliyetenek = gizliyetenek;
	}

	@Override
	public void kutsalcanavarortayacikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalcanavar + "'ı ortaya çıkarıyor...");
		System.out.println(getBeybladeci() + "'ın saldırısı: hayalet kasırgası");
	}

	@Override
	public void bilgilerigoster() {
		// TODO Auto-generated method stub
		super.bilgilerigoster();
		System.out.println("kutsal canavar adı:" + kutsalcanavar);
		System.out.println("gizli yetenek: " + gizliyetenek);
	}

}
