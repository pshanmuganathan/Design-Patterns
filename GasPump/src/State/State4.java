package State;

public class State4 extends StateMaster{

	public void Cancel()
	{
		System.out.println("Transaction Cancelled");
		out.CancelMsg();
	}
	
	public void SelectGas(int x)
	{
		
		out.setPrice(x);
	}
	
}
