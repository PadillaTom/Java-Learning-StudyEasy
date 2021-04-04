package org.studyeasy;

import org.studyeasy.person.NonVegan;
import org.studyeasy.person.Person;
import org.studyeasy.person.Vegan;

public class Hello {

	public static void main(String[] args) {
		
		Person person1 = new Vegan();
		person1.speak();
		person1.eat();
		person1.breathe();
		person1.message();
		
		Person person2 = new NonVegan();
		person2.speak();
		person2.eat();
		person2.breathe();
		person2.message();
	}

}
