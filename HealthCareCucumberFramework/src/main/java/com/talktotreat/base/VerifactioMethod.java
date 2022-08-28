package com.talktotreat.base;

import org.junit.Assert;

import org.testng.asserts.SoftAssert;
//import static org.assertj.core.api.Assertions.assertThat;

public class VerifactioMethod extends JavaBase {

	// Hard assert from junit
//	public  static void verifyUrl(String expectUrl) {
//		String saveCurrentUrl =driver.getCurrentUrl();
//		 System.out.println("print expectUrl ----> "+expectUrl);
//		  Assert.assertEquals("asserfail",expectUrl, saveCurrentUrl);
//	}
	
	// Soft Assert fron TestNG
//	public  static void verifyUrl(String expectUrl) {
//		
//		String saveCurrentUrl =driver.getCurrentUrl();
//		 System.out.println("print expectUrl ----> "+expectUrl);
//		 SoftAssert	soft=new SoftAssert();
//		  soft.assertEquals(saveCurrentUrl,expectUrl);
//		  soft.assertAll();
//	}
	
	// Soft assert of junit using api- AssertThat-assertj-core<
	public void verifyUrl(String expectUrl) {
//		String saveCurrentUrl =driver.getCurrentUrl();
//		System.out.println("print"+ saveCurrentUrl);
//		asserThat(saveCurrentUrl).isEqualTo(expectUrl);
	}
	
}