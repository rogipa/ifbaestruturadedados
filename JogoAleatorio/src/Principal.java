import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		Servico s = new Servico();
		
		Scanner in = new Scanner(System.in);
		
		int aleatoria = r.nextInt(100);
		
		String teste="-";
		
		while(!teste.equals("Parabéns!! Você acertou!!")) {
			
			System.out.println("Adivinhe o número gerado");
			teste = s.verifica(in.nextInt(), aleatoria);
			System.out.println(teste);
			
		}
		
	s.imprimir();

	}

}
