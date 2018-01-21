package Strategy;

public class SaveCash2 extends SaveCash {

	@Override
	public void saveCash() {
		// TODO Auto-generated method stub
		int n= data_obj.getCashval();
		
		data_obj.setCashFinalval(n);
	}

}
