package br.edu.fatecpg.sistemabancario.view;
import br.edu.fatecpg.sistemabancario.model.ContaPoupança;
import br.edu.fatecpg.sistemabancario.model.ContaCorrente;
import br.edu.fatecpg.sistemabancario.model.Conta;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.sistemabancario.model.ContaCorrente;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nmtitular;
	private JTextField nmconta;
	private JTextField sld;
	private JTextField lmt;
	private JButton btnSacar;
	private JTextField txtValor;
	private JTextField txtValor_1;
	private JTextField txtValor_2;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nmtitular = new JTextField();
		nmtitular.setHorizontalAlignment(SwingConstants.CENTER);
		nmtitular.setText("Titular");
		nmtitular.setBackground(Color.GRAY);
		nmtitular.setBounds(35, 11, 86, 20);
		contentPane.add(nmtitular);
		nmtitular.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar Conta");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField titular = nmtitular;
				JTextField numero = nmconta;
				JTextField saldo = sld;
				JTextField limite = lmt;
				
			ContaCorrente nmtitular = new ContaCorrente(titular,numero,saldo,limite);	
			}
		});
		btnNewButton.setBounds(24, 195, 116, 28);
		contentPane.add(btnNewButton);
		
		nmconta = new JTextField();
		nmconta.setHorizontalAlignment(SwingConstants.CENTER);
		nmconta.setText("Numero conta");
		nmconta.setColumns(10);
		nmconta.setBackground(Color.GRAY);
		nmconta.setBounds(35, 38, 86, 20);
		contentPane.add(nmconta);
		
		sld = new JTextField();
		sld.setHorizontalAlignment(SwingConstants.CENTER);
		sld.setText("Saldo");
		sld.setColumns(10);
		sld.setBackground(Color.GRAY);
		sld.setBounds(35, 69, 86, 20);
		contentPane.add(sld);
		
		lmt = new JTextField();
		lmt.setHorizontalAlignment(SwingConstants.CENTER);
		lmt.setText("Limite");
		lmt.setColumns(10);
		lmt.setBackground(Color.GRAY);
		lmt.setBounds(35, 100, 86, 20);
		contentPane.add(lmt);
		
		btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSacar.setBounds(275, 46, 149, 28);
		contentPane.add(btnSacar);
		
		txtValor = new JTextField();
		txtValor.setText("Valor");
		txtValor.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor.setColumns(10);
		txtValor.setBackground(Color.GRAY);
		txtValor.setBounds(307, 24, 86, 20);
		contentPane.add(txtValor);
		
		txtValor_1 = new JTextField();
		txtValor_1.setText("Valor");
		txtValor_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor_1.setColumns(10);
		txtValor_1.setBackground(Color.GRAY);
		txtValor_1.setBounds(307, 100, 86, 20);
		contentPane.add(txtValor_1);
		
		txtValor_2 = new JTextField();
		txtValor_2.setText("Valor");
		txtValor_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtValor_2.setColumns(10);
		txtValor_2.setBackground(Color.GRAY);
		txtValor_2.setBounds(307, 175, 86, 20);
		contentPane.add(txtValor_2);
		
		JButton btnSacar_1 = new JButton("Depositar");
		btnSacar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSacar_1.setBounds(275, 126, 149, 28);
		contentPane.add(btnSacar_1);
		
		JButton btnSacar_2 = new JButton("Transferir");
		btnSacar_2.setBounds(275, 195, 149, 28);
		contentPane.add(btnSacar_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(2);
		comboBox.setSelectedIndex(2);
		comboBox.setBounds(35, 131, 71, 20);
		contentPane.add(comboBox);
		
		
	}
}
