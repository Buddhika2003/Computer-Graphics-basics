import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoDGraphics extends JFrame{
	
	DDA(){
		setTitle("TwoDGraphics");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[]args){
		new TwoDGraphics();
	}
}