package com.practise;

import org.testng.annotations.Test;

public class CreateCampaginTest {

	@Test
	public void createCampaginWithMandatoryTest() {
		System.out.println("createCampaginWithMandatoryTest executed ");
		String BROWSER=System.getProperty("browser","chrome");
		String URL=System.getProperty("url","http://localhost:8088");
		String USERNAME	=System.getProperty("username","admin");    
		String PASSWORD=System.getProperty("password","admin");
		System.out.println(" browser is "+ " "+BROWSER);
		System.out.println(" url is "+ " "+URL);
		System.out.println(" username is "+ " "+USERNAME);
		System.out.println(" password is "+ " "+PASSWORD);
	}

	@Test
	public void modfifyCampaginWithMandatoryTest() {
		System.out.println("modfifyCampaginWithMandatoryTest executed ");
	}

	@Test
	public void deleteCampaginWithMandatoryTest() {
		System.out.println("deleteCampaginWithMandatoryTest executed ");
	}

}
