

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int quantidade;long aPartirDe;
			
			quantidade = 15000; //quantos n�meros deseja gerar?
			aPartirDe = 10000; //a partir de qual n�mero?
		
		
	
			Achador ach = new Achador(aPartirDe,quantidade);
			ach.display();
			ach.displayTime();
		
		
		
	}

}
