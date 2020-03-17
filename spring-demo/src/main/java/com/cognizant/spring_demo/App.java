package com.cognizant.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Address address = context.getBean(Address.class,"address");
    	System.out.println(address);
    	Student student =context.getBean(Student.class,"student");
    	System.out.println(student);
    	Employee employee= context.getBean(Employee.class, "employee");
    	System.out.println(employee);
    	Organization org = context.getBean(Organization.class, "organization");
    	System.out.println(org);
    	((ClassPathXmlApplicationContext) context).close();
    	
    }
}
