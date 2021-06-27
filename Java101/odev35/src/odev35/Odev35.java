package odev35;
import java.util.Scanner;

public class Odev35 {
	public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;//x taban y üs
        System.out.print("Üssü alýnacak sayýyý giriniz :");
        x = inp.nextInt();
        System.out.print("Üs giriniz :");
        y = inp.nextInt();

        int result = power(x, y);

        System.out.println("Sonuç :"+""+result);
    }
    public static int power(int x, int y) {

        if (y != 0)
        {
        return (x * power(x, y - 1));
        }
        else{
        return 1;
        }
    }
}
