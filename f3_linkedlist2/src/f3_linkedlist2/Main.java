package f3_linkedlist2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
		/*
		 * for(String s: gidilecek_yerler) { System.out.println(s);
		 * 
		 * }
		 */
		ListIterator<String> iterator = gidilecek_yerler.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {

		ListIterator<String> iterator = gidilecek_yerler.listIterator();

		while (iterator.hasNext()) {

			int karsilastir = iterator.next().compareTo(yeni); // burada alfabetik şekilde sıralanır

			if (karsilastir == 0) {
				// iki değer eşit
				System.out.println("listenizde zaten bu eleman bulunuyor.");

				return;

			} else if (karsilastir < 0) {
				// yeni değer iterator.next'ten daha büyük

			} else if (karsilastir > 0) {
				iterator.previous();
				iterator.add(yeni);

				return;
			}

		}
		iterator.add(yeni);

	}

	public static void main(String[] args) {

		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		sirali_ekle(gidilecek_yerler, "postane");
		sirali_ekle(gidilecek_yerler, "okul");

		/*
		 * gidilecek_yerler.add("postane");
		 * 
		 * gidilecek_yerler.add("market");
		 * 
		 * gidilecek_yerler.add("okul");
		 * 
		 * gidilecek_yerler.add("kütüphane");
		 * 
		 * gidilecek_yerler.add("spor salonu");
		 * 
		 * gidilecek_yerler.add("ev");
		 * 
		 * listeyi_bastir(gidilecek_yerler);
		 * 
		 * System.out.println("------------------------------------");
		 * 
		 * //gidilecek_yerler.add(4,"alışveriş merkezi");
		 * 
		 * //gidilecek_yerler.remove(3);
		 * 
		 * listeyi_bastir(gidilecek_yerler);
		 */

		listeyi_bastir(gidilecek_yerler);

	}

}
