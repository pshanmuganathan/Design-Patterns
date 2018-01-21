package Strategy;

public class setPrice1 extends setPrice {

	@Override
	public void setPrice(int x) {
		// TODO Auto-generated method stub
		
		int a = data_obj.getSuperprice();
		int b = data_obj.getRegularprice();
		
		if(x==1)
		{
			data_obj.setprice(b);
		}
		else
		{
			data_obj.setprice(a);
		}
	}

}
