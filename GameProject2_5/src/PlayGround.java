import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;


public class PlayGround  extends Canvas  implements Runnable {

	public boolean run=false;
	public int posX=25;
	public int speedX=5;
	public int posY=25;
	public int speedY=3;
	public int grassWidth=20;
	ScreenInfo ekran=new ScreenInfo();

	
	public PlayGround() {
		this.setBackground(Color.BLACK);	
	}
	
	public PlayGround(Color c) {
		this.setBackground(c);	
	}

	@Override
	public void run() {
		System.out.println("Game Loop Started...");	
		while(run) {
			update();
			try {
				Thread.sleep(1);
				//System.out.println("speed="+speedX);
				draw();
				
			}catch (Exception ex){
				System.out.println("Hata");
			}
		}
	}
	
	public void draw() {
		createBufferStrategy(2);
		BufferStrategy bf = this.getBufferStrategy();
		Graphics2D g = null;
		
		try {
			g = (Graphics2D) bf.getDrawGraphics();
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	                RenderingHints.VALUE_ANTIALIAS_ON);
			
			//Ciziminizi bu satýrlardan itibaren gerçekleþtirebilirsiniz
			//Buffer kullanarak silinme etkisini kaldýrdýk
	 
			g.setColor(Color.RED.brighter());
			g.fillOval(posX, posY, 15, 15);
			
			g.setColor(Color.WHITE.brighter());
			g.fillOval(ekran.getWidth()-posX, ekran.getHeight()-grassWidth-posY, 5, 5);
			
			g.setColor(Color.green.brighter());
			g.fillRect(0, ekran.getHeight()-grassWidth, ekran.getWidth(), grassWidth);
	
			g.dispose();
		
	 
		} finally {
			// It is best to dispose() a Graphics object when done with it.
			g.dispose();
		}
	 
	
		bf.show();
	 
	    Toolkit.getDefaultToolkit().sync();	
	        

				
	}
	
	public void update() {
		
		if(posX>=ekran.getWidth() || posX<=0) {		
			speedX=-1*speedX;	
		}
		
		if(posY>=ekran.getHeight()-grassWidth || posY<=0) {		
			speedY=-1*speedY;	
		}
		posX=posX+speedX;
		posY=posY+speedY;
	}
	
	public synchronized void basla() {
		System.out.println("Game Started...");
		run=true;
		new Thread(this).start();
	}
	public synchronized void dur() {
		System.out.println("Game Finished...");
	}
	
	
	

}
