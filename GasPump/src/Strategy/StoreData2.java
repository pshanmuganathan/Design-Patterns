package Strategy;

public class StoreData2 extends StoreData {

	@Override
	public void storeData() {
		// TODO Auto-generated method stub
		int a,b,c;
		a= data_obj.getFirstval();
		
		data_obj.setRegularprice(a);
		b=data_obj.getSecondval();
		
		data_obj.setSuperprice(b);
		c=data_obj.getthirdval();
		data_obj.setPremiumprice(c);
		
	}

}
