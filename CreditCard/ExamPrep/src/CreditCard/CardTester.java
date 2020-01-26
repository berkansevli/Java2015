package CreditCard;

public class CardTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard[] myVisaCards=new CreditCard[50];
		
		for(int i=0;i<50;i++){
			CreditCard card=new CreditCard(myRandomData.getRandomCardNumber(), 
					myRandomData.getRandomUser(), 
					myRandomData.getRandomBank(), 
					0.0, (int)(Math.random()*20000+1000));
			myVisaCards[i]=card;
		}
		
		//print the random cards
		for(int i=0;i<50;i++){
			System.out.println(myVisaCards[i]);
		}
	}

}
