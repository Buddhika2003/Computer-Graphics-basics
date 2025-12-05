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

	public void BresenhamAlgo2(int x1, int y1, int x2, int y2){
		int x, y, dx, dy, xend, d1;

        dx = Math.abs(x2 - x1);
        dy = Math.abs(y2 - y1);

        d1 = 2*dy - dx;

        if(dy <= dx){
            if(x1 > x2){
                x = x2;
                y = y2;
                xend = x1;
            }else{
                x = x1;
                y = y1;
                xend = x2;
            }

            g.drawLine(x, y, x, y);

            for(int i = x+1 ; i < xend ; i++){
                if(d1 < 0){
                    d1 = d1 + 2 * dy;
                }else{
                    d1 = d1 + 2 * (dy - dx);
                    if(y1 < y2) y++;
                    else y--;
                }
                g.drawLine(i, y, i, y);
            }
        }
    }
		
	
	public void mousePressed(MouseEvent e){
		x1 = e.getX();
		y1 = e.getY(); 
	}
	public void mouseReleased(MouseEvent e){
		x2 = e.getX();
		y2 = e.getY();

		BresenhamAlgo2(x1,y1,x2,y2);
	}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}


	public static void main(String []args){
		new BresenhamAlgorithm();
	}
}