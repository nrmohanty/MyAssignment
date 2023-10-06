Feature: CreateLead functionlaity of Leaftap Application
  
	@Smoke
   Scenario Outline: CreateLead with Positive Credential
    And Enter the username as 'Demosalesmanager'
    And Enter the password as 'crmsfa'
    When Click on the Login button
   Then Homepage should be displayed
   When Click on crmsfa link
   And Click on Leads Link
   And Click CreateLead Link
   Given Enter the companyname as <companyname>
   And Enter the firstname as <firstname>
   And Enter the lastname as <lastname>
   When Click on submit button
   Then ViewLeadsPage should be displayed as <companyname>
   
   Examples: 
   |companyname|firstname|lastname|
   |TestLeaf|Subraja|S|
   |Quegle|Vidya|R|
   
    
   