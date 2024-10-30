package b4_proje_maxsayibulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int a = scanner.nextInt();
		System.out.println("bir sayi giriniz");
		int b = scanner.nextInt();
		System.out.println("bir sayi giriniz");
		int c = scanner.nextInt();
		int maxdeger;

		if (a > b && a > c)
			maxdeger = a;
		else if (b > a && b > c)
			maxdeger = b;
		else
			maxdeger=c;
		
		System.out.println("girdiğiniz sayılardan en büyüğü:"+maxdeger);
	}

}
