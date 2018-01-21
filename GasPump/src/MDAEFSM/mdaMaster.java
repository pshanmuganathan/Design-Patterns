package MDAEFSM;

import State.StateMaster;

public class mdaMaster {

	StateMaster currentState;
	StateMaster[] statelist = new StateMaster[8];
	public void setCurrentState(StateMaster state)
	{
		currentState = state;
	}
	
	public void AddStateList(StateMaster state0,StateMaster state1,StateMaster state2,StateMaster state3,StateMaster state4,StateMaster state5,StateMaster state6,StateMaster state7)
	{
		statelist[0]= state0;
		statelist[1]= state1;
		statelist[2]= state2;
		statelist[3]= state3;
		statelist[4]= state4;
		statelist[5]= state5;
		statelist[6]= state6;
		statelist[7]= state7;
		
	}
	public void Activate()
	{
		int current = currentState.getCurrentStateId();
		if(current == 0)
		{
			currentState.Activate();
			//System.out.println("State is in state0 and will change to State1");
			currentState = statelist[1];
		}
		
	}
	public void Start()
	{
		int current = currentState.getCurrentStateId();
		if(current == 1)
		{
			currentState.Start();
			//System.out.println("State is in state1 and will change to State2");
			currentState = statelist[2];
		}
		
	}
	public void PayCredit()
	{
		int current = currentState.getCurrentStateId();
		if(current == 2)
		{
			currentState.PayCredit();
			//System.out.println("State is in state2 and will change to State3");
			currentState = statelist[3];
		}
		
	}
	public void PayCash()
	{
		int current = currentState.getCurrentStateId();
		if(current == 2)
		{
			currentState.PayCash();
			//System.out.println("State is in state2 and will change to State4");
			currentState = statelist[4];
		}
		
	}
	public void Reject()
	{
		int current = currentState.getCurrentStateId();
		if(current == 3)
		{
			currentState.Reject();
			//System.out.println("State is in state3 and reject and will change to State1");
			currentState = statelist[1];
		}
		
	}
	public void Approved()
	{
		int current = currentState.getCurrentStateId();
		if(current == 3)
		{
			currentState.Approved();
			//System.out.println("State is in state3 and approved and will change to State4");
			currentState = statelist[4];
		}
		
	}
	public void Cancel()
	{
		int current = currentState.getCurrentStateId();
		if(current == 4)
		{
			currentState.Cancel();
			//System.out.println("State is in state4 and cancelled and will change to State1");
			currentState = statelist[1];
		}
		
	}
	public void SelectGas(int x)
	{
		int current = currentState.getCurrentStateId();
		if(current == 4)
		{
			currentState.SelectGas(x);
			//System.out.println("State is in state4 and will change to State5");
			currentState = statelist[5];
		}
		
	}
	public void StartPump()
	{
		int current = currentState.getCurrentStateId();
		if(current == 5)
		{
			currentState.StartPump();
			//System.out.println("State is in state5 and will change to State6");
			currentState = statelist[6];
		}
		
	}
	public void Pump()
	{
		int current = currentState.getCurrentStateId();
		if(current == 6)
		{
			currentState.Pump();
			//System.out.println("State is in state6 and gas is pumped");
			currentState = statelist[6];
		}
		
	}
	public void StopPump()
	{
		int current = currentState.getCurrentStateId();
		if(current == 6)
		{
			currentState.StopPump();
			//System.out.println("State is in state6 and will change to 7");
			currentState = statelist[7];
		}
		
	}
	public void Receipt()
	{
		int current = currentState.getCurrentStateId();
		if(current == 7)
		{
			currentState.Receipt();
			//System.out.println("State is in state7 and will change to 1");
			currentState = statelist[1];
		}
		
	}
	public void NoReceipt()
	{
		int current = currentState.getCurrentStateId();
		if(current == 7)
		{
			currentState.NoReceipt();
			//System.out.println("State is in state7 and will change to 1");
			currentState = statelist[1];
		}
		
	}
	public void ReturnCash()
	{
		int current = currentState.getCurrentStateId();
		if(current == 7)
		{
			currentState.ReturnCash();
			//System.out.println("State is in state7 and will change to 1");
			currentState = statelist[1];
		}
		
	}
}
