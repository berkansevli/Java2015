package CreditCard;

import java.util.Random;

public class myRandomData {
	
	private static String[] names={"Ahmet", "�a�la", "Zeynep", "Leyla", "Bar��", "Nusret"};
	private static String[] lnames={"Deniz", "Do�an", "Kaya","Karaali"};
	private static String[] banks={"�� Bankas�", "Akbank", "Albaraka", "ING", "FinansBank", "Garanti"};
	
	
	public static String getRandomUser() {
		return names[(int) (Math.random()*names.length)]+ " " + lnames[(int) (Math.random()*lnames.length)];
	}
		
	
	public static String getRandomCardNumber() {
		return (int)(Math.random()*8000+1000) + " "  +
				(int)(Math.random()*8000+1000) + " "  +
				(int)(Math.random()*8000+1000) + " " +
				(int)(Math.random()*8000+1000);
	}
	
	
	
	
	
	public static String getRandomBank() {
	
		Random myR=new Random();
		return banks[myR.nextInt(banks.length)];
	}

}
