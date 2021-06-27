package odev28;
import java.util.Scanner;

public class Odev28 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number, total=0;
	        
	        System.out.print("Bir Sayi Giriniz: ");
	        number = scanner.nextInt();
	        
	        for(int i=1; i<number; i++){
	            if(number%i == 0) {
	                total += i;
	            }
	        }
	        
	        if(number == total) {
	            System.out.println(number + " Mükemmel bir sayidir");
	        }
	        else {
	            System.out.println(number + " Mükemmel bir sayi degildir.");
	        } 
	}
}
