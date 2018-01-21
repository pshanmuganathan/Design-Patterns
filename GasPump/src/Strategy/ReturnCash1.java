package Strategy;

public class ReturnCash1 extends ReturnCash{

	@Override
	public void returnCash() {
		// TODO Auto-generated method stub
		
		int total = data_obj.gettotal();
		int cash= data_obj.getCashFinalval();
		
		if(cash-total > 0)
		{
			System.out.println("Balance to be returned :" + (cash-total));
			
		}
		else
		{
			System.out.println("No Balance to be returned");
		}
		
	}

}
