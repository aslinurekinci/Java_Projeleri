package e6_forEachdöngüsü;

public class Main {

	public static void main(String[] args) {
		String[] array= {"elma","armut","kiraz"};
		int[] array2= {4,5,6,7};
		
		Deneme[] array3= {new Deneme("aslınur"),new Deneme("ekinci")};
		
		for(Deneme d:array3) {
			d.yaz();
		}
		
		for(int i: array2) {
			System.out.println(i);
		}
		
		for(String a: array) {
			System.out.println(a);
		}
	}

}
