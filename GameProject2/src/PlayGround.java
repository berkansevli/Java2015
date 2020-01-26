import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class PlayGround  extends Canvas  implements Runnable {

	public boolean run=false;
	public int posX=25;
	public int speedX=5;
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
				Thread.sleep(10);
				//System.out.println("speed="+speedX);
				draw();
				
			}catch (Exception ex){
				System.out.println("Hata");
			}
		}
	}
	
	public void draw() {
		Graphics g=this.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, ekran.getWidth(), ekran.getHeight());
		g.setColor(Color.red);
		g.fillOval(posX, 25, 20, 20);
				
	}
	
	public void update() {
		
		if(posX>=ekran.getWidth() || posX<=0) {		
			speedX=-1*speedX;	
		}
		posX=posX+speedX;
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
