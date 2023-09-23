package swing1;

import javax.swing.*;
import java.awt.*;

public class Mercadinho {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Mercadinho");
		
		JPanel toppingPanel = new JPanel();
		JLabel toppingPanelLabel = new JLabel("Escolha a Quantidade dos Produtos Desejados");
		toppingPanel.add(toppingPanelLabel);
		
		GridLayout grid = new GridLayout(5,3);
		JPanel midPanel = new JPanel(grid);
		
		Integer[] quantidade = {0,1,2,3,4,5,6,7,8,9,10};
		
		JLabel produtoLabel = new JLabel("Produtos");
		JLabel precoLabel = new JLabel("Preço");
		JLabel quantLabel = new JLabel("Quantidade");
		
		JLabel arrozLabel = new JLabel("Arroz");
		JLabel arrozPrice = new JLabel("10.25");
		JComboBox<Integer> arrozBox = new JComboBox<>(quantidade);
		
		JLabel feijaoLabel = new JLabel("Feijao");
		JLabel feijaoPrice = new JLabel("8.80");
		JComboBox<Integer> feijaoBox = new JComboBox<>(quantidade);
		
		JLabel acucarLabel = new JLabel("Açucar");
		JLabel acucarPrice = new JLabel("5.50");
		JComboBox<Integer> acucarBox = new JComboBox<>(quantidade);
		
		JLabel salLabel = new JLabel("Sal");
		JLabel salPrice = new JLabel("3.10");
		JComboBox<Integer> salBox = new JComboBox<>(quantidade);
		
		midPanel.add(produtoLabel);
		midPanel.add(precoLabel);
		midPanel.add(quantLabel);
		
		midPanel.add(arrozLabel);
		midPanel.add(arrozPrice);
		midPanel.add(arrozBox);
		
		midPanel.add(feijaoLabel);
		midPanel.add(feijaoPrice);
		midPanel.add(feijaoBox);
		
		midPanel.add(acucarLabel);
		midPanel.add(acucarPrice);
		midPanel.add(acucarBox);
		
		midPanel.add(salLabel);
		midPanel.add(salPrice);
		midPanel.add(salBox);
		
		JPanel bottonPanel = new JPanel();
		JButton botao = new JButton("Finalizar Pedido");
		
		botao.addActionListener(e -> {
			double precoArroz = Double.parseDouble(arrozPrice.getText()) * (Integer)arrozBox.getSelectedItem();
			double precoFeijao = Double.parseDouble(feijaoPrice.getText()) * (Integer)feijaoBox.getSelectedItem();
			double precoAcucar = Double.parseDouble(acucarPrice.getText()) * (Integer)acucarBox.getSelectedItem();
			double precoSal = Double.parseDouble(salPrice.getText()) * (Integer)salBox.getSelectedItem();
			double precoTotal = (precoArroz + precoFeijao + precoAcucar + precoSal);
			StringBuilder pedido = new StringBuilder("Valor Total do Pedido: R$");
			pedido.append(precoTotal);
			JOptionPane.showMessageDialog(frame, pedido);
		});
		
		bottonPanel.add(botao);
		
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(midPanel, BorderLayout.CENTER);
		frame.add(bottonPanel, BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setVisible(true);
		
	}
		
}
