package a5_inputalma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen yaşınızı giriniz");
		int yas = scanner.nextInt();

		/*
		 * double yas=scanner.nextDouble();
		 *  float yas=scanner.nextFloat();
		 * String ad=scanner.nextLine();
		 * 	
		 */
		System.out.println("yasiniz:" + yas);
	}

}
