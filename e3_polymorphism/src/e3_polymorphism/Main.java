package e3_polymorphism;

class Hayvan {
	private String isim;

	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String konus() {
		return "hayvan konuşuyor. ";
	}

}

class Kedi extends Hayvan {

	public Kedi(String isim) {
		super(isim);

	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim() + "miyavlıyor";
	}

}

class Kopek extends Hayvan {

	public Kopek(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim() + "havlıyor";

	}

}

class At extends Hayvan {

	public At(String isim) {
		super(isim);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String konus() {
		// TODO Auto-generated method stub
		return this.getIsim() + "kişniyor.";
	}

}

public class Main {

	public static void konustur(Hayvan hayvan) {
		System.out.println(hayvan.konus());
	}

	public static void main(String[] args) {
//
//		Hayvan hayvan1 = new Kedi("tekir");
//		Hayvan hayvan2 = new Kopek("karabas");
//		Hayvan hayvan3 = new At("şahbatur");
//
//		System.out.println(hayvan1.konus());
//		System.out.println(hayvan2.konus());
//		System.out.println(hayvan3.konus());

		/*
		 * konustur(new Kedi("tekir")); konustur(new Kopek("karabaş"));
		 */

		// instanceof

		Kopek kopek = new Kopek("karabas");

		if (kopek instanceof Hayvan) {
			System.out.println("bu nesne hayvan sınıfdandır...");

		}

	}

}
