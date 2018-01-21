package Strategy;

import DataContainer.DataMaster;

public abstract class setStartvalues {

	
	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 
	 public abstract void setstartingval();

	
}
