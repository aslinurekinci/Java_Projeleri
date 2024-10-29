package a6_proje_bedenkitleendex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("lütfen kilonuzu giriniz:");
		Scanner scanner=new Scanner(System.in);
		int kilo=scanner.nextInt();
		System.out.println("lütfen boyunuzu giriniz");
		double boy=scanner.nextDouble();
		
		double bki=kilo/(boy*boy);
		System.out.println("beden kitle endexiniz"+bki);

	}

}
