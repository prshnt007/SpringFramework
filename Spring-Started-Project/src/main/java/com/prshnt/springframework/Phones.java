package com.prshnt.springframework;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Phones {
	
	private String phone;
	

	public Phones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Phones(String phone) {
		super();
		this.phone = phone;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

}
