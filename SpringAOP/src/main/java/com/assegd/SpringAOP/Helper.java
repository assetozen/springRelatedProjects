package com.assegd.SpringAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * All the Cross cutting concerns are inside this class
 * @author a.asfaw
 *
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

	@Before("execution(public void show())")
	public void log() {
		System.out.println("show called. . . showing log");
	}
	

}
