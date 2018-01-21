package Strategy;

import DataContainer.DataMaster;

public abstract class PumpedMsg {

	
	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 
	 public abstract void pumpedunits();
	 }
