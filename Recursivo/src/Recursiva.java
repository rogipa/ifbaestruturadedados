
public class Recursiva {
	
	int cont = 0;
	int total = 0;

	public int contar (int n) {
			
		if(n == 0) {
			
			return 0;			
			
		}
		
		System.out.println("Pilha-->"+n);
		
		System.out.println(total);
		total = n + contar(n-1);
		System.out.println("depois= "+total);
		return total;
	}

}
