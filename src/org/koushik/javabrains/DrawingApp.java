package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
	//Triangle triangle=new Triangle();
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	    // Triangle triangle= (Triangle)beanFactory.getBean("triangle");
	     // triangle.draw();
	      ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	                      Triangle traingle= (Triangle)context.getBean("triangle");
	traingle.draw();
	}
}
