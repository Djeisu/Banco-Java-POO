package Core;

public class ContaCorrente extends Conta implements Imprimivel{
	double taxa;
	
	public ContaCorrente(double n_conta, double saldo, double taxa) {
		super(n_conta, saldo);
		this.taxa = taxa;
	}
	
	@Override
	public void sacar(double valor) throws Exception{
		if (this.saldo - valor < 0)
			throw new Exception("Você não pode sacar essa valor");
		
		this.saldo -= taxa + valor;
	}
	
	@Override
	public void depositar(double valor) throws Exception{
		this.saldo += taxa - valor;
	}
	
	@Override
	public void transferir(double valor, Conta destino) throws Exception{
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	@Override
	public void mostrarDados(){
		System.out.println("Corrente " + this.saldo);
	}
}
