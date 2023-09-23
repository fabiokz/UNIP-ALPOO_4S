package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ComponentesDeTexto {

	public static void main(String[] args) {
		
		Frame frame = new Frame("Componentes de Texto");
		TextField textField = new TextField("Digite o Texto Aqui: ");
		TextArea textArea = new TextArea("Area do Texto", 5, 30);
		
		frame.setLayout(new FlowLayout());
		frame.add(textField);
		frame.add(textArea);
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
			
        });

	}

}
