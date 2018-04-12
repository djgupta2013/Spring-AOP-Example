package abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import abcd.A; 

public class Test {
	
     public static void main(String[] args) {  
    	 //Resource r=new ClassPathResource("applicationContext.xml");  
    	 ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	 System.out.println(factory);
      
    	 A a=factory.getBean("proxy",A.class);
    	  
    	 a.m(); 
    	
} 
}  
