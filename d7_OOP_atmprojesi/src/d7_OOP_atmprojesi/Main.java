package d7_OOP_atmprojesi;

public class Main {

	public static void main(String[] args) {
		Atm atm = new Atm();

		Hesap hesap = new Hesap("aslı nur ekinci", "12345", 1000);

		atm.calis(hesap);
		System.out.println("programdan çıkılıyor...");

	}
}
