package odev29;
import java.util.Scanner;

public class Odev29 {
	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n;
         
         System.out.println("Bir Sayi Giriniz:");
         n=sc.nextInt();
        
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }   
            for(int k=2*n-1;k>=(2*i+1);k--){
                System.out.print("*");
                
            }
                System.out.println();   

        }
    }

}
