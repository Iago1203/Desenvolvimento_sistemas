package ifelse;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Digite um número: ");
		int numero = Integer.parseInt(leia.nextLine());
		
		if (numero < 20) {
			System.out.println("Aprovado");
	}   else {
		System.out.println("Reprovado, tente de novo");
	}
	}

}
