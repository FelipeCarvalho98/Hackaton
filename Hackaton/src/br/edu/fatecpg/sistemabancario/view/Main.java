package br.edu.fatecpg.sistemabancario.view;

import java.util.Scanner;
import br.edu.fatecpg.sistemabancario.model.ContaPoupança;
import br.edu.fatecpg.sistemabancario.model.ContaCorrente;
import br.edu.fatecpg.sistemabancario.model.Conta;
public class Main {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    
    ContaPoupança contateste = new ContaPoupança("Felipe",50,900);
   
   	ContaCorrente conta1 = new ContaCorrente("Felipe",1,10,500);
  	ContaCorrente conta2 = new ContaCorrente("Felipe",1,100,500);
  
 
  	conta2.setSaque(550);

	}
}