package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digite o seu nome: ");
		String nome = leia.nextLine();
		
		
		
		System.out.println("idade: " + idade);
		System.out.println("nome: " + nome);
		
		

	}

}
