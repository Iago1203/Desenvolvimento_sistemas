package concatenacao;

public class App {

	public static void main(String[] args) {
		
		String numero1 = "10";
		
		String numero2 = "5";
		
		String preco = "12.50";
		
	
		int n1 = Integer.parseInt("10");
		int n2 = Integer.parseInt("5");
		
		System.out.println("Adição: ");
		System.out.println(n1 + n2);
		
		System.out.println("Subtação: ");
		System.out.println(n1 - n2);
		
		System.out.println("Multiplicação: ");
		System.out.println(n1 * n2);
		
		double precoConvertido = Double.parseDouble("12.50");
		
		System.out.println("Preco Original: ");
		System.out.println(preco);
		System.out.println("Preco Convertido: ");
		System.out.println(precoConvertido + 5);
		
	}

}
