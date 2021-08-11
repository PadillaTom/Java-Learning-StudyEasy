package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		// *** DEPENDENCY INJECTION ***
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(AppConfig.class);
		
		// Instance our Car: 
		Car myCar = context.getBean("corolla",Car.class);
		
		System.out.println("My Car is: " + myCar.specs());	
		
		// Close Context:
		context.close();
		

	}
}
