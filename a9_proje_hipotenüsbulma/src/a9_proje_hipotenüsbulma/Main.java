package a9_proje_hipotenüsbulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 System.out.println("bir kenar giriniz");
		 Scanner scanner=new Scanner(System.in);
		 int a=scanner.nextInt();
		 System.out.println("bir kenar daha giriniz");
		 int b=scanner.nextInt();
		 double c=Math.sqrt(a*a+b*b);	
		 System.out.println("üçgenin hipotenüs uzunluğu:"+c);
	}

}
