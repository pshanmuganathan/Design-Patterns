package State;
import OutputProcessor.Outputproc;

public class StateMaster {
int StateId;
Outputproc out;
public int getCurrentStateId()
{
	return StateId;
}
public void setStateId(int stateptr)
{
	StateId= stateptr;

}
public void setOutputObject(Outputproc obj)
{
	out = obj;
}
public void Activate(){}
public void Start(){}
public void PayCash(){}
public void PayCredit(){}

public void Approved(){}
public void Reject(){}
public void SelectGas(int g){}
public void Cancel(){}
public void StartPump(){}
public void Pump(){}
public void StopPump(){}
public void Receipt(){}
public void NoReceipt(){}
public void ReturnCash(){}

}
