package d7_OOP_atmprojesi;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Atm {
	public void calis(Hesap hesap) {

		Login login = new Login();
		Scanner scanner = new Scanner(System.in);
		System.out.println("bankamıza hoşgeldiniz");
		System.out.println("************************");
		System.out.println("kullanıcı girişi:");
		System.out.println("************************");

		int giris_hakki = 3;

		while (true) {
			if (login.login(hesap)) {

				System.out.println(" giriş başarılı");
				break;
			} else {
				System.out.println("giriş başarısız");
				giris_hakki -= 1;
				System.out.println("kalan giriş hakkı: " + giris_hakki);

			}
			if (giris_hakki == 0) {
				System.out.println("girş hakkınız bitti");
				return;
			}

		}
		System.out.println("****************************");

		String islemler = "1.bakiye görüntüleme \n" + "2.para yatırma \n" + "3.para çekme \n"
				+ "çıkış için q'ya basınız...";

		System.out.println(islemler);

		System.out.println("****************************");

		while (true) {
			System.out.println("işlemi seçiniz:");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				break;

			} else if (islem.equals("1")) {
				System.out.println("bakiyeniz: " + hesap.getBakiye());
			} else if (islem.equals("2")) {
				System.out.println("yatırmak istediğiniz tutarı giriniz:");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.parayatir(tutar);
			} else if (islem.equals("3")) {
				System.out.println("çekmek istediğiniz tutarı giriniz");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paracek(tutar);

			} else {
				System.out.println("geçersiz işlem..");
			}

		}

	}
}
