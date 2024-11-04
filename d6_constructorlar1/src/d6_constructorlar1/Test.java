package d6_constructorlar1;

public class Test {

	public static void main(String[] args) {
		Acoount acoount1 = new Acoount();

		Acoount acoount2 = new Acoount("12345678", 1000, "aslınur", "aslinurekin@gmail.com", "24039740");

		acoount2.parayatir(500);

		acoount2.paracekme(800);

	}

}
