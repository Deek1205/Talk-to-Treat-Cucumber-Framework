package stepDefinations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.VerifactioMethod;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationExecution {
	
	public WebDriver driver;
	
	public static RegistrationPage registrationPageobj;
	
	
	@Given("User open browzer")
	public void user_open_browzer() {
	   driver=JavaBase.browzerSetup() ;
	}

	@And("User open url")
	public void user_open_url() {
		registrationPageobj = PageFactory.initElements(driver,RegistrationPage.class);
		registrationPageobj.openUrl( PropertyReader.getConfigProperty( "url"));
	}
	
	@Then("validate url open")
	public void validate_url_open()  {
		//VerifactioMethod.verifyUrl(PropertyReader.getDataProperty("mainUrl"));
		String saveCurrentUrl =driver.getCurrentUrl();
		System.out.println("print"+ saveCurrentUrl);
		assertThat(saveCurrentUrl).isEqualTo(PropertyReader.getDataProperty("mainUrl"));
	}
	
	@When("User click on registerLink")
	public void user_click_on_register_link() {
		registrationPageobj.click_registrationLink();
		
	}
	
	@Then("User should redirect to registrationPage")
	public void User_should_redirect_to_registrationPage() {
		
	  //VerifactioMethod.verifyUrl(PropertyReader.getDataProperty("RegistrationUrl"));
	}

	@When("User enter name")
	public void user_enter_name() {
	  // registrationPageobj.enter_Name( PropertyReader.getDataProperty("name")); 
	}

	@And("User enter mobileNo")
	public void user_enter_mobile_no() {
	   
	}

	@And("User enter patientage")
	public void user_enter_patientage() {
	  
	}

	@And("User select country")
	public void user_select_country() {
	   
	}

	@And("User enter password")
	public void user_enter_password() {
	    
	}

	@And("User enter confirmPassword")
	public void user_enter_confirm_password() {
	   
	}

	@And("User enter medicalProblem")
	public void user_enter_medical_problem() {
	   
	}

	@And("User click on Register")
	public void user_click_on_register() {
	    
	}

	@Then("User should get confirmationMessage")
	public void user_should_get_confirmation_message() {
	    
	}

	@And("page should redirected to confirmationPage")
	public void page_should_redirected_to_confirmation_page() {
	  
	}


	

}
