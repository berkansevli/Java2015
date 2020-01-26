package CreditCard;

public class CreditCard {
	private String number;
	private String name;
	private String bank;
	private double balance;
	private double limit;
	
	public CreditCard() {
		
		this.number = "Not Set";
		this.name = "No Name";
		this.bank = "No Bank";
		this.balance = 0.0;
		this.limit = 0.0;
	}
	
	public CreditCard(String number, String name, String bank, double balance, double limit) {
		
		this.number = number;
		this.name = name;
		this.bank = bank;
		
		if (balance<0)
			balance=0.0;
		else
			this.balance = balance;
		
		
		if (limit<100)
			this.limit=100;
		else
			this.limit = limit;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if(number.length()==19)
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null)
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		if(bank!=null)
		this.bank = bank;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>=0)
		this.balance = balance;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		if(limit>0)
		this.limit = limit;
	}
	
	@Override
	public String toString() {
		return "CreditCard [number=" + number + ", name=" + name + ", bank=" + bank + ", balance=" + balance
				+ ", limit=" + limit + "]";
	}
	


}
