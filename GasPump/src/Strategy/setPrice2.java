package Strategy;

public class setPrice2 extends setPrice {

	@Override
	public void setPrice(int x) {
		// TODO Auto-generated method stub
		int a = data_obj.getSuperprice();
		int b = data_obj.getRegularprice();
		int c= data_obj.getPremiumprice();
		
		if(x==1)
		{
			data_obj.setprice(b);
		}
		else if (x==2)
		{
			data_obj.setprice(a);
		}
		else
		{
			data_obj.setprice(c);
		}
	}

}
