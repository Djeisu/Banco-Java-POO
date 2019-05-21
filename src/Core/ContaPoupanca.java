package Core;

public class ContaPoupanca extends Conta implements Imprimivel{
	double limite;
	
	public ContaPoupanca(double n_conta, double saldo, double limite) {
		super(n_conta, saldo);
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) throws Exception{
		if (this.saldo - valor < limite)
			throw new Exception("Você não pode sacar essa valor");
		
		this.saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) throws Exception{
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta destino) throws Exception{
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	@Override
	public void mostrarDados(){
		System.out.println("Poupança " + this.saldo);
	}
}
