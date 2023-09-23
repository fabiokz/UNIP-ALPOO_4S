package swing2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PdvApp extends JFrame implements ActionListener{
		
		private JPanel leftPanel;
		private JPanel rightPanel;	
	
		private JLabel dataLabel;
		
		private JLabel valorTotalLabel;
		private JTextField valorTotalTextField;
		
		private JLabel descontoLabel;
		private JTextField descontoTextField;
		
		private JLabel totalComDescontoLabel;
		private JTextField totalComDescontoTextField;
		
		private JLabel valorPagoLabel;
		private JTextField valorPagoTextField;
		
		private JLabel trocoLabel;
		private JTextField trocoTextField;
			
		private JButton calcButton;
		
		private JButton limparButton;
		
	
		public PdvApp() {
			dataLabel = new JLabel();
			
			valorTotalLabel = new JLabel("Valor Total:");
			valorTotalTextField = new JTextField();
			
			descontoLabel = new JLabel("Desconto: %");
			descontoTextField = new JTextField();
			
			totalComDescontoLabel = new JLabel("Total Com Desconto:");
			totalComDescontoTextField = new JTextField();
			
			valorPagoLabel = new JLabel("Valor Pago");
			valorPagoTextField = new JTextField();
			
			trocoLabel = new JLabel("Troco");
			trocoTextField = new JTextField();
			
			leftPanel = new JPanel();
			leftPanel.setLayout(new GridLayout(5,2));
			
			rightPanel = new JPanel();
			rightPanel.setLayout(new GridLayout(2,1));
			
			calcButton = new JButton("Calcular");
			
			limparButton = new JButton("Limpar");
			
			calcButton.addActionListener(this);
			limparButton.addActionListener(this);
			
			leftPanel.add(valorTotalLabel);
			leftPanel.add(valorTotalTextField);
			leftPanel.add(descontoLabel);
			leftPanel.add(descontoTextField);
			leftPanel.add(totalComDescontoLabel);
			leftPanel.add(totalComDescontoTextField);
			leftPanel.add(valorPagoLabel);
			leftPanel.add(valorPagoTextField);
			leftPanel.add(trocoLabel);
			leftPanel.add(trocoTextField);
			
			rightPanel.add(calcButton);
			rightPanel.add(limparButton);
			
			add(leftPanel, BorderLayout.WEST);
			add(rightPanel, BorderLayout.EAST);
			
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
		}

	public void calcular() {
		double valorTotal = Double.parseDouble(valorTotalTextField.getText());
		double desconto = (Double.parseDouble(descontoTextField.getText()) * (valorTotal / 100));
		double totalComDesconto = (valorTotal - desconto);
		totalComDescontoTextField.setText(String.valueOf(totalComDesconto));
	
		double valorPago = Double.parseDouble(valorPagoTextField.getText());
		double troco = (valorPago - totalComDesconto);
		trocoTextField.setText(String.valueOf(troco));
	}
	
	public void limpar() {
		valorTotalTextField.setText("");
		descontoTextField.setText("");
		totalComDescontoTextField.setText("");
		valorPagoTextField.setText("");
		trocoTextField.setText("");
	}
		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == calcButton) {
			calcular();
		}else if (e.getSource() == limparButton) {
			limpar();
		}
		
	}
	
	public static void main(String[] args) {
		new PdvApp();
	}

}
