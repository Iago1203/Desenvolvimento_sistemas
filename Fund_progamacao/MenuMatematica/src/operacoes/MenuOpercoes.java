package operacoes;

import java.util.Scanner;

public class MenuOpercoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double n1 =Double.parseDouble(leia.nextLine());
		
		System.out.println("Digite o segundo número: ");
		double n2 =Double.parseDouble(leia.nextLine());
		 {
		System.out.println("Menu de operações matematicas"
				+ "1 - Calcular a media dos números: "
				+ "2 - Subtria o menor número do maior"
				+ "3 - Multiplique os números"
				+ "4 - Divida o primeiro número pelo segundo");
		
		
		} System.out.println("Escolha uma das opções: ");
		int opcao = Integer.parseInt(leia.nextLine());
		switch (opcao) {
		case 1:
		System.out.println("Calcular média: " + (n1 + n2) /2);
		break;
		
		case 2:
			System.out.println("Subtraia o menor numero do maior: " + (n1 <= n2 ?"subtração" + (n2 - n1) : "subtrção" + (n1-n2)));
			break;
		case 3: 
			System.out.println("Multiplicação: " + (n1*n2));
			break;
		case 4: 
			System.out.println(n2 != 0? "Divisão: " + (n1/n2) :(n1*n2) );
			break;
			default:
			System.out.println("Opção invalida");
		}		
		
	}

}
