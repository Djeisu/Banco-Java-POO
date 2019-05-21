package Core;

public abstract class Conta {
	double n_conta;
	double saldo;
	
	public Conta(double n_conta, double saldo){
		this.n_conta = n_conta;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws Exception{}
	
	public void depositar(double valor) throws Exception{}
	
	public void transferir(double valor, Conta destino) throws Exception{}
}
