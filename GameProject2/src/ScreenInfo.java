import java.awt.Toolkit;

public class ScreenInfo {
	Toolkit myT;

	public ScreenInfo() {
		myT = Toolkit.getDefaultToolkit();

	}

	public int getHeight() {
		return (int) myT.getScreenSize().getHeight();
	}

	public int getWidth() {
		return (int) myT.getScreenSize().getWidth();
	}
	
	public String toString() {
		return "Ekran:" + this.getWidth() + "x" + this.getHeight();
	}

}
