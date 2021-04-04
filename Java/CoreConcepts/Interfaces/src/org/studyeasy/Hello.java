package org.studyeasy;

import org.studyeasy.phone.Iphone8;
import org.studyeasy.phone.OnePlus5;
import org.studyeasy.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		
		Phone phone1 = new OnePlus5();
		System.out.println(phone1.processor());
		
		Phone phone2 = new Iphone8();
		System.out.println(phone2.spaceInGb());
				
	}

}
