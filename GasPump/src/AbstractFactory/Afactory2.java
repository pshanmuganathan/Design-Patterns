package AbstractFactory;

import DataContainer.DataContainer1;
import DataContainer.DataContainer2;
import DataContainer.DataMaster;
import Strategy.CancelMsg;
import Strategy.CancelMsg1;
import Strategy.MenuDisplay;
import Strategy.MenuDisplay2;
import Strategy.NoReceipt;
import Strategy.NoReceipt1;
import Strategy.PayMsg;
import Strategy.PayMsg1;
import Strategy.PrintReceipt;
import Strategy.PrintReceipt1;
import Strategy.PrintReceipt2;
import Strategy.PumpGas;
import Strategy.PumpGas1;
import Strategy.PumpGas2;
import Strategy.PumpedMsg;
import Strategy.PumpedMsg1;
import Strategy.PumpedMsg2;
import Strategy.ReadyMsg;
import Strategy.ReadyMsg1;
import Strategy.RejectMsg;
import Strategy.RejectMsg1;
import Strategy.ReturnCash;
import Strategy.ReturnCash1;
import Strategy.SaveCash;
import Strategy.SaveCash2;
import Strategy.StopMsg;
import Strategy.StopMsg1;
import Strategy.StopMsg2;
import Strategy.StoreData;
import Strategy.StoreData1;
import Strategy.StoreData2;
import Strategy.setPrice;
import Strategy.setPrice1;
import Strategy.setPrice2;
import Strategy.setStartvalues;
import Strategy.setStartvalues1;
import Strategy.setStartvalues2;
import Strategy.setW;
import Strategy.setW1;

public class Afactory2 extends AbstractMaster {
	DataContainer2 data_obj= new DataContainer2();
	 public DataMaster getdataobject()
	 {
	        return new DataContainer2();
	 }
	 public StoreData getdata()
	 {
		 StoreData storedata_obj = new StoreData2();
	
		 storedata_obj.setdata(data_obj);
		 return storedata_obj;
	 }
	  public PayMsg getpaymentmessage()
	    { 
			  PayMsg paymsg_obj = new PayMsg1();
			  paymsg_obj.setdata(data_obj);
	          return paymsg_obj;

	    }
	public setW getsetW() {
		// TODO Auto-generated method stub
		setW setW_obj = new setW1();
		setW_obj.setdata(data_obj);
		return setW_obj;
	}
	public ReturnCash getreturncash() {
		// TODO Auto-generated method stub
		ReturnCash obj = new ReturnCash1();
		obj.setdata(data_obj);
		return obj;
	}
	public setPrice getsetPrice() {
		// TODO Auto-generated method stub
		setPrice obj = new setPrice2();
		obj.setdata(data_obj);
		return obj;
	}
	public setStartvalues getstartval() {
		// TODO Auto-generated method stub
		setStartvalues obj = new setStartvalues2();
		obj.setdata(data_obj);
		return obj;
	}
	public ReadyMsg getreadymsg() {
		// TODO Auto-generated method stub
		ReadyMsg obj = new ReadyMsg1();
		obj.setdata(data_obj);
		return obj;
	}
	public PumpGas getpumpgas() {
		// TODO Auto-generated method stub
		PumpGas obj= new PumpGas2();
		obj.setdata(data_obj);
		return obj;
	}
	public PumpedMsg getpumpedmsg() {
		// TODO Auto-generated method stub
		PumpedMsg obj= new PumpedMsg2();
		obj.setdata(data_obj);
		return obj;
	}
	public StopMsg getstopmsg() {
		// TODO Auto-generated method stub
		StopMsg obj= new StopMsg2();
		obj.setdata(data_obj);
		return obj;
	}
	public PrintReceipt getprintreceipt() {
		// TODO Auto-generated method stub
		PrintReceipt obj= new PrintReceipt2();
		obj.setdata(data_obj);
		return obj;
	}
	public RejectMsg getrejectmsg() {
		// TODO Auto-generated method stub
		RejectMsg obj= new RejectMsg1();
		obj.setdata(data_obj);
		return obj;
	}
	public CancelMsg getcancelmsg() {
		// TODO Auto-generated method stub
		CancelMsg obj= new CancelMsg1();
		obj.setdata(data_obj);
		return obj;
	}
	public SaveCash getsavecash() {
		// TODO Auto-generated method stub
		SaveCash obj= new SaveCash2();
		obj.setdata(data_obj);
		return obj;
	}
	public MenuDisplay getmenudisplay() {
		// TODO Auto-generated method stub
		MenuDisplay obj= new MenuDisplay2();
		obj.setdata(data_obj);
		return obj;
	}
	public NoReceipt getnoreceipt() {
		// TODO Auto-generated method stub
		NoReceipt obj= new NoReceipt1();
		obj.setdata(data_obj);
		return obj;
	}
}
