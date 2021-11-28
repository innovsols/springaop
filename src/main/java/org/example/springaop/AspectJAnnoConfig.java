package org.example.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJAnnoConfig {

	@Pointcut("execution(* org.example.springaop.pointcuts.Item.*(..))")
	private void pointcutMethod() {}
	
	@Before("pointcutMethod()")
	public void printLogo(JoinPoint jp) {
		System.out.println("\n\n Logo printed before invocation of:" + jp.getSignature().getName());
		System.out.println("\n**************************\n"
							 +"********Q E N E L*********\n"+
							  "**************************\n");
		
	}
}
