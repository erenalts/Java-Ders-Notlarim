package javaDersleri;

import java.util.Scanner;

public class javaDersleri8 {

	public static void main(String[] args) {
		// Basit bir hesap makinesi yaptım
		
		int sayi1, sayi2, secim, islem;
		Scanner oku = new Scanner(System.in);
		
		while(true) {		
		System.out.println("Yapmak istediginiz islemi secin\n1 - Toplama\n2 - Cikarma\n3 - Carpma\n4 - Bolme \nSeciminiz: ");
		secim = oku.nextInt();
	
				if(secim == 1) {
						System.out.println("Bir sayi giriniz: ");
						sayi1 = oku.nextInt();
						
						System.out.println("ikinci sayiyi giriniz: ");
						sayi2= oku.nextInt();
					
					
					    System.out.println("Sonucunuz: " + (sayi1 + sayi2));
					    
				}
				
				else if(secim == 2) {
						System.out.println("Bir sayi giriniz: ");
						sayi1 = oku.nextInt();
						
						System.out.println("ikinci sayiyi giriniz: ");
						sayi2= oku.nextInt();
						
						
						System.out.println("Sonucunuz: " + (sayi1 - sayi2));
						
				}
				
				else if(secim == 1) {
						System.out.println("Bir sayi giriniz: ");
						sayi1 = oku.nextInt();
						
						System.out.println("ikinci sayiyi giriniz: ");
						sayi2= oku.nextInt();
						
						
						System.out.println("Sonucunuz: " + (sayi1 * sayi2));
						
				}
				
				else if(secim == 1) {
						System.out.println("Bir sayi giriniz: ");
						sayi1 = oku.nextInt();
						
						System.out.println("ikinci sayiyi giriniz: ");
						sayi2= oku.nextInt();
						
						
						System.out.println("Sonucunuz: " + (sayi1 / sayi2));
						
					}
				
				else {
						System.out.println("Gecersiz bir deger girdiniz tekrar deneyin");
		}
	}
		
	}

}
