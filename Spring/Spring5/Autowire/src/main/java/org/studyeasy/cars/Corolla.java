package org.studyeasy.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;
import org.studyeasy.interfaces.Engine;

@Component("corolla")
public class Corolla implements Car {

	@Autowired(required = false)
	@Qualifier("V8Engine")
	Engine engine;	

	// Methods:
	@Override
	public String specs() {
		String specs = "Toyota Corolla with Engine: " + engine.type();
		return specs;
	}
}
