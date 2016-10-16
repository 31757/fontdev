package niitffont.backdev.dto;

public class productsdto {

	
	private String mobilemodel;
	private String osversion;
	private int price;
	
	public String getmobilemodel() {
	return mobilemodel;
	}
	public void setmobilemodel(String mobilemodel) {
	this.mobilemodel = mobilemodel;
	}
	public String getosversion() {
	return osversion;
	}
	public void setosversion(String osversion) {
	this.osversion = osversion;
	}
	public int getprice() {
	return price;
	}
	public void setprice(int price) {
	this.price = price;
	}
	@Override
	public String toString() {
	return "products [mobilemodel=" + mobilemodel + ", osversion=" + osversion + ", price=" + price + "]";
	}
	}

