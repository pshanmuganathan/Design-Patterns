package Strategy;

public class PrintReceipt1 extends PrintReceipt {

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
		int total = data_obj.gettotal();
		System.out.println("Total Cost for petrol : " + total);
	}

}
