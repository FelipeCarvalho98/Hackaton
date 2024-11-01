package br.edu.fatecpg.sistemabancario.model;

public class Conta {
    private String titular;
    private int conta;
    private double saldo;
	public Conta(String titular, int conta, double saldo) {
		this.titular = titular;
		this.conta = conta;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
    
    public void setDeposito(double dp) {	 
    	if (dp>0) {
    	saldo = saldo+dp;
    	}
    	else {
    		System.out.println("Apenas depósitos acima de 0 reais são permitidos !");
    	}
    }
}
    
