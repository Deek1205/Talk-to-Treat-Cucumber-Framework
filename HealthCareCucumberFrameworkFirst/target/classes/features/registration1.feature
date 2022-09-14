
Feature: verify   registration functionality
 
 
  Scenario Outline: Verify  registration  form with  valid TestData
   Given User start application 
    Then  validate url 
    When  click registerLink
   # Then User should redirect to registrationPage
  When User enter name "<Name>"
   And  User enter mobileNo "<MobileNum>"
    And User enter emailID "<Email>"
   And User enter patientage "<Age>"
   And User select country "<Country>"
   And User enter password "<Password>"
   And User enter confirmPassword "<ConfirmPassword>"
   And User enter medicalProblem "MedicalProblem"
    And  scrollbaardown
    And User click on Register
    #Then User should get confirmationMessage
   # And page should redirected to confirmationPage
    
    Examples:
    | Name | MobileNum | Email| Age | Country | Password | ConfirmPassword | MedicalProblem |
		| Testuser|7854213698|Testcucumber@yopmail.com|66|+91 INDIA|12234|12234|Sugar|
    | TestVendor|9654874512|Testvendor@yopmail.com|55|+91 INDIA|123|123|Asthma|
    | TestAdmin|8852103645|Testadmin@yopmail.com|45|+91 INDIA|12356|12356|blood preasur|
 