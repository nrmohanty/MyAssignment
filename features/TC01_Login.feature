Feature: Login functionlaity of Leaftap Application
  
//Background:
//Given Launch the browser
  //  And Load the URL
    
    @Smoke
   Scenario: Login with Positive Credential
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   Then Homepage should be displayed
    
    @Function
    Scenario: Login with Negative Credential
    And Enter the username as 'Demo'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   But Error message should be displayed