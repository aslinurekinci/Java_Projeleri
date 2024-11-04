package f2_linkedlist1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> diller= new ArrayList<String>();
		
		diller.add("java");
		diller.add("php");
		diller.add("python");
		diller.add("kotlin");
		diller.add("c#");
		
		/*for(int i=0; i<diller.size(); i++) {
			System.out.println(diller.get(i));
		}
		*/
		
	for(String s:diller) {
		System.out.println(s);
	}
	
	System.out.println("-----------------------");
	diller.add(1,"c++");
	
	for(String s:diller) {
		System.out.println(s);
	}
	
	
	/* şimd linkedlistler arraylistlere göre daha avantajlı ekleme çıkarma bakımından 
	 * bellekte extra performans istemiyor ama dezavantajı ise bellekte arraylistlere göre daha fazla 
	 * yer kaplamasıdır
	 */
	
	
				
		

	}

}
