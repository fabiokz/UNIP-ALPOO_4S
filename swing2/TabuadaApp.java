package swing2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TabuadaApp extends JFrame implements ActionListener {

    private JPanel toppingPanel;
    private JTextField num;
    private JLabel label;
    private DefaultListModel<String> model;
    private JList<String> list;
    private JButton tabuadaJButton;
    private JButton limparButton;

    public TabuadaApp() {
        setTitle("Tabuada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toppingPanel = new JPanel();
        toppingPanel.setLayout(new GridLayout(2, 2));
        
        label = new JLabel("Digite um número:");
        num = new JTextField(2);
        
        tabuadaJButton = new JButton("Tabuada");
        tabuadaJButton.addActionListener(this);
        
        limparButton = new JButton("Limpar");
        limparButton.addActionListener(this);
        
        toppingPanel.add(label);
        toppingPanel.add(num);
        toppingPanel.add(tabuadaJButton);
        toppingPanel.add(limparButton);
        
        model = new DefaultListModel<>();
        list = new JList<>(model);
        
        add(toppingPanel, BorderLayout.NORTH);
        add(new JScrollPane(list), BorderLayout.CENTER);
        
        setSize(300, 500);
        setVisible(true);
    }

    void calculateTabuada() {
        int intnum = Integer.parseInt(num.getText());
        model.clear();
        
        for (int i = 0; i <= 10; i++) {
            int result = intnum * i;
            String str = i + " x " + intnum + " = " + result;
            model.addElement(str);
        }
    }

    void clearTabuada() {
        model.clear();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tabuadaJButton) {
            calculateTabuada();
        } else if (e.getSource() == limparButton) {
            clearTabuada();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TabuadaApp();
        });

    }
    
}
