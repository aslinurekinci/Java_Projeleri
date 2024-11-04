package e4_beybladeprogrami;

public class Dranza extends Beyblade {

	private String kutsalcanavar;

	public Dranza(String beybladeci, int donushizi, int saldirigucu, String kutsalcanavar) {
		super(beybladeci, donushizi, saldirigucu);
		this.kutsalcanavar = kutsalcanavar;

	}

	@Override
	public void kutsalcanavarortayacikar() {
		// TODO Auto-generated method stub
		System.out.println(getBeybladeci() + " " + kutsalcanavar + "'ı ortaya çıkarıyor...");
		System.out.println(getBeybladeci() + "'ın saldırısı: alev kılıcı");

	}

	@Override
	public void bilgilerigoster() {
		// TODO Auto-generated method stub
		super.bilgilerigoster();
		System.out.println("kutsal canavar adı:" + kutsalcanavar);
	}

}
