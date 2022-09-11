
Feature: verify   registration functionality
 
 
  Scenario Outline: Verify  registration  form with  valid TestData
   Given User open browzer
    And User open url
 
    Then  validate url open
     And User click on maxmize icon
    When  User click on registerLink
    Then User should redirect to registrationPage
    When User enter name "<Name>"
    And  User enter mobileNo "<MobileNum>"
    And User enter email"< Email>"
    And User enter patientage "<Age>"
    And User select country "<Country>"
    And User enter password "<Password>"
    And User enter confirmPassword "<ConfirmPassword>"
    And User enter medicalProblem "MedicalProblem"
    And  scrollbaar  down
    And User click on Register
    Then User should get confirmationMessage
    And page should redirected to confirmationPage
    
    Examples:
    | Name | MobileNum | Email| Age | Country | Password | ConfirmPassword | MedicalProblem |
		| Test123|2345678786|TestHealtaa@yopmail.com|65|+90 TURKEY|122345|122345|Astma|
  

 