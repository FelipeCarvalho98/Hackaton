package br.edu.fatecpg.sistemabancario.model;

import javax.swing.JTextField;

public class ContaCorrente extends Conta{
  private double limiteCheque;
	
  public ContaCorrente(String titular, int conta, double saldo,double lmt) {
		super(titular, conta, saldo);
		this.limiteCheque = lmt;
	}


public double getLimiteCheque() {
	return limiteCheque;
}

public void setLimiteCheque(double limiteCheque) {
	this.limiteCheque = limiteCheque;
}

 public void setSaque(double sq) {
	 if (sq>0 && sq>getSaldo()) {
		 if(sq<=getLimiteCheque()) {
		System.out.println("Saque de :" + sq +   "feito usando cheque");  
		 setLimiteCheque(getLimiteCheque()-sq);
		System.out.println("Limite atual de:" + getLimiteCheque());
		 }
	 }
		  if (sq>0 && sq<=getSaldo()) {
			 System.out.println("Saque de :" + sq + "realizado com saldo da conta");
			 setSaldo(getSaldo()-sq);
		 System.out.println("Saldo atual de:" + getSaldo());
		 }
		else {
		System.out.println("Saque abaixo de 0 reais ou sem saldo na conta e sem limite");
	 }

 }

public void setTransferencia(Conta destino,double vl) {
	    setSaque(vl);
	    destino.setDeposito(vl);
	     }
 
 }	
	

