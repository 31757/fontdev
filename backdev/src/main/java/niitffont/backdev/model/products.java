package niitffont.backdev.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Product-table")

public class Products {
	@Id
	@Column(name="ProductId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	@Column(name="model")
	private String model;
	@Column(name="brand")
	private String brand;
	@Column(name="os")
	private String os;
	@Column(name="version")
	private String version;
	@Column(name="price")
	private int price;
	public Products() {}
	public Products(int productid, String model, String brand,String os,String version, int price) {
		super();
		this.productid = productid;
		this.model = model;
		this.brand = brand;
		this.os = os;
		this.version = version;
		this.price = price;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
		
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
