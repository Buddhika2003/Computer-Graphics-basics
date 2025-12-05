import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BresenhamAlgorithm extends JFrame implements MouseListener{
	int x1,y1,x2,y2;
	Graphics g;

	BresenhamAlgorithm(){
		setTitle("BresenhamAlgorithm");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setVisible(true);

		g=getGraphics();
	}

	public void BresenhamAlgo(int x1, int y1, int x2, int y2){
		int dx, dy, p, x, y;
		
		dx = x2 - x1;
		dy = y2 - y1;

		x = x1;
		y = y1;

		p = 2 * dy - dx;

		for(int i = x1  ; i <= x2 ; i++){
			if(p < 0){
				p = p + 2 * dy;
				x++;
			}else{
				p = p + 2 * (dy - dx); 
				x++;
				y++;
			}
			g.drawLine(x,y,x,y);
		}

	} 

	public void mouseClicked(MouseEvent e){}
	public void mousePressed(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY(); 
	}
	public void mouseReleased(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();

		BresenhamAlgo(x1,y1,x2,y2);
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}


	public static void main(String []args){
		new BresenhamAlgorithm();
	}
}