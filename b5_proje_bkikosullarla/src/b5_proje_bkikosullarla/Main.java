package b5_proje_bkikosullarla;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lütfen kilonuzu giriniz:");
		Scanner scanner = new Scanner(System.in);
		int kilo = scanner.nextInt();
		System.out.println("lütfen boyunuzu giriniz");
		double boy = scanner.nextDouble();

		double bki = kilo / (boy * boy);
		System.out.println("beden kitle endexiniz" + bki);

		if (bki <= 18.5)
			System.out.println("zayıf");
		else if (bki > 18.5 && bki <= 25)
			System.out.println("normal");
		else if (bki > 25 && bki <= 30)
			System.out.println("fazla kilolu");
		else
			System.out.println("obez");
	}

}
