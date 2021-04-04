package org.studyeasy.person;

public abstract class Person implements IsAlive, LiveLife {

	public void speak() {
		System.out.println("Speaking NON Abstract");
	}
	
	@Override
	public void breathe() {
		System.out.println("breathe()");
	}
	
	@Override
	public void message() {
		System.out.println("message()");
		
	}
	
	public abstract void eat();
	
}
