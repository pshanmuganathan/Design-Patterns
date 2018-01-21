package InputProcessor;

import AbstractFactory.AbstractMaster;
import DataContainer.DataMaster;
import MDAEFSM.mdaMaster;

public class GasPump1 {

	mdaMaster mda_obj;
	DataMaster data_obj;
	AbstractMaster abstractfact_obj;
	public void setmdaobject(mdaMaster obj)
	{
		mda_obj = obj;
	}
	public void setfactoryobject(AbstractMaster obj)
	{
	abstractfact_obj = obj;
	}
	public void setdataobject(DataMaster obj)
	{
		data_obj = obj;
	}
	public void Activate(int val1,int val2)
	{
		data_obj.setFirstval(val1);
		data_obj.setSecondval(val2);
		
		mda_obj.Activate();
	}
	public void Start()
	{
		mda_obj.Start();
	}
	public void PayCredit()
	{
		mda_obj.PayCredit();
	}
	public void Reject()
	{
		mda_obj.Reject();
	}
	public void Approved()
	{
		mda_obj.Approved();
	}
	public void Cancel()
	{
		mda_obj.Cancel();
	}
	public void Super()
	{
		mda_obj.SelectGas(2);
	}
	public void Regular()
	{
		mda_obj.SelectGas(1);
	}
	public void StartPump()
	{
		mda_obj.StartPump();
	}
	public void PumpGallon()
	{
		mda_obj.Pump();
	}
	public void StopPump()
	{
		mda_obj.StopPump();
		mda_obj.Receipt();
	}
}
