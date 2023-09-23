package awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DesenhoSimples extends Canvas{

	public static void main(String[] args) {
		
		
		Frame frame = new Frame("Desenho Simples");
		Canvas canvas = new DesenhoSimples();
		
		frame.add(canvas);
		frame.setSize(400,400);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }

        });
		
	}
	
	public void paint(Graphics g) {

        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 50, 50);

        g.setColor(Color.RED);
        g.fillPolygon(new int[] {50, 150, 250}, new int[] {200, 50, 200}, 3);
	}
		
}
