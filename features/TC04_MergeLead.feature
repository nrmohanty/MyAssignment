Feature: MergeLead functionlaity of Leaftap Application
  
	@Smoke
   Scenario: MergeLead with Positive Credential
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   Then Homepage should be displayed
   When Click on crmsfa link
   And Click on Leads Link
   And Click on Merge leads Link
   When Click on From Lookup Image
   Then Switch to FindLeads popup window for FromLookup
   And Enter the first name as 'Sasi' for FromLookup
   And Click on Find leads button for FromLookup
   When Cick on First Searched Lead Link for FromLookup
   Then Switch to Merge Leads page from FromLookup popup window
   When Click on To Lookup Image
   Then Switch to FindLeads popup window for ToLookup
   And Enter the first name as 'Santhosh' for ToLookup
   And Click on Find leads button for ToLookup
   When Cick on First Searched Lead Link for ToLookup
   Then Switch to Merge Leads page from ToLookup popup window
   When Click on Merge Button and Accept the Alert
   Then Verify the Mergred Lead is not shown in FindLeads searched action.
   
  
    
   