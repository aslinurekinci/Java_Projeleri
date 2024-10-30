package b1_ifelseblokları;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lütfen yaşınızı giriniz:");
		Scanner scanner = new Scanner(System.in);
		int yas = scanner.nextInt();

		if (yas >= 18) {
			System.out.println("içeri girebilirsiniz.başarılı");
		} else
			System.out.println("yaşınızın 18'den büüyk olması gerekir.");
	}

}
