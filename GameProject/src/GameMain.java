import java.awt.Color;

import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {
		ScreenInfo ekran=new ScreenInfo();
		System.out.println(ekran);
		JFrame pencere=new JFrame();
		pencere.setTitle("My First Game");
		pencere.setSize(800, 200);
		pencere.setResizable(false);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PlayGround oyunAlani=new PlayGround(Color.red);
		oyunAlani.basla();
		pencere.add(oyunAlani);
		pencere.setVisible(true);
		

	}

}
