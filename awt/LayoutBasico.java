package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutBasico {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Layout Basico");
		Panel panel = new Panel();
		
		frame.setLayout(new FlowLayout());
		
		panel.add(new Label("Exemplo de Layout Basico"));
		panel.add(new Button("Botão1"));
		panel.add(new Button("Botão2"));
		
		frame.add(panel);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }

        });
		
	}

}
