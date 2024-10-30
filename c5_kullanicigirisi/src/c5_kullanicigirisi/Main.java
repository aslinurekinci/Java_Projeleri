package c5_kullanicigirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int giris_hakki = 3;
		String sys_kullanici_adi = "aslınur";
		String sys_parola = "12345";
		System.out.println("**********************");
		System.out.println("kullanici girisin hoşgeldiniz...");
		System.out.println("**********************");

		while (true) {
			System.out.println("kullanici adi:");
			String kullanici = scanner.nextLine();
			System.out.println("parola:");
			String parola = scanner.nextLine();
			
			if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
				
				System.out.println("hoşgeldiniz.."+ kullanici);
				break;
				
			}else if(kullanici.equals(sys_kullanici_adi)&& !parola.equals(sys_parola)) {
              System.out.println("parolanız yanlış.tekrar deneyiniz.");
			  giris_hakki-=1;
			  
			}else if(!kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)) {
				System.out.println("kullanici adınız yanlış.tekrar deneyiniz");
				giris_hakki-=1;
				
				
			}else {
				System.out.println("kullanıcı adınız ve parolanız yanlış.tekrar deneyiniz.");
				giris_hakki-=1;
			}
			
			if(giris_hakki==0) {
				System.out.println("giris hakkınız sonlandı.sistemden atıldınız.");
				break;
			}

		}

	}

}
