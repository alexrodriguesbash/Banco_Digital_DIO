package entities;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Alex", "011988888888"); 
		
		Conta cc = new ContaCorrente(cliente); 
		Conta poupanca = new ContaPoupanca(cliente); 
		
		cc.depositar(100);
		cc.transferir(40, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}
}
