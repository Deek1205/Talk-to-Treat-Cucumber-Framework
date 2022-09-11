package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.LoginPage;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginExcution {
	
	public WebDriver driver;
	public LoginPage objLoginPage;
	
	@When("User click on login button")
	public void user_click_on_login_button() {
		   //call driver single ton
		driver=JavaBase.getDriver();// call driver and send in loginpage .
		System.out.println("prittttt"+driver);
		objLoginPage = PageFactory.initElements(driver,LoginPage.class);
		objLoginPage.click_LoginBtn();
		 }
	@Then("validate login page url")
	public void validate_login_page_url() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("loginUrl"));
	}

	@When("User entered  emaili Id")
	public void user_entered_emaili_id() {
	   objLoginPage.enter_EmaiId();
	}

	@When("User entered Paswword")
	public void user_entered_paswword() {
	    objLoginPage.enter_Password();
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() {
	    objLoginPage.click_SignBtn();
	}

	@Then("validate home page url")
	public void validate_home_page_url() {
	    objLoginPage.validateHomePageUrl();
	}

	@And("validate text Treament package")
	public void validate_text_Treament_package() {
	       // objLoginPage.validateText_treamantPackage();;
	}
	

}
