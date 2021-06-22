package odev15;
import java.util.Scanner;

public class Odev15 {
	public static void main(String[] args) {
		int birthday;
		Scanner inp = new Scanner(System.in);
	
		System.out.print("Dogum Yilinizi Giriniz:");
		birthday = inp.nextInt();
	
		if(birthday%12==0) {
			
			System.out.print("Maymun");
			
		}else if(birthday%12==1) {
			
			System.out.print("Horoz");
			
		}else if(birthday%12==2) {
			
			System.out.print("Kopek");
			
		}else if(birthday%12==3) {
			
			System.out.print("Domuz");
			
		}else if(birthday%12==4) {
			
			System.out.print("Fare");
			
		}else if(birthday%12==5) {
			
			System.out.print("Okuz");
			
		}else if(birthday%12==6) {
			
			System.out.print("Kaplan");
			
		}else if(birthday%12==7) {
			
			System.out.print("Tavsan");
			
		}else if(birthday%12==8) {
			
			System.out.print("Ejderha");
			
		}else if(birthday%12==9) {
			
			System.out.print("Yilan");
			
		}else if(birthday%12==10) {
			
			System.out.print("At");
			
		}else if(birthday%12==11) {
			
			System.out.print("Koyun");
			
		}
	}
}
