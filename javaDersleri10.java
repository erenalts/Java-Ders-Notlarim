package javaDersleri;

public class javaDersleri10 {

	public static void main(String[] args) {
		//2'den 100'e kadar olan sayıları yazdıran while döngüsü örneği yaptım
		
		int i = 1; // i'nin değerini tanımladım
		while(i <= 100) { //while döngüsüne i'nin değeri 100'e eşit ve küçük olana kadar işlemi devam ettirecek
			if (i % 2 == 0) { //girilen değer 2'ye kalansız bölünüyorsa ekrana yazdıracak
				System.out.println(i);
			}
			i++;
		}
		

	}

}
