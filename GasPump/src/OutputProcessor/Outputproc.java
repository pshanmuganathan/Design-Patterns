package OutputProcessor;

import AbstractFactory.AbstractMaster;
import DataContainer.DataMaster;
import Strategy.PayMsg;
import Strategy.StoreData;
import Strategy.setW;
import Strategy.setPrice;
import Strategy.setStartvalues;
import Strategy.ReadyMsg;
import Strategy.PumpGas;
import Strategy.PumpedMsg;
import Strategy.StopMsg;
import Strategy.PrintReceipt;
import Strategy.RejectMsg;
import Strategy.ReturnCash;
import Strategy.CancelMsg;
import Strategy.SaveCash;
import Strategy.MenuDisplay;
import Strategy.NoReceipt;
public class Outputproc {

	
	static AbstractMaster factory_obj;
	DataMaster data_obj;
	
	
	public void setdataobject(DataMaster obj)
	{
		data_obj= obj;

	}
	public void setfactoryobject(AbstractMaster obj)
	{
		factory_obj = obj;
	}
	public void storeData()
	{
	StoreData obj;
	obj = factory_obj.getdata();
	obj.storeData();
	}
	public void paymentMessage() {
		// TODO Auto-generated method stub
		PayMsg obj;
		obj = factory_obj.getpaymentmessage();
		obj.payMsg();
		
	}
	public void rejectMessage() {
		// TODO Auto-generated method stub
		PayMsg obj;
		obj = factory_obj.getpaymentmessage();
		obj.payMsg();
		
	}
	public void setW(int w) {
		// TODO Auto-generated method stub
		setW obj;
		obj = factory_obj.getsetW();
		obj.setW(w);
		
	}
	public void setPrice(int x) {
		// TODO Auto-generated method stub
		setPrice obj;
		obj = factory_obj.getsetPrice();
		obj.setPrice(x);
		
	}
	public void setStartvalues() {
		// TODO Auto-generated method stub
		setStartvalues obj;
		obj = factory_obj.getstartval();
		obj.setstartingval();
		
	}
	public void ReadyMsg() {
		// TODO Auto-generated method stub
		ReadyMsg obj;
		obj = factory_obj.getreadymsg();
		obj.readymessage();
		
	}
	public void pumpGasinfo() {
		// TODO Auto-generated method stub
		PumpGas obj;
		obj = factory_obj.getpumpgas();
		obj.pumpgas();
		
	}
	public void pumpedMsg() {
		// TODO Auto-generated method stub
		PumpedMsg obj;
		obj = factory_obj.getpumpedmsg();
		obj.pumpedunits();
		
	}
	public void returnCash() {
		// TODO Auto-generated method stub
		ReturnCash obj;
		obj = factory_obj.getreturncash();
		obj.returnCash();
		
	}
	public void stopMsg() {
		// TODO Auto-generated method stub
		StopMsg obj;
		obj = factory_obj.getstopmsg();
		obj.stopMsg();
		
	}
	public void printReceipt() {
		// TODO Auto-generated method stub
		PrintReceipt obj;
		obj = factory_obj.getprintreceipt();
		obj.Receipt();
		
	}
	public void RejectMsg() {
		// TODO Auto-generated method stub
		RejectMsg obj;
		obj = factory_obj.getrejectmsg();
		obj.rejectMsg();
		
	}
	public void CancelMsg() {
		// TODO Auto-generated method stub
		CancelMsg obj;
		obj = factory_obj.getcancelmsg();
		obj.cancelMsg();
		
	}
	public void saveCash() {
		// TODO Auto-generated method stub
		SaveCash obj;
		obj = factory_obj.getsavecash();
		obj.saveCash();
		
	}
	public void menuDisplay() {
		// TODO Auto-generated method stub
		MenuDisplay obj;
		obj = factory_obj.getmenudisplay();
		obj.menuDisplay();
		
	}
	public void noReceipt() {
		// TODO Auto-generated method stub
		NoReceipt obj;
		obj = factory_obj.getnoreceipt();
		obj.noReceipt();
		
	}
}

