package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSimples {
	public static void main(String[] args) {
		
		Frame frame = new Frame("Janela Simples");
		Label label = new Label("Olá, Mundo!");
		
		frame.add(label, BorderLayout.CENTER);
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
			
        });

	}

}
