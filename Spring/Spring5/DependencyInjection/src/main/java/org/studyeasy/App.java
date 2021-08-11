package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corolla;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		
		// Instances:
		Car swift = new Swift();
		Car corolla = new Corolla();
		
		// LLamamos:
		System.out.println("Swift: " + swift.specs());
		System.out.println("Corolla: " + corolla.specs());

		
		// *** DEPENDENCY INJECTION ***
		AnnotationConfigApplicationContext context = 
				new	AnnotationConfigApplicationContext(AppConfig.class);
		
		// Instance our Car: 
		Car myCar = context.getBean("corolla",Car.class);
		System.out.println("My Car is: " + myCar.specs());		
		context.close();
		

	}

}
