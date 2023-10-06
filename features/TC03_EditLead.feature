Feature: EditLead functionlaity of Leaftap Application
  
	@Smoke
   Scenario: EditLead with Positive Credential
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   Then Homepage should be displayed
   When Click on crmsfa link
   And Click on Leads Link
   And Click on Find leads Link
   And Click on Phone tab
   And Enter the phone no as '12'
   And Click on Find Leads button
   And Cick on First Searched Lead Link
   And Click on Edit Link
   And Clear the text in Company Name
   Given Enter the Company Name as 'TestLeaf'
   When Click on Update Button
   Then Verify the Company Name is shown as 'TestLeaf' in the View Lead page.
   
  
    
   