package desafiocinco;

import java.util.Scanner;

public class InverterCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String entrada = sc.next();
		int x = entrada.length()-1;
		char s[] = new char[entrada.length()];
		
		while(x>=0) {
			s[x]=entrada.charAt(x);
			System.out.println(s[x]);
			x--;
			
		}

	}

}
