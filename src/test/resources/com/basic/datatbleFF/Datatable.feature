Feature: Create account of Facebook
As a user u need to open facebook page and do the validation

Background: 
Given User need to be on facebook login page



Scenario: Validate Mobile Number field

When User enters user "Azeem" first name
When Enter following Data

|userName | UserSurname| Mobile|
|Aarifa   | Shaik      |3005   |
|Atheek   | Shaik      |1008   |
|Aayesha  | Shaik      |2212   |
|Azeem    | Shaik      |0412   |

