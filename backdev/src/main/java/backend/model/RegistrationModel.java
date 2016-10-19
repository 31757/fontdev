package backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class RegistrationModel {

	@Id
	@Column(name="uid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int uid;
	@Column
	public String uname;
	@Column
	public String email;
	@Column
	public String pwd;
	@Column
	public String gen;
	@Column
	public String address;
	


	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getGen() {
		return gen;
	}



	public void setGen(String gen) {
		this.gen = gen;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	
}

