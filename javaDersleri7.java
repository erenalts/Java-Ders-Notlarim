package javaDersleri;

public class javaDersleri7 {

	public static void main(String[] args) {
		// Stringlerle çalışmak
		
		String mesaj = "Bu gün hava çok güzel";
		System.out.println(mesaj);
		
		System.out.println("harf sayisi: " + mesaj.length()); //.length ifadesi uzunlugunu bildirir
		System.out.println("5. harfi "  + mesaj.charAt(4));    /*kelimeden sonra .charAt() ifadesinde parantez içine yazılan yazılan
		                                                       rakam kelimenin kaçıncı harfinde denk geliyorsa o harfi verir*/ 
		System.out.println(mesaj.concat("yaşasın"));          // mesaj değişkenin sonra istediğimiz ekleri getirmek için kullanırız
		System.out.println(mesaj.startsWith("B"));            //  değişkenin başladığı harfe bakılır doğruysa true yanlışsa false değer döndürür
		System.out.println(mesaj.replace(' ', '-'));          // değişken içinde değişiklik yapmak için kullanılır
		System.out.println(mesaj.toLowerCase());              // değişken içindeki bütün kelimeleri küçültür
		System.out.println(mesaj.toUpperCase());              // değişken içindeki bütün kelimeleri büyük yapar
		
		
		
	}

}
 