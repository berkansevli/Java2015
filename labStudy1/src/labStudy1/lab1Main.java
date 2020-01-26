package labStudy1;

import java.util.Scanner;

public class lab1Main {

	public static void main(String[] args) {
		
		//1.Write a complete main method that would print your last name, 
		//followed by a comma, followed by a space and your first name.
		System.out.println("Dogan, Fýrat");
		
		/*
		2.Add another print command (one command)  to print following lines of text:
		O dosyayý “C:\Windows\System” klasörü altýnda
		bulabilirsin. Ahmet’ in bilgisayarýnda o dizindeydi.
		*/
		System.out.println("O dosyayý \"C:\\Windows\\System\" klasörü altýnda\nbulabilirsin. Ahmet\'in bilgisayarýnda o dizindeydi.");
		
		//3.Declare  two integer  variables  named  profitStartOfQuarter and cashFlowEndOfYear.
		int profitStartOfQuarter,cashFlowEndOfYear;
		
		//4.Declare  an integer  variable  count  and initialize  it to 13.
		int count=13;
		
		//5.Declare  a long integer  variable  named  grossNationalProduct.
		long grossNationalProduct;
		
		//6.Given  an integer  variable  count, write a statement  that displays the value  of count on the screen. 
		//Do not display anything else on the screen -- just the value  of count.
		System.out.println(count);
		
		//7.Assume  that word is a String  variable . Write a statement  to display the message  
		//"Today's Word-Of-The-Day is: " followed by the value  of word. 
		//The message  and the value  of word should appear together, on  a single line on standard output .
		String word="Father\'s Day";
		System.out.println("Today\'s Word-Of-The-Day is: "+ word);
		
		//8.Declare  an integer  constant , monthsInYear, whose value  is 12. 
		//Declare  a constant  monthsInDecade, whose value  is the value  of the constant  monthsInYear  multiplied by 10.
		final int monthsInYear=12;
		final int monthsInDecade=monthsInYear*10;
		
		/*
		Simple Lab Project:
		Create new Java Project to build  an application that reads values representing a time 
		duration in hours, minutes, and seconds and then prints the equivalent total number of 
		seconds. (For example, 1 hour, 18 minutes, and 32 seconds is equivalent to 4712 seconds.
		*/
		
		System.out.println("-------Project-------");
		
		//To read values from keyboard create instance of Scanner class
		Scanner input_FD=new Scanner(System.in);
		
		System.out.print("Please enter hours=");
		int hours=input_FD.nextInt();
		
		System.out.print("Please enter minutes=");
		int mins=input_FD.nextInt();
		
		
		System.out.print("Please enter seconds=");
		int seco=input_FD.nextInt();
		
		int totalSecond=(hours*60*60)+(mins*60)+seco;
		
		System.out.println("Total time elapsed in seconds is: " + totalSecond);
		
				

	}

}
