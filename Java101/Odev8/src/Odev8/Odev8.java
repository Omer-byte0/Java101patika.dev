package Odev8;
import java.util.Scanner;

public class Odev8 {
	public static void main(String[] args) {
		
		int select;
		double a, b;// Sayilarin bolumleri kusuratli ciktigi icin double aldým.
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Birinci sayiyi giriniz:" );
		a = inp.nextInt();
		
		System.out.print("Ýkinci sayiyi giriniz:" );
		b = inp.nextInt();
		
		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.print("Seçiminiz: ");
		select = inp.nextInt();
		
		switch(select) {
			case 1:
				System.out.print("Toplamý:" + (a+b));
				break;
			case 2:
				System.out.print("Farklari:" + (a-b));
				break;
			case 3:
				System.out.print("Carpimlari:" + (a*b));
				break;
			case 4:
				if(b==0) {
					System.out.print("Sifira bolum tanimsiz yapar !");
				}
				else  {
				System.out.print("Bolumleri:" + (a/b));
				}
				break;
		
				default:
					System.out.println("Belirtilen islemlerden birini tercih ediniz:");
		}
		
		
		
	}

}
