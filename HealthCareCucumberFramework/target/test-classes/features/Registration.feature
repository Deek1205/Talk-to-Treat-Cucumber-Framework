Feature: Verify Registration Functionality

Scenario: Verify login with valid credentials
 Given User open browzer
    And User open url
    Then validate url open
    When User click on registerLink
    Then User should redirect to registrationPage
    When User enter name
    And  User enter mobileNo
    And User enter patientage
    And User select country
    And User enter password
    And User enter confirmPassword
    And User enter medicalProblem
    And User click on Register
    Then User should get confirmationMessage
    And page should redirected to confirmationPage