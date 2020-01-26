

public class AlarmClock extends Clock{
	int  alarmHour,alarmMin,alarmSec;
	boolean isAlarmSet;
	
	public AlarmClock() {
		super();
		alarmHour=0;
		alarmMin=0;
		alarmSec=0;
	}
	
	public AlarmClock(String timeToset,boolean analog,String alarmToSet){
		super(timeToset,analog);
		String[] myTime=alarmToSet.split(":");
		alarmHour=Integer.parseInt(myTime[0]);
		alarmMin=Integer.parseInt(myTime[1]);
		alarmSec=Integer.parseInt(myTime[2]);
		isAlarmSet=true;		
	}
	
	public void setAlarm(String alarmToSet){
		String[] myTime=alarmToSet.split(":");
		alarmHour=Integer.parseInt(myTime[0]);
		alarmMin=Integer.parseInt(myTime[1]);
		alarmSec=Integer.parseInt(myTime[2]);
		isAlarmSet=true;
	}
	
	public String toString() {
		return "Alarmlý Saat=" + super.toString()+ " Alarm Saati="+ alarmHour+":"+alarmMin+":"+alarmSec;
	}
	
	public String getAlarm() {
		return alarmHour+":"+alarmMin+":"+alarmSec;
	}
	
	


}
