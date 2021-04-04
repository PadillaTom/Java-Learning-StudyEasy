package org.studyeasy.phone;

public class Iphone8 implements Phone{

	@Override
	public String processor() {
		return "iphone";
	}

	@Override
	public String OS() {
		return "Ios";
	}

	@Override
	public int spaceInGb() {
		return 128;
	}

}
