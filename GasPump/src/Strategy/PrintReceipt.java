package Strategy;

import DataContainer.DataMaster;

public abstract class PrintReceipt {

	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 
	 public abstract void Receipt();
}
