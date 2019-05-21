package Core;

public class Main {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(555, 100, 1.5);
		ContaPoupanca cp = new ContaPoupanca(666, 10, 500);
		
		Relatorio r = new Relatorio();
		
		try{
			cc.transferir(5, cp);			
		}catch(Exception e){
			System.out.println(e);
		}
		
		r.mostrarRelatorio(cc);
		r.mostrarRelatorio(cp);
		
		
	}
}
