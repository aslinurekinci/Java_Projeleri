package d7_OOP_atmprojesi;

import java.util.Scanner;

public class Login {
	public boolean login(Hesap hesap) {
		Scanner scanner = new Scanner(System.in);
		String kullaniciad;
		String parola;

		System.out.println("kullanıcı adı: ");
		kullaniciad = scanner.nextLine();
		System.out.println("parolayı giriniz: ");
		parola = scanner.nextLine();

		if (hesap.getKullaniciad().equals(kullaniciad) && hesap.getParola().equals(parola)) {
			return true;
		} else {
			return false;
		}
	}
}
