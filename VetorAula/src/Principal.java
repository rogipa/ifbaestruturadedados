import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		Servico s = new Servico();

		for(int cont=0; cont<10; cont++) {
		
			s.receberNumero(in.nextInt());
			
		}
		
		s.imprimir();
		
		s.par();
		
		
	}

}
