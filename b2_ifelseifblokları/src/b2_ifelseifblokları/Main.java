package b2_ifelseifblokları;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lütfen 1-4 arası işlem numarası giriniz:");
		Scanner scanner = new Scanner(System.in);
		int islem = scanner.nextInt();

		if (islem == 1)
			System.out.println("1.işlem");
		else if (islem == 2)
			System.out.println("2.işlem");
		else if (islem == 3)
			System.out.println("3.işlem");
		else if (islem == 4)
			System.out.println("4.işlem");
		else
			System.out.println("geçerli işlem seçiniz");
	}

}
