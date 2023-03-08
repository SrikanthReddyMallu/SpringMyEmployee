package eom.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee 
{
public static void main(String[] args) 
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
	Employee employee = (Employee) applicationContext.getBean("myemp");
	
	System.out.print(employee);
}
}
