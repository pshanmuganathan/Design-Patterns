package Strategy;

public class PumpGas2 extends PumpGas{

	@Override
	public void pumpgas() {
		// TODO Auto-generated method stub
		int L= data_obj.getL();
		L=L+1;
		int price = data_obj.getprice();
		int total = price * L;
		data_obj.setL(L);
		data_obj.settotal(total);
	}

}
