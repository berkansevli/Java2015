
public class Watch extends Clock{
	String material;
	
	public Watch() {
	super();
	material="Not Set";
	}
	
	public Watch(String time, boolean analog,String mat){
		super(time,analog);
		material=mat;
		
	}

	public String toString() {
		return "Kol Saati" + super.toString() + " Malzemesi=" + material;
	}
}
