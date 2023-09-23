package swing3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroFaculdade {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Estudante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2));

        JLabel labelCPF = new JLabel("CPF:");
        JTextField textFieldCPF = new JTextField();
        JLabel labelNome = new JLabel("Nome Completo:");
        JTextField textFieldNome = new JTextField();
        JLabel labelIdade = new JLabel("Idade:");
        JTextField textFieldIdade = new JTextField();
        JLabel labelCurso = new JLabel("Curso:");
        JTextField textFieldCurso = new JTextField();

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent e) {
                String cpf = textFieldCPF.getText();
                String nome = textFieldNome.getText();
                String idade = textFieldIdade.getText();
                String curso = textFieldCurso.getText();

                JOptionPane.showMessageDialog(frame, "Estudante cadastrado com sucesso!");
            }
        });

        frame.add(labelCPF);
        frame.add(textFieldCPF);
        frame.add(labelNome);
        frame.add(textFieldNome);
        frame.add(labelIdade);
        frame.add(textFieldIdade);
        frame.add(labelCurso);
        frame.add(textFieldCurso);
        frame.add(new JLabel()); 
        frame.add(cadastrarButton);

        frame.setVisible(true);
    }
}