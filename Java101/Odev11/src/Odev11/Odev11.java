package Odev11;
import java.util.Scanner;

public class Odev11 {
	public static void main(String[] args) {
		int heat;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sicaklik Giriniz:");
		heat = inp.nextInt();
		
			if(heat <= 5) {
				System.out.print("Kayak.");
			}
			
			else if(heat>5 && heat <= 15) { 
				if(heat >10 && heat<=15) {
					System.out.print("Sinema ve Piknik.");
				}
				else {
				System.out.print("Sinema.");
				}
			}
		
			else if(heat>10 && heat <= 25) {
				System.out.print("Piknik.");
			}
			else if(heat>25) {
				System.out.print("Yuzme.");
			}
	}

}
