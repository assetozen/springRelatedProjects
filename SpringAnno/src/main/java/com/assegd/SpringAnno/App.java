package com.assegd.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring core annotations
 *
 */
public class App 
{
	/* checking the commit for third time*/
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
      Samsung s7 = factory.getBean(Samsung.class);
      s7.config();
      

    }
}
