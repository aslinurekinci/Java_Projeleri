package a7_proje_kilometretutar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lütfen gideceğiniz kilometreyi giriniz");
		Scanner scanner = new Scanner(System.in);
		double km = scanner.nextDouble();
		Scanner scaner = new Scanner(System.in);
		double fiyat = 10.50d;

		double tutar = km * fiyat;
		System.out.println("toplam tutar:" + tutar);

	}

}
