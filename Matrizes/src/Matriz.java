import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		String linha1;
		String linha2;
		Scanner entrada = new Scanner(System.in);

		
		
		for(int linha=0;linha<matriz.length;linha++){
			
			for(int coluna=0;coluna<matriz[0].length;coluna++){
				matriz[linha][coluna]=entrada.nextInt();
			}
			
		}
		
		
		
		for(int linha=0;linha<matriz.length;linha++){
			linha1 = "";
			linha2 = "";
			for(int coluna=0;coluna<matriz[0].length;coluna++){
				
				if(coluna == 0){
					linha1 += "|"+matriz[linha][coluna]+"|";
				}
				if((coluna > 0)&&(coluna<=matriz[0].length-1)){
					linha1 += matriz[linha][coluna]+"|";
				}
				
			}
			
			
			
			System.out.println(linha1);
			
		/*(int cont = 0;cont<matriz[0].length;cont++){
				if(cont == 0) {
					linha2+=" ";
				}
				linha2 += "--";
			}
			
			
			System.out.println(linha2);*/
		}
		
		System.out.println(matriz[1][1]);
		
		
		
	}

}
