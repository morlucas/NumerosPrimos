
public class Achador {
	private long primosNum[];
	private long aPartir;
	private int quantidade;
	private double tempoDeExec, tempoReal;
	
	public Achador(long aPartir, int quantidade){
		this.aPartir = Math.abs(aPartir);
		this.quantidade = Math.abs(quantidade);
		this.primosNum = new long[Math.abs(quantidade)];
		this.tempoDeExec = 0;
		if(aPartir<=5) displayNumerosPeq();	
		else displayNumeros();
	}
	
	public void displayNumeros(){
		tempoDeExec = System.currentTimeMillis();
		for(int i = 0;i<quantidade; i++){
			System.out.println("Aguarde..." + Integer.toString((i*100)/quantidade) + "%");
			System.out.println();
			
			if(testaNum(aPartir)){
				primosNum[i] = aPartir;
				aPartir++;
				//System.out.println("Achou! Temos "+ (i+1) + " números primos.");
				
			} else{
				aPartir++;
				if(i==0){
					i--;
					continue;
				}
				i--;
			}
			
			
		}System.out.println("Pronto!");
		tempoReal = (System.currentTimeMillis()-tempoDeExec)/1000;
	}
	
	public void displayNumerosPeq(){
		tempoDeExec = System.currentTimeMillis();
		for(int i = 0;i<quantidade; i++){
			System.out.println("Aguarde..." + ((i/quantidade)*100f) + "%");
			System.out.println();
			
			if(testaNumPeq()){
				primosNum[i] = aPartir;
				aPartir++;
				//System.out.println("Achou! Temos "+ (i+1) + " números primos.");
				
			} else{
				aPartir++;
				i--;
			}
			
			
		}System.out.println("Pronto!");
		tempoReal = (System.currentTimeMillis()-tempoDeExec)/1000;
	}
	public void display(){
		for(int i = 0;i<quantidade;i++){
			System.out.print("\\\\"+(i+1) +" - " + primosNum[i] + " ");
			if(i % 9 == 0 && i != 0)System.out.println();
		}
		
		System.out.println();
	}
		
	public boolean testaNum(long num){
			if(num==1){
					return false;
				}
			
			long i = num;
			
			while(i!=1){
				if(num % 2 == 0){
					i--;
					return false;
				}
				
				if(num % 3 == 0){
					i--;
					return false;
				}
					
				if(num % 5 == 0){
					i--;
					return false;
				}
				
				if(num % 7 == 0){
					i--;
					return false;
				}
				
				if(i<8) return true;
				
				if(num % (i-1) == 0){
					i--;
					return false;
				}
				
				i--;
				
			}
			
			
			return true;
		}
	
	public boolean testaNumPeq(){
		if(aPartir==1){
			return false;
		}
		
		for(long i = (aPartir-1);i!=1;i--){
			if(aPartir % i == 0) return false;
		}
		return true;
		
	}
	
	public static void testaNumUnico(long num){
		if(num==1){
			System.out.println("Não é primo.");
		}
	
		for(long i = (num-1);i!=1;i--){
			if(num % i == 0) System.out.println("Não é primo.");
		}
		System.out.println("Este número" + num + " é primo.");
		
	}
	
	void displayTime(){
		System.out.printf("O tempo de execução foi: %.2f segundos",tempoReal);
		System.out.println();
	}
	
}
	


