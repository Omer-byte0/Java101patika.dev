package Odev9;
import java.util.Scanner;

public class Odev9 {
	public static void main(String[] args) {
		
		String userName, password;
		String passwordLogin="1234";
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Kullanici Adinizi Giriniz:");
		userName = inp.nextLine();
		
		System.out.print("Sifrenizi Giriniz:");
		password = inp.nextLine();
		
		if(userName.equals("Omer") && password.equals(passwordLogin)){
			System.out.print("Giris Basarili.");
		}
		else {
			
			System.out.println("Giris Basarisiz.");
			System.out.println("Sifrenizi sifirlamak ister misiniz? ");
			System.out.println("Evet icin 1, Hayir icin 2 giriniz.");
			
			int deger = inp.nextInt();
			
			switch(deger) {
			
			case 1:
				System.out.println("Yeni sifre olusturunuz:");
				String newPassword = inp.next();//  Veritipi olarak tanımlamayarak hem string hem de int olarak veri atayabilmek için.
												// Ayrıca if döngüsünde int veri tipiyle stringi aynı anda kabul etmiyor.
				
				if(newPassword.equals(passwordLogin) || newPassword.equals(password)) {
					
					System.out.print("Eski sifrenizle ayni sifreyi koyamazsiniz.");
					}
				
				else {
					System.out.print("Yeni sifre olusturuldu.");
					password = newPassword;
					}
				
				break;
			
			case 2:
				
				System.out.print("Sifre sifirlama iptal edildi.");
				
				break;
				
				default:
					System.out.print("İstenen degerlerden birini seciniz.");
							
						}
						
						
						

					}
					
				}

			
			

			


		}
		
	


