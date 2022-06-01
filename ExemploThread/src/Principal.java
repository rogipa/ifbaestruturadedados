
public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		new Thread(t1).start();
		new Thread(t2).start();

	}
	
	
	private static void  imprimir(String t) {
		
		System.out.println("Thread= "+ t);
		
	}
	
	private static void somar(String t, int a, int b) {
		int r;
		int n1 = a;
		int n2 = b;
		
		r = n1 + n2;
		
		System.out.println(t + " - " + r);
	}
	
	
	private static Runnable t1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int cont = 0; cont<1000;cont++) {
				//imprimir("T1 -"+cont);
				somar("T1 - ",5,5);
			}
			
			
		}
	};
	
	private static Runnable t2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int cont = 0; cont<1000;cont++) {
				//imprimir("T2 -"+cont);
				somar("T2 - ",4,4);
			}
		}
	};

}
