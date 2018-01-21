package Strategy;

import DataContainer.DataMaster;

public abstract class CancelMsg {
	
	
	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 
	 public abstract void cancelMsg();

}
