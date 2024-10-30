package c3_armstrongsayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("bir sayi giriniz:");
		int sayi=scanner.nextInt();
		System.out.println("basamak sayisi:");
        int basamak_sayisi=scanner.nextInt();
        
	   int gecici_sayi=sayi;
	   int toplam=0;
	   
	   do {
		   int basamak_degeri=gecici_sayi%10;
		   gecici_sayi/=10;
		   
		   toplam+=Math.pow(basamak_degeri, basamak_sayisi);
		   
		   
		   
		   
	   }while(gecici_sayi>0);
	   
	   if(sayi==toplam) {
		   System.out.println("girdiğiniz sayi armstrong bir sayıdır");
	   }else {
		   System.out.println("girdiğiniz sayi armstrong bir sayı değildir yeniden deneyiniz.");
	   }
	   
	}

}
