import java.awt.Canvas;
import java.awt.Color;


public class PlayGround  extends Canvas  implements Runnable {

	public boolean run=false;
	
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
			//update();
			try {
				Thread.sleep(5000);
				System.out.println("Called again...");
				//draw();
				
			}catch (Exception ex){
				System.out.println("Hata");
			}
		}
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
