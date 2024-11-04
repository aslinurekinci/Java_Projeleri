package e4_beybladeprogrami;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// polymorphism kullanarak Beyblade Programı

		System.out.println("beyblade programına hoşgeldiniz.");
		System.out.println("çıkış için q'ya basınız");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("hngi beyblade'i üretmek istiyorsunuz: ");
			String islem = scanner.nextLine();
			if (islem.equals("q")) {
				System.out.println("programdan çıkılıyor ");
				break;
			} else {

				Beybladefabrikasi fabrika = new Beybladefabrikasi();
				Beyblade beyblade = fabrika.beybladeuret(islem);

				if (beyblade == null) {
					System.out.println("lütfen  geçerli bir beyblade ismi giriniz.");

				} else {
					beyblade.bilgilerigoster();
					beyblade.saldiri();
					beyblade.kutsalcanavarortayacikar();

				}

			}

		}

	}
}
