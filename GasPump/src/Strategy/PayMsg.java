package Strategy;

import DataContainer.DataMaster;

public abstract class PayMsg {
	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 public abstract void payMsg();
}
