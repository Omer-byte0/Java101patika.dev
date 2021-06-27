package odev30;

public class Odev30 {
	public static void main(String[] args) {
	
		for(int number=2; number<=100; number++) {
			 int kontrol = 0;
	            for (int i = 2; i < number; i++)
	            {
	                if (number%i == 0){
	                    kontrol = 1;
	                    break;
	                }
	            }

	            if(kontrol==0){
	                System.out.print(number+"\n");

	            }	
		}
	}

}
