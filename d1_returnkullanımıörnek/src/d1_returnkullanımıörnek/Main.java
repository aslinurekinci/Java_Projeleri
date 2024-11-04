package d1_returnkullanımıörnek;

public class Main {
	public static int ikilecarp(int a) {
		return a*2;
		
	}
	public static int ikiletopla(int a) {
		return a+2;
	} 
	public static int dörtilecarp(int a) {
		return a*4;
	}

	public static void main(String[] args) {
		System.out.println("sonuç:"+dörtilecarp(ikiletopla(ikilecarp(8))));
			
	

	}

}
