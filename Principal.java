

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int quantidade;long aPartirDe;
			
			quantidade = 15; //quantos números deseja gerar?
			aPartirDe = 100_000_000; //a partir de qual número?
		
		
	
			Achador ach = new Achador(aPartirDe,quantidade);
			ach.display();
			ach.displayTime();
		
		
		
	}

}
