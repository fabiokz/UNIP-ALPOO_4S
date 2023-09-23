package swing3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receitas extends JFrame {

    private JTextField campoNome;
    private JTextArea campoIngredientes;
    private JTextArea campoLivroDeReceitas;

    public Receitas() {
        setTitle("Criar Livro de Receitas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel labelNome = new JLabel("Nome da Receita:");
        campoNome = new JTextField();
        JLabel labelIngredientes = new JLabel("Ingredientes:");
        campoIngredientes = new JTextArea(5, 20);
        JButton btnAdicionarReceita = new JButton("Adicionar Receita");

        campoLivroDeReceitas = new JTextArea();
        campoLivroDeReceitas.setEditable(false);

        btnAdicionarReceita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarReceita();
            }
        });

        panel.add(labelNome);
        panel.add(campoNome);
        panel.add(labelIngredientes);
        panel.add(campoIngredientes);
        panel.add(btnAdicionarReceita);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(campoLivroDeReceitas), BorderLayout.CENTER);

        setVisible(true);
    }

    private void adicionarReceita() {
        String nomeReceita = campoNome.getText();
        String ingredientes = campoIngredientes.getText();

        if (!nomeReceita.isEmpty() && !ingredientes.isEmpty()) {
            String receita = "Receita: " + nomeReceita + "\nIngredientes:\n" + ingredientes + "\n\n";
            campoLivroDeReceitas.append(receita);

            campoNome.setText("");
            campoIngredientes.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o nome da receita e os ingredientes.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            public void run() {
                new Receitas();
            }
        });
    }
}