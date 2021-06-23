package odev18;
import java.util.Scanner;

public class Odev18 {
	public static void main(String[] args) {
		int number = 0, x=0;
		Scanner inp = new Scanner(System.in);
		
		 do {
             System.out.print("Bir Deger Giriniz:");
             number = inp.nextInt();

             if(number%2 == 0 || number%4 == 0 ) {
                 x = number + x;
             }
         }while(number%2 != 1);// 1'e eþit deðilse devam etsin.
		
		System.out.print("Sayilarin Toplami:" + x);

	}
}

