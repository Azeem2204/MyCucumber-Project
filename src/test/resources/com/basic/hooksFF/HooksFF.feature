Feature: Create account of Facebook
As a user u need to open facebook page and do the validation

Scenario: Validate First Name field
Given User need to be on facebook login page
When User enters user "Ammulu" first name
Then User checks user "Ammulu" first name is present



Scenario: Validate Mobile Number field
Given User need to be on facebook login page
When User enters user "Azeem" first name
And User enters user "Aayesha" surname
Then User checks user "Azeem" first name is present
But User mobile field should be blank
