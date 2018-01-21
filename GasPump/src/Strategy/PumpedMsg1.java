package Strategy;

public class PumpedMsg1 extends PumpedMsg{

	@Override
	public void pumpedunits() {
		// TODO Auto-generated method stub
		
		int g = data_obj.getG();
		System.out.println("No of Units filled : "+ g);
	}

}
