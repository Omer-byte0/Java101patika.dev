package odev27;
import java.util.Scanner;

public class Odev27 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piece, number;
        int maks=0,min=0;
        
        System.out.print("Kac Adet Sayi Girilecek:"); 
        piece = sc.nextInt(); 
       
       for (int i=0; i<piece; i++)
       {
           System.out.print((i+1) + ". sayiyi giriniz: ");
           int sayi = sc.nextInt();
           
           if (i==1)
           {
               maks=sayi;
               min=sayi;
           }
           
           if (sayi>maks)
               maks=sayi;
           
           if (sayi<min)
               min=sayi;
       }
       
       System.out.println("Maks: "+maks);
       System.out.println("Min : "+min);
   }

}
