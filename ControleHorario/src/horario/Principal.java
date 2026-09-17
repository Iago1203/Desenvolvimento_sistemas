package horario;

public class Principal {

	public static void main(String[] args) {
		Horario horario = new Horario();
		horario.exibir();
		Horario horario2 = new Horario();
		horario2.hora = 8;
		horario2.minuto = 15;
		horario2.segundo = 30;
		
		System.out.println(horario2.minuto +"\n");
		
		horario2.exibir();
		
		System.out.println(horario2.calcularSegundo() +"\n");
		
		Horario horario3 = new Horario(14,20,30);
		
		horario3.exibir();
		
		System.out.println(horario3.calcularSegundo()+"\n");
		
	}

}
