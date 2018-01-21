package Strategy;

import DataContainer.DataMaster;

public abstract class setPrice {
	
	DataMaster data_obj;
	 public void setdata(DataMaster obj)
	    {
		 data_obj=obj;
	    }
	 public abstract void setPrice(int x);
}
