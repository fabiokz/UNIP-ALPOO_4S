package swing1;

import java.awt.*;
import javax.swing.*;

public class IMC {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculo IMC");
		
		JPanel toppingPanel = new JPanel();
		JPanel bottonPanel = new JPanel();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		
		JLabel toppingLabel = new JLabel("Preencha os Campos.");
		
		JTextField heightTextField = new JTextField(10);
		JLabel heightLabel = new JLabel("Insira a Altura.");
		
		JTextField weightTextField = new JTextField(10);
		JLabel weightLabel = new JLabel("Insira a Peso.");
		
		JButton calcButton = new JButton("Calcular");
		
		calcButton.addActionListener(e -> {
			double height = Double.parseDouble(heightTextField.getText());
			double weight = Double.parseDouble(weightTextField.getText());
			double imc =  weight / (height * height);
			StringBuilder resultadoImc = new StringBuilder("IMC: ");
			resultadoImc.append(imc);
			JOptionPane.showMessageDialog(frame, resultadoImc);
		});
		
		toppingPanel.add(toppingLabel);
		bottonPanel.add(calcButton);
		
		leftPanel.add(weightLabel, BorderLayout.NORTH);
		leftPanel.add(weightTextField, BorderLayout.CENTER);
		
		rightPanel.add(heightLabel, BorderLayout.NORTH);
		rightPanel.add(heightTextField, BorderLayout.CENTER);
		
		frame.add(toppingPanel, BorderLayout.NORTH);
		frame.add(bottonPanel, BorderLayout.SOUTH);
		frame.add(leftPanel, BorderLayout.WEST);
		frame.add(rightPanel, BorderLayout.EAST);
	
		frame.setSize(450,230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
