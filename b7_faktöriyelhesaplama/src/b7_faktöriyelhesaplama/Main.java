package b7_faktöriyelhesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen faktöriyeli alınacak sayıyı giriniz:");
		int sayi = scanner.nextInt();
		int fak = 1;

		for (int i = 1; i <= sayi; i++)
			fak *= i;
		System.out.println("sayının faktöriyeli:" + fak);

	}

}
