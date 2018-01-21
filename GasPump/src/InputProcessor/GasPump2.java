package InputProcessor;

import AbstractFactory.AbstractMaster;
import DataContainer.DataMaster;
import MDAEFSM.mdaMaster;

public class GasPump2 {
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
	public void Activate(int val1,int val2,int val3)
	{
		data_obj.setFirstval(val1);
		data_obj.setSecondval(val2);
		data_obj.setthirdval(val3);
		
		mda_obj.Activate();
	}
	public void Start()
	{
		mda_obj.Start();
	}
	public void PayCash(int val)
	{
		data_obj.setCashval(val);
		mda_obj.PayCash();
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
	public void Premium()
	{
		mda_obj.SelectGas(3);
	}
	public void StartPump()
	{
		mda_obj.StartPump();
	}
	public void PumpLiter()
	{
		int cash= data_obj.getCashFinalval();
		int price= data_obj.getprice();
		int L = data_obj.getL();
		System.out.println("Cash:"+ cash + "Price:"+ price + "L:"+ L);
		if(cash<(L+1)*price)
		{
			mda_obj.StopPump();
		}
		else
		{
		mda_obj.Pump();
		}
	}
	public void StopPump()
	{
		mda_obj.StopPump();
		
	}
	public void Receipt()
	{
		mda_obj.Receipt();
		mda_obj.ReturnCash();
		
	}
	public void NoReceipt()
	{
		mda_obj.NoReceipt();
		mda_obj.ReturnCash();
		
	}
}
