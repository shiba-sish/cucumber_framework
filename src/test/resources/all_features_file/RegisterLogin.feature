Feature: Register and login feature
  As a user we need to open an account in ecoders application

  
  Scenario: validate the registration process
    Given The user has to be in register page
    When user enter the username
    And user enter the password
    And user clicks the register button
    Then the user should be navigated to login page of ecoders application


  Scenario: Checking Login functionality with valide credential
    Given The user should be in login page
    When enter valide username to username text field
    And enter valide password to password text field
    And click the sing in button
    Then user should be navigated to dashboard page

  #Scenario: Checking Login functionality with invalide credential
    #Given The user should be in login page
    #When enter invalide username to username text field
    #And enter invalide password to password text field
    #And click the sing in button
    #Then user should not be navigated to dashboard page

 