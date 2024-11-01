package br.edu.fatecpg.sistemabancario.model;

public class ContaPoupança extends Conta{

	public ContaPoupança(String titular, int conta, double saldo) {
		super(titular, conta, saldo);
	}


	public void setSaque(double sq) {
 		System.out.println("Não é possivel sacar de contas poupanças");
	}
	
	private void setSaqueP(double sq) {
 		setSaldo(getSaldo()-sq);
	}
	
	public void setTransferencia(Conta destino,double vl) {
	    setSaqueP(vl);
	    destino.setDeposito(vl);
	     }	
}
