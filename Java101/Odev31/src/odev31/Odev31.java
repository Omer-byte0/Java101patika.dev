package odev31;
import java.util.Scanner;

public class Odev31 {
	 public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	     int number;
	     int i = 0, count = 0;
	     int a = 1, b = 0;
	     int plus;
	     
	     System.out.print("Bir Sayi Giriniz: ");
	     number = inp.nextInt();

	        while (i<number) {
	            plus = a + b;
	            b = a;
	            a = plus;
	            System.out.println(b + " + " + a + " = " + a);
	            i++;
	        }
	    }
}
