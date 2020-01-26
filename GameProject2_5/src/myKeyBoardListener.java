import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myKeyBoardListener  implements KeyListener{

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Basýlan Tuþ:" + KeyEvent.getKeyText(arg0.getKeyCode()));
		if(arg0.getKeyCode()==KeyEvent.VK_ESCAPE){
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
