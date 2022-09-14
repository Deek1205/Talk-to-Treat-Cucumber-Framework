package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registration1 {
	
	public WebDriver driver;
	public static RegistrationPage registrationPageObj;
	
	@Given("User start application")
	public void user_start_application() {
	   driver=JavaBase.getDriver();
	  // driver.get(url);
	 //  driver.get( PropertyReader.getDataProperty("mainUrl"));
	   
	   
	}
	
	@Then("validate url")
	public void validate_url(){
		registrationPageObj = PageFactory.initElements(driver, RegistrationPage.class);
				registrationPageObj.openUrl(PropertyReader.getConfigProperty("url"));
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));
		
		
	}
	
	@When("click registerLink")
	public void click_registerLink() {
		//registrationPageObj = PageFactory.initElements(driver, RegistrationPage.class);
		registrationPageObj.click_registrationLink();
	}

	@When("User enter name {string}")
	public void user_enter_name(String name) {
		registrationPageObj.enter_Name(name);
	    
	}

	@When("User enter mobileNo {string}")
	public void user_enter_mobile_no(String MobileNumber) {
		registrationPageObj.enter_MobileNo(MobileNumber);
	    
	}
	
	@When("User enter emailID {string}")
	public void user_enter_email_id(String email) {
		registrationPageObj.enter_Email(email);
	}
	

	@When("User enter patientage {string}")
	public void user_enter_patientage(String age) {
		registrationPageObj.enter_PatientAge(age);
	    
	}

	@When("User select country {string}")
	public void user_select_country(String countr) {
		registrationPageObj.select_country(countr);
	}

	@When("User enter password {string}")
	public void user_enter_password(String Passw) {
	    registrationPageObj.enter_Password(Passw);
	}

	@When("User enter confirmPassword {string}")
	public void user_enter_confirm_password(String ConfrPass) {
	    registrationPageObj.enter_confrimPassword(ConfrPass);
	}

	@When("User enter medicalProblem {string}")
	public void user_enter_medical_problem(String medicalproblem) {
	    registrationPageObj.enter_medicalProlem(medicalproblem);
	}

	@And("scrollbaardown")
	public void scrollbaardown() {
		JavaBase.scrollDown(70);

	}
	@When("User click on Register")
	public void user_click_on_register() {
	   registrationPageObj.clickOn_RegisterBtn(); 
	}
	
	
	

}
