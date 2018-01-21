package State;

public class State6 extends StateMaster{

	
	public void Pump()
	{
		out.pumpGasinfo();
		out.pumpedMsg();
	}
	
	public void StopPump(){
		out.stopMsg();
	}
}
