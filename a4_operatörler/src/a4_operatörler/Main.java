package a4_operatörler;

public class Main {

	public static void main(String[] args) {
		int a = 4;
		a = a + 2;
		System.out.println(a);
		int b = 3;
		b = b * 3;// b*=3;
		System.out.println(b);
		a = a + 1;
		/*
		 * bunun yerine kısayol olarak a++ diyebiliriz burda da a++ ile ++a arasındaki
		 * farkı bilmen gerekiyor.aynı şekilde azaltma işlemi yaparken de a-- ile --a
		 * arasındaki farkı bil biz bunlara postfix ve prefix gösterim diyoruz.
		 */
		System.out.println(a);
	}

}
