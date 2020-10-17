package com.prshnt.springframework;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@Component
public class Person implements ApplicationContextAware,BeanNameAware , InitializingBean , DisposableBean{
	
	/*
	 * private String name; private int age; private int num;
	 */
	@Autowired
	Address address;
	@Autowired
	Phones phones;
	ApplicationContext appctxt=null; 
	@Autowired
	MessageSource msgSource;
	
	//List<Phones> phoneList;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(Address address, Phones phones) {
		super();
		this.address = address;
		this.phones = phones;
	}



	public Person(Address address) {
		super();
		this.address = address;
	}

	
	public Person(Phones phones) {
		super();
		this.phones = phones;
	}

	/*
	 * public Person(String name, int age, int num, Address address, Phones phone) {
	 * super(); this.name = name; this.age = age; this.num = num; this.address =
	 * address; this.phones = phone; }
	 */
	

	

	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getAge() { return age; } public void
	 * setAge(int age) { this.age = age; }
	 * 
	 * public int getNum() { return num; }
	 * 
	 * public void setNum(int num) { this.num = num; }
	 */

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phones getPhone() {
		return phones;
	}

	public void setPhone(Phones phones) {
		
		//Phones ph =(Phones) appctxt.getBean("phone");
		
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [ city=" + address.getCity() + ",state= "+address.getState() + ", phones=" + phones.getPhone()
				+ "]";
	}



	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.appctxt= applicationContext;
		
	}



	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is :" + name);
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroy bean method");
		
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing bean method");
		
	}
	
	public void myInit() {
		System.out.println("My init method call");
	}

	public void cleanUp() {
		System.out.println("my clean up method call");
	}

	

	/*
	 * public List<Phones> getPhoneList() { return phoneList; }
	 * 
	 * public void setPhoneList(List<Phones> phoneList) { this.phoneList =
	 * phoneList; }
	 */

	/*
	 * @Override public String toString() { return "Person [name=" + name + ", age="
	 * + age + ", num=" + num + ", city=" + address.getCity() +", state=" +
	 * address.getState() + ", phoneList=" +
	 * phoneList.get(0).getPhone()+","+phoneList.get(1).getPhone() + "]"; }
	 */
	
	

	/*
	 * @Override public String toString() { return "Person [name=" + name + ", age="
	 * + age + ", num=" + num + ", city=" + address.getCity() +", city=" +
	 * address.getState() + "]"; }
	 */
	
	
	

}
