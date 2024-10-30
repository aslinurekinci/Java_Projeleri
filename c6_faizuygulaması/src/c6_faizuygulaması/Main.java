package c6_faizuygulaması;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bankamıza hoşgeldiniz.faiz oranı %6");
		int anapara, vade;
		System.out.println("yatırmak istediğiniz tutarı giriniz:");
		anapara = scanner.nextInt();
		System.out.println("paranızı kaç yıl vadeli yatırmak istiyorsunuz?:");
		vade = scanner.nextInt();

		double toplampara = anapara;
		double faizoranı = 0.06;

		for (int i = 1; i <= vade; i++) {
			toplampara = (toplampara * faizoranı) + toplampara;
			System.out.println(i + ".yılın sonunda toplam para:" + toplampara);

		}

	}

}
