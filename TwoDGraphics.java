import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDGraphics extends JFrame{
	
	TwoDGraphics(){
		setTitle("TwoDGraphics");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void paint(Graphics g){
		
		g.setColor(Color.RED);
		g.drawOval(250,50,100,100);
		g.fillOval(50,50,100,100);

		g.setColor(Color.BLUE);
		g.drawOval(50,250,100,100);
		g.fillOval(250,250,100,100);

		g.setColor(Color.BLACK);
		g.drawLine(200,0,200,400);
		g.drawLine(0,200,400,200);

		g.drawArc(150,150,100,100,0,90);
		g.drawArc(150,150,100,100,180,90);

	}

	public static void main(String[]args){
		new TwoDGraphics();
	}
}