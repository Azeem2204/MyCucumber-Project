Feature: Create account of Facebook
As a user u need to open facebook page and do the validation


Scenario Outline: Validate Create user multiple fields
Given User need to be on facebook login page
When User enters user "<FName>" first name
And User enters user "<LName>" surname
Then User checks user "<FName>" first name is present
Then close browser

Examples:
|FName  | LName|
|Azeem  | Shaik|
|Aayesha| Shaik|
|Aarifa | Shaik|