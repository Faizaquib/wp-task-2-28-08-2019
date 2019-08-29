
public class sbiCARD implements CARD {
    
	int accTotal;
	public void balEnquiry() {
		System.out.println("your SBI account's balance is : "+accTotal);
	}

	public void pinChange() {
		System.out.println("your SBI account's pin has been updated successfully!");
	}
	public void deposit(int rs)
	{
		accTotal = accTotal + rs;
	}
	

}
