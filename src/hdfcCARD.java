
public class hdfcCARD implements CARD {
	
	int accTotal; 
	public void balEnquiry() {
		System.out.println("your HDFC account's balance is : "+accTotal);
	}

	public void pinChange() {
		System.out.println("your HDFC account's pin has been updated successfully!");
	}
	public void deposit(int rs)
	{
		accTotal = accTotal + rs;
	}
	

}
