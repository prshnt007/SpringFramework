package com.prshnt.springframework;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App {

	public static void main(String[] args) {
		
		//BeanFactory bf = new XmlBeanFactory(new FileSystemResource("springApplication.xml"));
		//Person person = (Person)bf.getBean("person");
		//System.out.println(person.getName() +" "+person.getAge());
		
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("springApplication.xml");
		ac.registerShutdownHook();
		Person p = (Person)ac.getBean("person-alias");
		System.out.println(p);
		//System.out.println(p.getName()+" "+p.getAge()+" "+p.getNum()+" "+p.getAddress().getCity()+" "+p.getAddress().getState());

	}

}
