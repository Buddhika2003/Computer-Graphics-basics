import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDGraphics extends JFrame{
	
	TwoDGraphics(){
		setTitle("TwoDGraphics");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void paint(Graphics g){
		/*g.drawLine(100,100,300,300);
		g.drawLine(100,100,300,100);
		g.drawLine(100,100,100,300);
		g.drawLine(100,300,300,300);
		g.drawLine(300,300,300,100);	*/

		g.setColor(Color.GREEN);
		g.drawRect(100,100,200,200);
		g.fillRect(100,100,200,200);
		g.setColor(Color.BLACK);
		g.drawOval(400,400,100,100);
	}

	public static void main(String[]args){
		new TwoDGraphics();
	}
}