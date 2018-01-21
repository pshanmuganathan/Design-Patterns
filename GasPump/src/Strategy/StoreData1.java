package Strategy;

public class StoreData1 extends StoreData{

	@Override
	public void storeData() {
		// TODO Auto-generated method stub
		
		int a,b;
		a= data_obj.getFirstval();
		
		data_obj.setSuperprice(a);
		b=data_obj.getSecondval();
		
		data_obj.setRegularprice(b);
		
	}

	
	
	
}
