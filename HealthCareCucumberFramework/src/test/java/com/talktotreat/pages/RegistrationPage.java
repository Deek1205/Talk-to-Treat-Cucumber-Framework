package com.talktotreat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Register ']")
	WebElement registrationLink;
	
	@FindBy(name="FullName")
	WebElement patientName;
	
	@FindBy(name="MobileNo")
	WebElement mobileNo;
	
	@FindBy(name="EmailId")
	WebElement email;
	
	@FindBy(id="PatientAge")
	WebElement age;
	
	@FindBy(id="exampleFormControlSelect1")
	WebElement country;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(name="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="Remark")
	WebElement medicalProblem;
	
	@FindBy(className="btn btn-success succes-btn")
	WebElement RegisterBtn;

	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
      public void openUrl(String url) {
    	  driver.get(url);
		
	}
	
      public void click_registrationLink() {
    	  registrationLink.click();
 	 }
      
	 public void enter_Name(String name) {
		 patientName.sendKeys(name);
	 }
	 
	 public void enter_Mobileno(String mobileno) {
			
	 }
	 
	 public void enter_EmailId(String emailid) {
			
	 }
	 
	 public void enter_PatientAge(String patientage) {
			
	 }
	 
	 public void select_Country(String country) {
			
	 }
	 
	 public void enter_Password(String password) {
			
	 }
	 
	 public void enter_ConfirmPassword(String confirmpassword) {
			
	 }
	 
	 public void enter_MedicalProblem(String medicalproblem) {
			
	 }
	 
	 public void click_RegisterBut() {
			
	 }
}
