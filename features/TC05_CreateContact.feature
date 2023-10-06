Feature: CreateContact functionlaity of Leaftap Application
  
	@Smoke
   Scenario: CreateContact with Positive Credential
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   Then Homepage should be displayed
   When Click on crmsfa link
   And Click on Contacts tab
   And Click on Create Contact Link
   And Enter the first name as 'Nihar345'
   And Enter the last name as 'Mohanty345'
   When Cick on Create Contact button
   Then Validate the view contact page with contact name as 'Nihar345 Mohanty345'
   
   