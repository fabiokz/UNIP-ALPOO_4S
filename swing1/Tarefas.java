package swing1;

import javax.swing.*;
import java.awt.*;

public class Tarefas {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Sistema de Tarefas");
		
		DefaultListModel<String> taskListModel = new DefaultListModel<>();
		
		JList<String> taskList = new JList<>(taskListModel);
		
		JTextField taskTextField = new JTextField(20);
		
		JButton addButton = new JButton("Adicionar Tarefa");
		
		JButton remButton = new JButton("Remover Tarefa");
		
		JButton remAllButton = new JButton("Remover Todas as Tarefas");
		
		addButton.addActionListener(e -> {
			String task = taskTextField.getText();
			taskListModel.addElement(task);
			taskTextField.setText("");});
		
		remButton.addActionListener(e -> {
			int selectedIndex = taskList.getSelectedIndex();
			if (selectedIndex != -1) {
				taskListModel.remove(selectedIndex);
				}});
		
		remAllButton.addActionListener(e -> {
			taskListModel.removeAllElements();
		});
		
		JPanel controlPanel = new JPanel();
		
		controlPanel.add(taskTextField);
		controlPanel.add(addButton);
		controlPanel.add(remButton);
		controlPanel.add(remAllButton, BorderLayout.EAST);
		
		frame.setLayout(new BorderLayout());
		frame.add(new JScrollPane(taskList), BorderLayout.CENTER);
		frame.add(controlPanel, BorderLayout.SOUTH);
		
		frame.setSize(800,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
}
