package javaDersleri;

import java.util.Scanner;

public class javaDersleri15 {

	public static void main(String[] args) {
		// metotlara giriş yaptım
		//f(x)= ( x + 2 ) * 6
		Scanner oku = new Scanner(System.in);
		int x ;
		System.out.println("islem yapılmasini istediğiniz sayiyi girin");
		x = oku.nextInt();
		f(x);
		

	}
	
	static void f(int x) {
		int result = (x + 2) * 6;
		System.out.println(result);
	}

}
