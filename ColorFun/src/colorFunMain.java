import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PUBLIC_MEMBER;


public class colorFunMain {
	
	public static void main(String[] args){
		System.out.println("My first Java code... ");
		
		JFrame myWindow=new JFrame("Here is my first Jframe");
		
		myWindow.setSize(800, 500);
		myWindow.setExtendedState(myWindow.MAXIMIZED_BOTH);
		myWindow.setResizable(true);
		myWindow.setVisible(true);
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mypanel=new JPanel() {
		 public void paint(Graphics g){
			 super.paint(g);
			 this.setBackground(Color.black);
			 Graphics2D boyamaAlani=(Graphics2D) g;

			
			 
			 for(int i=50;i<500;i+=5)
			 {
				 boyamaAlani.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
				 boyamaAlani.fillOval((int)(Math.random()*800)+i, 100+i, 50, 50);
			 }

			 
		 }					
		};
		
		myWindow.add(mypanel);
	
		
		
		
	
		
	}

}
