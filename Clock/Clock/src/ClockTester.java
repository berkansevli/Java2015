
public class ClockTester {

	public static void main(String[] args) {
		Clock myNewClk=new Clock("12:34:45",false);
		System.out.println(myNewClk);
		
		Watch kolSaati=new Watch("13:34:43",true,"Deri");
		System.out.println(kolSaati);
		
		AlarmClock alarmliSaat=new AlarmClock("12:35:45",false,"08:00:00");
		System.out.println(alarmliSaat);
		alarmliSaat.addMinutes(20);
		System.out.println(alarmliSaat);
		
		AlarmRadio alarmRadyo=new AlarmRadio("21:30:45",false,"09:45:00",94.3,true);
		System.out.println(alarmRadyo);
		
	}

}
