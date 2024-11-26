package javaDersleri;

import java.util.Scanner;

public class javaDersleri9 {

	public static void main(String[] args) {
		// Dairenin alanını ve çevresini hesaplayan basit bir proje yatım
		int r;
		double alan, hacim, pi = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dairenin yari capini giriniz ");
		r = input.nextInt();
		
		alan = 2 * pi * r ;
		hacim = pi * (r * r);
		
		System.out.printf("Dairenin alanı: %.2f\n", alan);
        System.out.printf("Dairenin hacmi: %.2f\n", hacim);
		
		
		  
		
		
		
		
	}

}
