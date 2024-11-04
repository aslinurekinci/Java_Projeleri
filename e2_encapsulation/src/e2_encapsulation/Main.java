package e2_encapsulation;

public class Main {

	public static void main(String[] args) {
		Abone abone = new Abone();
//		abone.isim="aslınur ekinci";
//		abone.bakiye=200;
//		abone.sehir="istanbul";
//		
//		abone.dogalgaz_kullan(200);

		GelismisAbone gelismisabone = new GelismisAbone("aslınur", 200, "ankara");
		abone.bakiye_ogren();

	}

}
