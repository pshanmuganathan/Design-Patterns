package Strategy;

public class PrintReceipt2 extends PrintReceipt {

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
		
		int total = data_obj.gettotal();
		System.out.println("Total Cost for the petrol filled : " + total);
	}

}
