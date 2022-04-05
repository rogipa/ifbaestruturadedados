import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		CadastrarConta c = new CadastrarConta();
		
		for(int cont=0;cont<5;cont++) {
			
			Conta conta = new Conta();
			
			System.out.println("Digite o nome da conta");
			conta.setNome(in.next());
			System.out.println("Digite o valor da conta");
			conta.setValor(in.nextDouble());
			
			c.add(conta);
			
		}
		
		c.listar();
		
		System.out.println("Digite um nome para procurar");
		Conta c2 = c.procurar(in.next());
		
		System.out.println(c2);
		
		System.out.println("Digite a conta e a posicao");
		int p = in.nextInt();
		String nome = in.next();
		Conta c3 = new Conta();
		c3.setNome(nome);
		c3.setValor(p);
		int posicao= in.nextInt();
		
		c.addPosicao(c3, posicao);
		
		c.listar();
	}

}
