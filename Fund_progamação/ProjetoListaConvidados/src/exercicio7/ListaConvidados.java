package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> convidados = new ArrayList<>();
		String nomeConvidados;
		int opcao;
		int posicao;
		String continuar;
		do {
			System.out.println("1- adicionar nomo do convidado/r/n" + "2- Alterar Convidado/r/n"+
		"3- Remover convidado/r/n" + "4- Procurar Covidado/r/n" + "5- Exibir convidado/r/n"
		+"6- Encerrar "+ "/n/n Escolha uma opção acima: ");
			
			opcao = Integer.parseInt(input.nextLine());
			
			switch (opcao) {
			case 1:
				System.out.println("Nome convidado: ");
				nomeConvidados = input.nextLine();
				convidados.add(nomeConvidados);
				System.out.println(nomeConvidados + "Adicionar á lista/n");
				break;
			}
			
			
		}while(opcao !=6);

	}

}
