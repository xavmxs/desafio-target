package desafiodois;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int x = 1;
		int y = 0;
		int z = 0;
		
		
		System.out.println("O número " + x + " faz parte da sequência Fibonacci.");
		
		for(int i=0; i<10; i++) {
			System.out.println(x);
			
			z= x;
			x= x+y;
			y= z;
			
			
		}
		
		
		

	}
	
}
