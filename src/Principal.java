

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int quantidade;long aPartirDe;
			
			quantidade = 15000; //quantos números deseja gerar?
			aPartirDe = 10000; //a partir de qual número?
		
		
	
			Achador ach = new Achador(aPartirDe,quantidade);
			ach.display();
			ach.displayTime();
		
		
		
	}

}
