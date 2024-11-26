package javaDersleri;

import java.util.Scanner;

public class javaDersleri13 {

	public static void main(String[] args) {
		// for döngüsüyle girilen sayıların asal olup olmadığını bulan bir for döngüsü örneği yaptım

		Scanner oku = new Scanner(System.in);
		int sayi1;
		boolean asal = true;
		do {
				System.out.println("Lutfen pozitif bir sayi giriniz");
				sayi1 = oku.nextInt();
	}while(sayi1 < 2);
		
		for(int i = 2; i < sayi1;i++) {
			if(sayi1 %i == 0 ) {
				asal= false;
				break;
			}
			
		}
		if (asal) {
			System.out.println("Girilen sayi: " + sayi1 + " asaldır");
		} else {
			System.out.println("Girilen sayi: " + sayi1 + " asal degildir");
			
		}
}
}
