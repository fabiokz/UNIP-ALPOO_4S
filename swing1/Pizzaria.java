package swing1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pizzaria {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Pizzaria");
		
		JPanel toppingPanel = new JPanel();
	    JPanel leftPanel = new JPanel();
	    JPanel rightPanel = new JPanel();
		JLabel toppingLabel = new JLabel("Selecione os Ingredientes");
		
		JCheckBox queijoChk = new JCheckBox("Queijo");
		JCheckBox peperoniChk = new JCheckBox("Peperoni");
		JCheckBox cebolaChk = new JCheckBox("Cebola");
		JCheckBox cogumeloChk = new JCheckBox("Cogumelo");
		
		JCheckBox calabresaChk = new JCheckBox("Calabresa");
		JCheckBox frangoChk = new JCheckBox("Frango");
		JCheckBox atumChk = new JCheckBox("Atum");
		JCheckBox catupiriChk = new JCheckBox("Catupiri");
		
		toppingPanel.add(toppingLabel, BorderLayout.CENTER);
		leftPanel.setLayout(new GridLayout(0,1));
		leftPanel.add(queijoChk);
		leftPanel.add(peperoniChk);
		leftPanel.add(cogumeloChk);
		leftPanel.add(cebolaChk);
		
		rightPanel.setLayout(new GridLayout(0,1));
		rightPanel.add(calabresaChk);
		rightPanel.add(frangoChk);
		rightPanel.add(atumChk);
		rightPanel.add(catupiriChk);
		
		JButton orderButton = new JButton("Fazer o Pedido");
		
		orderButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						
						StringBuilder orderDetails = new StringBuilder("Pedido:  ");
						if(queijoChk.isSelected()) {
							orderDetails.append(" Queijo ");
						}
						if(peperoniChk.isSelected()) {
							orderDetails.append(" Peperoni ");
						}
						if(cogumeloChk.isSelected()) {
							orderDetails.append(" Cogumelo ");
						}
						if(cebolaChk.isSelected()) {
							orderDetails.append(" Cebola");
						}
						if(calabresaChk.isSelected()) {
							orderDetails.append(" Calabresa ");
						}
						if(frangoChk.isSelected()) {
							orderDetails.append(" Frango ");
						}
						if(atumChk.isSelected()) {
							orderDetails.append(" Atum ");
						}
						if(catupiriChk.isSelected()) {
							orderDetails.append(" Catupiri");
						}
						if(orderDetails.toString().equals("Pedido:  ")) {
							orderDetails.append("Nenhum Ingrediente Selecionado!");
						}
						JOptionPane.showMessageDialog(frame, orderDetails.toString());
					}
				});
		
		frame.setLayout(new BorderLayout());
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
		frame.add(orderButton, BorderLayout.SOUTH);
		frame.setSize(250,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
