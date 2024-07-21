
Feature: Signup 
	
	
   Scenario Outline: verify Signup flow
    Given When user is on signup page
    Then Enter the firstName "<FirstName>"
    Then Enter the lastName "<LastName>"
    Then Enter the Email "<Email>"
    Then Enter the password "<Password>"
    Then Enter the confirm password "<confirmPassword>"
    And Click on create account button.

		Examples: 
		    |FirstName 	|LastName 		|Email 				|Password			|confirmPassword|
		    |pavan		|kumar			|pavani@mailnesia.com	|Pavan@123$			|Pavan@123$|	

  
    