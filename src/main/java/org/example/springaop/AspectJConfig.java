package org.example.springaop;

import org.aspectj.lang.JoinPoint;

public class AspectJConfig {


	public void printLogo(JoinPoint jp) {
		System.out.println("\n\n Logo printed before invocation of:" + jp.getSignature().getName());
		System.out.println("\n**************************\n"
							 +"********Q E N E L*********\n"+
							  "**************************\n");
	}
	
//	public void printLogo() {
//		System.out.println("\n**************************\n"
//							 +"********Q E N E L*********\n"+
//							  "**************************\n");
//	}
	
}
