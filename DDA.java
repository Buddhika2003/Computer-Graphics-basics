import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DDA extends JFrame implements MouseListener{
	
	DDA(){
		setTitle("DDA algorithm");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setVisible(true);
	}

	public static void main(String[]args){
		new DDA();
	}
}