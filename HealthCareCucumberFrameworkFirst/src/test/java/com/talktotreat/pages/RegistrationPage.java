package com.talktotreat.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.util.PropertyReader;

public class RegistrationPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Register ']")
	WebElement registrationLink;

	@FindBy(name = "FullName")
	WebElement patientName;

	@FindBy(name = "MobileNo")
	WebElement mobileNo;

	@FindBy(name = "EmailId")
	WebElement email;

	@FindBy(id = "PatientAge")
	WebElement age;

	@FindBy(id = "exampleFormControlSelect1")
	WebElement country;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(name = "ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(name = "Remark")
	WebElement medicalProblem;

	@FindBy(xpath = "//button[@class='btn btn-success succes-btn']")
	WebElement RegisterBtn;

	@FindBy(xpath = "//h2[text()='Thak you for connecting with us']")
	WebElement Message;

	@FindBy(xpath = "//a[@class='btn btn-warning ornagebutton']")
	WebElement loginBtn;

	

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void click_registrationLink() {
		registrationLink.click();
	}

	public void enter_Name(String value) {
		JavaBase.sendkeys(patientName, 0, value);
	}

	public void enter_MobileNo() {
		JavaBase.sendkeys(mobileNo, 0, PropertyReader.getDataProperty("mobileNo"));

	}

	public void enter_Email() {
		JavaBase.sendkeys(email, 0, PropertyReader.getDataProperty("email"));

	}

	public void enter_PatientAge() {

		JavaBase.sendkeys(age, 0, PropertyReader.getDataProperty("patientAge"));
	}

	public void select_country() {

		JavaBase.selectOptionFromDropdown(country, 2, "+91 INDIA");

	}

	public void enter_Password() {

		JavaBase.sendkeys(password, 0, PropertyReader.getDataProperty("password"));
	}

	public void enter_confrimPassword() {
		JavaBase.sendkeys(confirmPassword, 0, PropertyReader.getDataProperty("confirmPass"));

	}

	public void enter_medicalProlem() {
		JavaBase.sendkeys(medicalProblem, 0, PropertyReader.getDataProperty("medicalPro"));

	}

	public void clickOn_RegisterBtn() {

		JavaBase.clickOn(RegisterBtn, 30);
		
	}

	public void validateRedButton() {
		ValidateMethods.validateElement_IsDisplay(loginBtn, 30);
		
	}

	public void validate_ConfirmationPageUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("confirmUrl"));
		
	}



}
