Feature: Create account of Facebook
As a user u need to open facebook page and do the validation

Scenario: Validate First Name field
Given User need to be on facebook login page
When User enters user first name
Then User checks user first name is present
Then close browser



Scenario: Validate Mobile Number field
Given User need to be on facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present
But User mobile field should be blank
Then close browser