package giocodellocares;
import java.util.Random;

public class Dadi {
	

		//crea un dado che ritorna un unumero tra 2 e 12 
	public static int roll() {
		Random r=new Random();
		int a=r.nextInt(2,13);
		System.out.println("dado lancito valore: "+ a);
		return a;
		
	}

}
