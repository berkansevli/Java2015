
public class Clock {
	
	int hour;
	int minu;
	int seco;
	boolean isDigital;
	hourFormat clockFormat;
	
	public Clock() {
		hour=0;
		minu=0;
		seco=0;
		isDigital=false;
		clockFormat=hourFormat.AM;
	}
	
	public Clock(String time, boolean analog){
		String[] myTime=time.split(":");
		hour=Integer.parseInt(myTime[0]);
		minu=Integer.parseInt(myTime[1]);
		seco=Integer.parseInt(myTime[2]);
		clockFormat=hourFormat.AM;
		analog=false;
		
	}
	
	public void addMinutes(int mintoAdd) {
		minu+=mintoAdd;
	}
	
	public String toString() {
		return "Saat="+ hour+":"+minu+":"+seco+" " + clockFormat;
	}

}
