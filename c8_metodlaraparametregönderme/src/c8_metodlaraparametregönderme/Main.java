package c8_metodlaraparametregönderme;

public class Main {
	
	public static void selamlama(String isim) {
		System.out.println("selamlar  "+isim);
	}
	public static void toplama(int a,int b,int c) {
		System.out.println("toplamları  "+(a+b+c));
	}

	public static void main(String[] args) {
		 selamlama("aslınur");
         selamlama("zeynep");
         toplama(3,4,5);
	}

}
