package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		// TODO Auto-generated method stub
		return "Toyota Corolla";
	}

}
