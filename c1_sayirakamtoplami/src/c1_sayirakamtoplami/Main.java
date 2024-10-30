package c1_sayirakamtoplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayı giriniz");
		int sayi=scanner.nextInt();
        int toplam=0;
		do {
			toplam+=sayi%10;
			 sayi=sayi/10;
			
			 
		}while(sayi>0);
		
		System.out.println("sayının rakamları toplamı:"+ toplam);
	}

}
