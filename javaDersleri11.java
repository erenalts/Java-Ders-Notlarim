package javaDersleri;

import java.util.Scanner;

public class javaDersleri11 {

	public static void main(String[] args) {
		// kullanıcı negatif değer girene kadar sayı girmesini negatif sayıdan sonra da girilen sayıları toplayan bir program yaptım

		Scanner deger = new Scanner(System.in);
		int input,toplam = 0;
		
		while(true) {
			System.out.println("Lutfen bir sayi giriniz");
			input = deger.nextInt();
			
			if(input < 0) {
				System.out.println("Negatif sayi girdiniz !!!");
				
				break;
			}
			toplam += input;
		}
		System.out.println("Girilen sayiların toplamı : " + toplam);
	}

}
