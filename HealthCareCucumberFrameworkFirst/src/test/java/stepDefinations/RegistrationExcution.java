package stepDefinations;

//import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.talktotreat.base.JavaBase;
import com.talktotreat.base.ValidateMethods;
import com.talktotreat.pages.RegistrationPage;
import com.talktotreat.util.PropertyReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationExcution {
	public WebDriver driver;
	public static RegistrationPage registrationPageObj;

	@Given("User open browzer")
	public void user_open_browzer() {
		driver = JavaBase.getDriver();

	}

	@And("User open url")
	public void user_open_url() {
		registrationPageObj = PageFactory.initElements(driver, RegistrationPage.class);
		registrationPageObj.openUrl(PropertyReader.getConfigProperty("url"));

	}

	@Then("validate url open")
	public void validate_url_open() {

		ValidateMethods.validateUrl(PropertyReader.getDataProperty("mainUrl"));// testng asstion

	}

	@Then("User click on maxmize icon")
	public void user_click_on_maxmize_icon() {
		JavaBase.maxmizeWindow();
	}

	@When("User click on registerLink")
	public void User_click_on_registerLink() {
		registrationPageObj.click_registrationLink();
	}

	@Then("User should redirect to registrationPage")
	public void User_should_redirect_to_registrationPage() {
		ValidateMethods.validateUrl(PropertyReader.getDataProperty("RegistrationUrl"));

	}

	@When("User enter name")
	public void user_enter_name() {
		registrationPageObj.enter_Name(PropertyReader.getDataProperty("name"));

	}

	@And("User enter mobileNo")
	public void user_enter_mobile_no() {
		//registrationPageObj.enter_MobileNo();
	}

	@And("User enter email")
	public void User_enter_email() {
		//registrationPageObj.enter_Email();
	}

	@And("User enter patientage")
	public void user_enter_patientage() {
		//registrationPageObj.enter_PatientAge();
	}

	@And("User select country")
	public void user_select_country() {

		//registrationPageObj.select_country();

	}

	@And("User enter password")
	public void user_enter_password() {
		//registrationPageObj.enter_Password();
	}

	@And("User enter confirmPassword")
	public void user_enter_confirm_password() {
		//registrationPageObj.enter_confrimPassword();
	}

	@And("User enter medicalProblem")
	public void user_enter_medical_problem() {
		//registrationPageObj.enter_medicalProlem();
	}

	@And("scrollbaar  down")
	public void scrollbaar_down() {
		//JavaBase.scrollDown(70);

	}

	@And("User click on RegisterBtn")
	public void user_click_on_RegisterBtn() {
		//registrationPageObj.clickOn_RegisterBtn();
	}

	@Then("validate loginRed button present on the page")
	public void validate_loginRed_button_present_on_the_page() {
		registrationPageObj.validateRedButton();
	}

	@And("page should redirected to confirmationPage")
	public void page_should_redirected_to_confirmation_page() {
		registrationPageObj.validate_ConfirmationPageUrl();
		System.out.println("Confirmation url done ");
	}

//	
//
}
