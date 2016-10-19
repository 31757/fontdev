package backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
		 private String brand;
	 private String model;
	 private String os;
	 private String version;
	 private String price;
	 
	 

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	// debugging strategy
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ",model=" + model + ",os=" + os + ",version=" + version + ", price=" + price + "]";
	}
	public static  Product add(Product p) {
		// TODO Auto-generated method stub
		return p;
		
		
	}
	public void insert(Product p) {
		// TODO Auto-generated method stub
		
	}
	
	

}
