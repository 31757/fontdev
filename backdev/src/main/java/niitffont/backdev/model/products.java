package niitffont.backdev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class products {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String mobilemodel;
	@Column
	private String osversion;
	@Column
	private String price;
	public products(){}
	public products(String mobilemodel, String osversion, String price) {
		super();
		this.mobilemodel = mobilemodel;
		this.osversion = osversion;
		this.price = price;
	}
	public String getMobilemodel() {
		return mobilemodel;
	}
	public void setMobilemodel(String mobilemodel) {
		this.mobilemodel = mobilemodel;
	}
	public String getOsversion() {
		return osversion;
	}
	public void setOsversion(String osversion) {
		this.osversion = osversion;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public void setMobilemodel(int parseInt) {
		// TODO Auto-generated method stub
		
	}
	

}
