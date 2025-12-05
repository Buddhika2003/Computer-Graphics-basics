import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DDA extends JFrame implements MouseListener{
	int x1,y1,x2,y2;
	Graphics g;

	DDA(){
		setTitle("DDA algorithm");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setVisible(true);

		g=getGraphics();
	}

	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}

	public static void main(String[]args){
		new DDA();
	}
}