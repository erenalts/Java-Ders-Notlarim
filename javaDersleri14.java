package javaDersleri;

import java.util.Scanner;

public class javaDersleri14 {

	public static void main(String[] args) {
		// Ebob ve ekok bulan bir program yazdım
		
		Scanner oku = new Scanner(System.in);
		
		int sayi1, sayi2, ebob = 1, ekok;
		System.out.println("lutfen iki sayi  girin: ");
		sayi1 = oku.nextInt();
		sayi2 = oku.nextInt();
		
		int min = (sayi1 < sayi2) ? sayi1 : sayi2; // if else yapısını daha kısa şekilde yazdım
		
		for(int i=min; i > 0; i--) {
			if((sayi1 % i == 0) && (sayi2 % i == 0)) {
				ebob = i;
				break;
			}
		}
	
	ekok = (sayi1 * sayi2) / ebob;
	System.out.println(sayi1 + " ve " + sayi2 + " sayilarin ekok " + ekok);
	System.out.println(sayi1 + " ve " + sayi2 + " sayilarin ebob " + ebob);}

}
