package odev14;
import java.util.Scanner;


public class Odev14 {
	public static void main(String[] args) {
		int age, type;
		double km, price, child, teen, old;
		Scanner inp=new Scanner(System.in);
		
		System.out.print("L�tfen Km Cinsinden Mesafeyi Giriniz:");
		km = inp.nextInt();
		
		System.out.print("Yasinizi Giriniz:");
		age = inp.nextInt();
		
		System.out.println("Yolculuk Turunu Seciniz:\n1- Tek y�n. \n2- Gidis-Donus");
		type = inp.nextInt();
		
		price = km * 0.10;
		child = price * 0.5;	
		teen = price * 0.9;  
		old = price * 0.7;
		/* % 50 indirim oranlar�n�n hesaplanmas�
		 * % 10   	
		 * % 30*/
		
		if(km > 0 && age > 0 && (type == 1 || type == 2)) {
			if(age<12) {
				if(type == 2) {
					System.out.print("�demeniz Gereken Tutar" + child * 0.8 * 2);// %20 indirimden dolay� 0.8
				}else {
					System.out.print("�demeniz Gereken Tutar" + child);
				}
				
			}else if(age >= 12 && age <= 24){
				if(type == 2) {
					System.out.print("�demeniz Gereken Tutar" + teen * 0.8 * 2);
				}else {
					System.out.print("�demeniz Gereken Tutar" + teen);
				}
				
			}else if(age > 24 && age <= 65){
				if(type == 2) {
					System.out.print("�demeniz Gereken Tutar" + price * 0.8 * 2);
				}else {
					System.out.print("�demeniz Gereken Tutar" + price);
				}
			}else if(age > 65){
				if(type == 2) {
					System.out.print("�demeniz Gereken Tutar" + old * 0.8 * 2);
				}else {
					System.out.print("�demeniz Gereken Tutar" + old);
				}
			}
		}else {
			System.out.print("Hatali Giris Yaptiniz !");
		} 
	
	}
}