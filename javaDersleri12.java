package javaDersleri;

import java.util.Scanner;

public class javaDersleri12 {

	public static void main(String[] args) {
		/*Do while döngüleriyle sıfırdan büyük sayılar girilecek negatig sayı 
		girildiğinde program durucak ve girilen sayılardan 2'ye tam bölünenleri 
		toplayacak*/
		
		Scanner oku = new Scanner(System.in);
		int input,toplam = 0;
		
		do {
			System.out.println("Lutfen bir sayi giriniz: ");
			input = oku.nextInt();
			if(input % 2 == 0) {
				toplam += input;
			
			}
		}while(input > 0);
		
		System.out.println("Girilen çift sayilerin toplami "+ toplam );
	}

}
