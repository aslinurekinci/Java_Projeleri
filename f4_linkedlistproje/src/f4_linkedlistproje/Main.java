package f4_linkedlistproje;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void islemleri_bastir() {
		System.out.println("0-işlemleri görntüle");
		System.out.println("1-bir sonraki şehre git");
		System.out.println("2-bir önceki şehre git");
		System.out.println("3-uygulamadan çık");

	}

	public static void sehirleri_turla(LinkedList<String> sehirler) {

		ListIterator<String> iterator = sehirler.listIterator();

		int islem;

		islemleri_bastir();

		Scanner scanner = new Scanner(System.in);

		if (!iterator.hasNext()) {
			System.out.println("herhangi bir şehir bulunmuyor.");

		}
		boolean cikis = false;
		boolean ileri = true;

		while (!cikis) {
			System.out.println("bir işlem seçiniz:");

			islem = scanner.nextInt();

			switch (islem) {
			case 0:
				islemleri_bastir();
				break;

			case 1:

				if (!ileri) {
					if (iterator.hasNext()) {

						iterator.next();
					}
					ileri = true;
				}
				if (iterator.hasNext()) {

					System.out.println("şehre gidiliyor." + iterator.next());

				} else {
					System.out.println("gidileceke şehir kalmadı.");
					ileri = true;
				}
				break;

			case 2:
				if (ileri) {
					if (iterator.hasPrevious()) {

						iterator.previous();
					} else {

						ileri = false;
					}
				}

				if (iterator.hasPrevious()) {

					System.out.println("şehre gidiliyor." + iterator.previous());

				} else {

					System.out.println("şehir turu başladı.");

				}
				break;

			case 3:
				cikis = true;
				System.out.println("uygulamadan çıkııyor.");
				break;

			}
		}

	}

	public static void main(String[] args) {
		LinkedList<String> sehirler = new LinkedList<String>();

		sehirler.add("ankara");
		sehirler.add("eskişehir");
		sehirler.add("afyon");
		sehirleri_turla(sehirler);

	}

}
