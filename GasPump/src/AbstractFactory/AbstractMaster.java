package AbstractFactory;

import Strategy.CancelMsg;
import Strategy.MenuDisplay;
import Strategy.NoReceipt;
import Strategy.PayMsg;
import Strategy.PrintReceipt;
import Strategy.PumpGas;
import Strategy.PumpedMsg;
import Strategy.ReadyMsg;
import Strategy.RejectMsg;
import Strategy.ReturnCash;
import Strategy.SaveCash;
import Strategy.StopMsg;
import Strategy.StoreData;
import Strategy.setPrice;
import Strategy.setStartvalues;
import Strategy.setW;

public abstract class AbstractMaster {

	
	public abstract StoreData getdata();
	public abstract PayMsg getpaymentmessage();
	public abstract setW getsetW();
	public abstract setPrice getsetPrice();
	public abstract setStartvalues getstartval();
	public abstract ReadyMsg getreadymsg();
	public abstract PumpGas getpumpgas();
	public abstract PumpedMsg getpumpedmsg();
	public abstract StopMsg getstopmsg();
	public abstract PrintReceipt getprintreceipt();
	public abstract RejectMsg getrejectmsg();
	public abstract CancelMsg getcancelmsg();
	public abstract SaveCash getsavecash();
	public abstract MenuDisplay getmenudisplay();
	public abstract NoReceipt getnoreceipt();
	public abstract ReturnCash getreturncash();
}
