package e7_arraylist;

import java.util.ArrayList;

public class Main {
	public static void yazdir(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println("element  " + (i + 1 + " :" + a.get(i)));

		}
	}

	public static void main(String[] args) {
		ArrayList<String> arraylist = new ArrayList();

		arraylist.add("metallica");
		arraylist.add("gun's roses");
		arraylist.add("black sabbath");
		arraylist.add("iron maiden");
		arraylist.add("megadeth" + "");

//		System.out.println(arraylist.get(0));
//		System.out.println(arraylist.get(3));
//		
//		System.out.println(arraylist.size());

//		arraylist.remove("metallica"); 
//         arraylist.remove(1);

//		System.out.println(arraylist.indexOf("metallica"));// hangi indexte olduğunu öğrenmek için yazdım
//		System.out.println(arraylist.lastIndexOf("metallica"));// diğer metallicanın indexi için yazdım

//		arraylist.set(4,"megadeth");// index ve yeni değer vererek güncelleme işine yarar

//		for(int i=0; i<arraylist.size();  i++) {
//			System.out.println(arraylist.get(i));
//			
//		}

		yazdir(arraylist);

	}

}
