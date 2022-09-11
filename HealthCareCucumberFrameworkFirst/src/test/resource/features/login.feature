Feature: Verify Login and Logout

  Scenario: Verify login with  valid credentials
    When User click on login button
    Then validate login page url
    When User entered  emaili Id
    And User entered Paswword
    And User click on sign in button
    Then validate home page url
    And validate text Treament package
    And validate 
    
   # Scenario: Verify logout
    #When User mousehover on mail dropdown link
   # And click on log out link 
   # Then validate link name Login 
    
    
    
   
