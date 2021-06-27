package odev25;
import java.util.Scanner;

public class Odev25 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String userName, password;
		int right = 3;
		int balance = 1500;
		int select;
		int value;
		
		while(right>0) {
			
			System.out.print("Kullanici Adinizi Giriniz: ");
			userName = inp.nextLine();
			System.out.print("Sifrenizi Giriniz: ");
			password = inp.nextLine();
			
			if(userName.equals("aliveli") && password.equals("aliveli123")) {
				 do {
					 System.out.println("Hosgelniz " + userName);
	                    System.out.println("Lutfen Yapmak Ýstediginiz Ýslemi Seciniz :");
	                    System.out.println("1- Para Cekme\n" + "2- Para Yatirma\n" + "3- Bakiye Sorgulama\n" + "4- Cikis Yap");
	                    select = inp.nextInt();
	                    
	                    switch(select) {
	                    	case 1:
	                    		System.out.print("Cekmek Ýstenilen Tutari Giriniz:");
	                    		value = inp.nextInt();
	                    		
	                    		if(value>balance) {
	                    			System.out.println("Yetersiz bakiye. Tekrar Deneyiniz.");
	                    			value = inp.nextInt();
	                    		}
	                    		balance -= value;
	                    		System.out.println("Yeni Bakiyeniz:" + balance);
	                    		break;
	                    	case 2:
	                    		System.out.println("Bakiyeniz : " + balance);
	                            System.out.print("Yatirmak istediginiz tutari giriniz: ");
	                            value = inp.nextInt();
	                            balance += value;
	                            System.out.println("Yeni Bakiyeniz : " + balance);
	                            break;
	                    	case 3:
	                    		System.out.print("Bakiyeniz:" + balance);
	                    		break;
	                    	case 4:
	                    		System.out.print("Kartinizi Almayi Unutmayiniz!");
	                    		break;
	                    }
	                    
				 }while(select !=4);
	                System.out.print("Cikis Yapildi.");
	               
				 break;
				}else {
				right--;
				
				System.out.println("Hatali Giris Yaptiniz");
				if((right == 0)) {
					System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz!");
				}else {
				System.out.println("Kalan Hakkiniz:" + right);
				}
			}
			
		}
	}
}


