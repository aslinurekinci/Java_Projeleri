package c2_döngülerrleAtmprogramı;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 int bakiye=1000;
		String islemler= "1.işlem: bakiye öğrenme \n"+
		                  "2.işlem:para çekme \n"+
				           "3.işlem:para yatırma \n"+
		                    "çıkış için q'ya basınız";
		System.out.println("**********************");
		System.out.println(islemler);
		System.out.println("************************");
		
		while (true) {
			System.out.print("işlemi seçiniz:");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("programdan çıkılıyor..");
				break;
			} else if (islem.equals("1")) {
				System.out.println("bakiyeniz:"+bakiye);

			} else if (islem.equals("2")) {
				System.out.println("çekmek istediğiniz tutarı giriniz:");
				int tutar=scanner.nextInt();
				scanner.nextLine(); 
				
				if(bakiye-tutar<0) {
					System.out.println("yeterli bakiyeniz bulunmamaktadır.bakiyeniz:"+bakiye);
					
				}else {
					bakiye-=tutar; 
					System.out.println("yeni bakiyeniz:"+bakiye);
				}

			} else if (islem.equals("3")) {
				System.out.println("yatırmak istediğiiz tutarı giriniz");
                 int tutar=scanner.nextInt();
                 scanner.nextLine();
                 
                 bakiye+=tutar;
                 System.out.println("yeni bakiyeniz:"+ bakiye);
			} 
		}
	}

}
