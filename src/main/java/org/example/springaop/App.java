package org.example.springaop;

import org.example.springaop.pointcuts.Item;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Item item = (Item) context.getBean("itemBeanOne");
    	item.printItemDetails();
    	System.out.println(item.toString());
    }
}
