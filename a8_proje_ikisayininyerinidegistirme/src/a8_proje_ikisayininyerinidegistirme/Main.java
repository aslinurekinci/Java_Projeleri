package a8_proje_ikisayininyerinidegistirme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	System.out.println("bir sayı giriniz");
	Scanner scanner=new Scanner(System.in);
	int sayi1=scanner.nextInt();
	System.out.println("bir sayı daha giriniz");
	int sayi2=scanner.nextInt();
	
	System.out.println("degistirme olmadan önce sayılar"+ sayi1+"\t"+sayi2 );
	
	int sayi3;
	sayi3=sayi1;
	sayi1=sayi2;
	sayi2=sayi3;
	
	System.out.println("değiştirmeden sonra sayılar"+sayi1+"\t"+sayi2);
	}

}
