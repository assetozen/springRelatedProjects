package com.assegd.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * the main class to run the application
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  // this is my third commit
    	// this will be shown only after i commit
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Alien a1 = context.getBean(Alien.class);
		a1.show();
    }
}
