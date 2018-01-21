package DataContainer;

public class DataContainer2 extends DataMaster{
	static int firstval;
	static int secondval,thirdval,cashval,cashFinalval;
	static int price;
	static int W,superprice,regularprice,premiumprice,L,total;
	
	public void setFirstval(int val)
	{
		firstval = val;
	}
	public void setSecondval(int val)
	{
		secondval = val;
	}
	public void setthirdval(int val)
	{
		thirdval = val;
	}
	public void setL(int val)
	{
		L = val;
	}
	public int getL()
	{
		return L;
	}
	
	
	public int getFirstval()
	{
		return firstval;
	}
	public int getSecondval()
	{
		return secondval;
	}
	public int getthirdval()
	{
		return thirdval;
	}
	public void setCashval(int val)
	{
		cashval = val;
	}
	public void setCashFinalval(int val)
	{
		cashFinalval = val;
	}
	public int getCashFinalval()
	{
		return cashFinalval;
	}
	
	public void setSuperprice(int val)
	{
		superprice = val;
	}
	public void setRegularprice(int val)
	{
		regularprice = val;
	}
	public void setPremiumprice(int val)
	{
		premiumprice = val;
	}
	public int getSuperprice()
	{
		return superprice;
	}
	public int getRegularprice()
	{
		return regularprice;
	}
	public int getPremiumprice()
	{
		return premiumprice;
	}
	public void setprice(int x)
	{
		price = x;
	}
	public int getprice()
	{
		return price;
	}
	public void setW(int w) {
		// TODO Auto-generated method stub
		W = w;
	}

	public void settotal(int t) {
		// TODO Auto-generated method stub
		total = t;
	}
	public int gettotal() {
		// TODO Auto-generated method stub
		return total;
	}
	@Override
	public void setinitialvalue(int val) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getintitalvalue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getCashval() {
		// TODO Auto-generated method stub
		return cashval;
	}
	@Override
	public void setG(int g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getG() {
		// TODO Auto-generated method stub
		return 0;
	}
}
