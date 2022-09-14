package com.talktotreat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.util.PropertyReader;

public class LoginPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-warning ornagebutton']")
	WebElement loginbutton;

	@FindBy(name = "EmailId")
	WebElement emailId;

	@FindBy(name = "Password")
	WebElement password;

	@FindBy(xpath = "//button[@id='SignIn']")
	WebElement signBtn;

	@FindBy(xpath = "//h3[text()='Treatment Packages']")
	WebElement validateTextTreamtmentPackage;

	// when login done
	@FindBy(xpath="//span[@class='pro-user-name ml-1']")
	WebElement validateusername;

	@FindBy(xpath="//a[@href=\"/Login/Logout\"]")
	WebElement logout;
	
	@FindBy(xpath="//a[text()='Doctors']")
	WebElement DoctorLink;

          //construtor driver comeing from login page , becuase we use inint method from page dfactoiry
	   // login excution main get drivet ko call kiya hain put single class main java base , chek karayga yadee chrome driver
	// ka object to create karay nahee to nahee
	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void click_LoginBtn() {

		JavaBase.clickOn1(loginbutton, 30);

	}

	public void validate_loginUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("loginUrl"));
		System.out.println("login url done ");
	}

	public void enter_EmaiId() {
		//JavaBase.random_EmailId(emailId, 0, PropertyReader.getDataProperty("email"));
		JavaBase.sendkeys(emailId, 0, PropertyReader.getDataProperty("email"));
	}

	public void enter_Password() {
		JavaBase.sendkeys(password, 0, PropertyReader.getDataProperty("password"));

	}

	public void click_SignBtn() {

		JavaBase.clickOn(signBtn, 0);
	}

	public void validateHomePageUrl() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
	}

	
   public void clickon_doctorLink() {
	   JavaBase.clickOn(DoctorLink, 0);
   }



}
