
public class AlarmRadio extends AlarmClock{
	double frequency;
	boolean isRadioAlarm;
	
	public AlarmRadio() {
		super();
		frequency=100;
		isRadioAlarm=false;
	}
	
		
	public AlarmRadio(String timeToset,boolean analog,String alarmToSet,double fre,boolean isRadio) {
		super(timeToset,analog,alarmToSet);
		frequency=fre;
		isRadioAlarm=isRadio;
		
	}
	
	public void setRadio(Boolean setRadio){
		isRadioAlarm=setRadio;
	}
	
	public void setFrequency(double fr){
		frequency=fr;
	}
	
	public String toString() {
		return "Alarmlý Radyo=" + super.toString() + " Radyo ile mi ?" + isRadioAlarm + " Frekans:" + frequency;
	}

}
