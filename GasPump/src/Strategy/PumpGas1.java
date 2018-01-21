package Strategy;

public class PumpGas1 extends PumpGas {

	@Override
	public void pumpgas() {
		// TODO Auto-generated method stub
		int g= data_obj.getG();
		g=g+1;
		int price = data_obj.getprice();
		int total = price * g;
		data_obj.setG(g);
		data_obj.settotal(total);
	}

}
