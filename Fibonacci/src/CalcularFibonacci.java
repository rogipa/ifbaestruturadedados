import java.util.Arrays;

public class CalcularFibonacci {
	
	public String fibonacci() { 
		int result = 1; 
		int aux = 0;
		
		String fibonacci = aux + " - " + result;
		//                 a   r
		//0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55 - 89 - 144
		for(int cont=0; result <= 100; cont++) {
			               
			result = result + aux;
			aux = result - aux;
			
			fibonacci += " - " + result;
			
			
		}
		
		return fibonacci;
		
		
	}
	
	public String calcularVetor() {
		
		int fibo[] = new int[13];
		
		fibo[0] =  0;
		fibo[1] = 1;
		//fibo[2] = 1;
		//fibo[3] = 2;
		//fibo[4] = 3;
		int result;

	
		
		for(int cont=2; cont < fibo.length; cont++) {
			
			result =fibo[cont-1] + fibo[cont-2];
	
			fibo[cont] =  result;
			
		}
		
	System.out.println(Arrays.toString(fibo));
		
	String fibonacci="";
		
		for(int c = 0; c < fibo.length - 1; c++) {
			
			fibonacci += fibo[c] + " - ";
			
		}
		
		fibonacci += fibo[12]; 
		
		return fibonacci;
		
	}

}
