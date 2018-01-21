package DataContainer;

public abstract class DataMaster {

	public abstract void setinitialvalue(int val);


	public abstract void setprice(int temp);

	public abstract int getintitalvalue();

	public abstract void setW(int w);

	public abstract void setFirstval(int val1);

	public abstract void setSecondval(int val2);
	public abstract void setthirdval(int val3);
	
	public abstract int getFirstval() ;

	public abstract int getSecondval();
	
	public abstract int getthirdval();
	
	public abstract void setSuperprice(int val2);
	
	public abstract void setRegularprice(int val2);
	public abstract void setPremiumprice(int val2);
	public abstract void setCashval(int val2);
	public abstract int getCashval();
	public abstract int getSuperprice();
	public abstract int getRegularprice();	
	public abstract int getPremiumprice(); 
	public abstract void setG(int g); 
	public abstract void settotal(int t);
	public abstract int getG();
	public abstract int gettotal();
	public abstract int getprice();
	
	public abstract void setCashFinalval(int val);
	public abstract int getCashFinalval();
	
	public abstract void setL(int val);
	
	public abstract int getL();
	

}
