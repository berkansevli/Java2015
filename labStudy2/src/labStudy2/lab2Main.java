package labStudy2;

import java.util.Scanner;

public class lab2Main {

	//4	Create new enumeration (enum) type called gezegenler that contains names of the planets (Mars, Jupiter, Pluton, etc.) Enumeration must be placed outside of the main code block !
	public enum gezegenler {Mars,Jupiter, Pluton};
			
	public static void main(String[] args) {
		//1.Create string type variable called mesaj that contains:  Merhaba Dünyalý biz dostuz.
		String mesaj="Merhaba Dünyalý biz dostuz.";
		
		//2.Create another string type variable called name that contains name entered by the user using keyboard. (Use Scanner class)
		//Optional ask for name
		System.out.print("Please enter your name ");
		Scanner klavye_In=new Scanner(System.in);
		String name=klavye_In.nextLine();
		
		//3.Create integer variable called zaman and set it its value to user entered value by the keyboard.
		//Optional ask for time
		System.out.print("Please enter duration ");
				
		int zaman=klavye_In.nextInt();
		
		//Please see above for step 4.
		
		//5.Now printout following message by using string operations (substring, concatenation etc.)
		//Merhaba Dünyalý Ahmet, biz dostuz. Mars gezegeninden geliyoruz. Seni 4 aydýr izliyorduk.

		System.out.println(mesaj.substring(0, 16)+ name + mesaj.substring(15, mesaj.length())
		+ " " +gezegenler.Mars + " gezegeninden geliyoruz. Seni " + zaman + " aydýr izliyorduk.");
		
		//Please goto class location for steps 6 and 7
		
		//8.Now create object called hazineninYeri from class location andpPrint following line of text based on the object.
		//Merhaba Dünyalý Ahmet, biz dostuz. Mars gezegeninden geliyoruz. Seni 4 aydýr izliyorduk. Hazine 41.082266 enlem ve  37.628794 boylamda saklý.
		
		location hazineninYeri=new location();
		
		System.out.println(mesaj.substring(0, 16)+ name + mesaj.substring(15, mesaj.length())
		+ " " +gezegenler.Mars + " gezegeninden geliyoruz. Seni " + zaman + " aydýr izliyorduk."
		+ " Hazine " + hazineninYeri.lat + " enlem ve " + hazineninYeri.longi + " boylamda saklý");
		
		//9.Now use object  hazineninYeri  , set values (change) of lat and longi to 41.083713, and to 37.639771 respectively, and print above message again 
		//(message  at step 8 but different coordinates now!)

		hazineninYeri.lat=41.083713;
		hazineninYeri.longi=37.639771 ;
		
		System.out.println(mesaj.substring(0, 16)+ name + mesaj.substring(15, mesaj.length())
		+ " " +gezegenler.Mars + " gezegeninden geliyoruz. Seni " + zaman + " aydýr izliyorduk."
		+ " Hazine " + hazineninYeri.lat + " enlem ve " + hazineninYeri.longi + " boylamda saklý");

				
		//See class location for step 10.1
		
		
		//Step 10.2
		//call the method moveTreasure  with parameters 41.09 and 37.50 from main class  
		//and print out the message (step 8) again.
		
		hazineninYeri.moveTreasure(41.09, 37.50);
		
		System.out.println(mesaj.substring(0, 16)+ name + mesaj.substring(15, mesaj.length())
		+ " " +gezegenler.Mars + " gezegeninden geliyoruz. Seni " + zaman + " aydýr izliyorduk."
		+ " Hazine " + hazineninYeri.lat + " enlem ve " + hazineninYeri.longi + " boylamda saklý");

				
		
	}

}
