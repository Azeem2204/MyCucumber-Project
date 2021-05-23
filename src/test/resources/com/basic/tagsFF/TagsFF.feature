@Important
Feature: Create account of Facebook
As a user u need to open facebook page and do the validation

@Smoke
Scenario: Validate First Name field1
Given User need to be on facebook login page
When User enters user "Keerthi" first name
Then User checks user "Keerthi" first name is present



@Smoke  @Regression
Scenario: Validate Mobile Number field2
Given User need to be on facebook login page
When User enters user "Azeem" first name
And User enters user "Aayesha" surname
Then User checks user "Azeem" first name is present
But User mobile field should be blank




Scenario: Validate First Name field3
Given User need to be on facebook login page
When User enters user "Ammulu" first name
Then User checks user "Ammulu" first name is present


@Smoke
Scenario: Validate First Name field4
Given User need to be on facebook login page
When User enters user "Atheek" first name
Then User checks user "Atheek" first name is present



@Regression
Scenario: Validate First Name field5
Given User need to be on facebook login page
When User enters user "Aarifa" first name
Then User checks user "Aarifa" first name is present
