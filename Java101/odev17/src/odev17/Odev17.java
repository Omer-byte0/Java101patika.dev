package odev17;
import java.util.Scanner;

public class Odev17 {
	public static void main(String[] args) {
		int number;
		double ks=0, st=0, x;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lutfen Bir Sayi Giriniz:");
		number = inp.nextInt();
		
		for(int i=0; i<=number; i++) {
			
			if(i>2 &&(i%3 == 0 || i%4 == 0)) {
				System.out.println(i);
				
				ks++;
				st += i;
			}
		}
		x = st/ks; //st= sayilarin toplami, ks= kac tane sayi oldugu
		System.out.println("Girilen Sayiya Kadar Olan Sayilardan 3 ve 4'e Bolunebilen Sayilarin Ortalamasi: " + x);
	}

}
