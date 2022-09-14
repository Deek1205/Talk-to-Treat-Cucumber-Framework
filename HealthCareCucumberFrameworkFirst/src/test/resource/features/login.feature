@mustRun
Feature: Verify Login and Logout


Background:
    When User click on login button
    When User entered  emaili Id
    And User entered Paswword
    And User click on sign in button

  @Smoke
  Scenario: Verify login with  valid credentials
      Then validate login page url
      Then validate home page url
      And validate text Treament package
    
   @Smoke
  Scenario: Verify doctor appoitment functionality
       Then user click on doctor Link
       Then Scroll the page    
    
   # Scenario: Verify logout
    #When User mousehover on mail dropdown link
   # And click on log out link 
   # Then validate link name Login 
    
    
    
   
