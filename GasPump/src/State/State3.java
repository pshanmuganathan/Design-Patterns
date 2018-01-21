package State;

public class State3 extends StateMaster{

	public void Reject()
	{
		System.out.println("Card Rejected");
		out.RejectMsg();
	}
	

	public void Approved()
	{
		System.out.println("Card Approved");
		out.setW(1);
		
	}
}
