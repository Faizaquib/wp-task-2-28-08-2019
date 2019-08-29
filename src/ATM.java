
public class ATM {
	CARD card;
	public void setCard(CARD card)
	{
		this.card = card;
	}
	
	public void doBalCheck()
	{
		if(card!=null)
			card.balEnquiry();
		else
			System.out.println("Please insert your bank's card");
	}
	
	public void doPinChange()
	{
		if(card!=null)
			card.pinChange();
		else
			System.out.println("Please insert your bank's card");
	}
	
	public void doDeposit(int rs)
	{
		card.deposit(rs);
	}
	
	public static void main(String...args)
	{
		ATM atm = new ATM();
		atm.setCard(new hdfcCARD());
		atm.doBalCheck();
		atm.doDeposit(1500);
		atm.doBalCheck();
		atm.doDeposit(2000);
		atm.doBalCheck();
		atm.doDeposit(2500);
		atm.doBalCheck();
		atm.doPinChange();
		//atm.setCard(new sbiCARD());
		//atm.doBalCheck();
		//atm.doPinChange();
		atm.setCard(new sbiCARD());
		atm.doBalCheck();
		atm.doDeposit(3000);
		atm.doBalCheck();
		atm.doDeposit(4000);
		atm.doBalCheck();
		atm.doDeposit(5500);
		atm.doBalCheck();
		atm.doPinChange();
		
	}
}