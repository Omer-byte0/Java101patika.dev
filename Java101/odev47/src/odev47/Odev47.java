package odev47;
import java.util.Scanner;

public class Odev47 {
	public static void main(String[] args) {
        int m, n;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matrisin sat�r say�n� girin : ");
        m = inp.nextInt();
        System.out.print("Matrisin s�tun say�s�n� girin : ");
        n = inp.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Matrisin elemanlar�n� girin");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matirisin " + (i + 1) + ". sat�r " + (j + 1) + ". s�tun eleman�n� girin: ");
                matrix[i][j] = inp.nextInt();
            }
        }

        System.out.println("Matris: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }

        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrisin tersi:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }

}
